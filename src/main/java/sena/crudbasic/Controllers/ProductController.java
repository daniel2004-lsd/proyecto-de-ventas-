package sena.crudbasic.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import sena.crudbasic.Dto.ProductDto;
import sena.crudbasic.Dto.ResponseDto;
import sena.crudbasic.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("")
    public ResponseEntity<ResponseDto> save(@RequestBody ProductDto productDto) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(new ResponseDto(true, "Producto creado correctamente", service.save(productDto)));
        } catch (RuntimeException exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ResponseDto(false, exception.getMessage(), null));
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseDto> update(@PathVariable int id, @RequestBody ProductDto productDto) {
        try {
            ProductDto updated = service.update(id, productDto);

            if (updated == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(new ResponseDto(false, "El producto no existe", null));
            }

            return ResponseEntity.ok(new ResponseDto(true, "Producto actualizado", updated));

        } catch (RuntimeException exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ResponseDto(false, exception.getMessage(), null));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto> delete(@PathVariable int id) {
        if (service.delete(id)) {
            return ResponseEntity.ok(new ResponseDto(true, "Producto eliminado correctamente", null));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ResponseDto(false, "El producto no existe", null));
        }
    }

    @GetMapping("")
    public ResponseEntity<ResponseDto> findAll() {
        return ResponseEntity.ok(new ResponseDto(true, "Lista de productos", service.findAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> findById(@PathVariable int id) {
        ProductDto dto = service.findById(id);

        if (dto == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ResponseDto(false, "Producto no encontrado", null));
        }

        return ResponseEntity.ok(new ResponseDto(true, "Producto encontrado", dto));
    }
}
