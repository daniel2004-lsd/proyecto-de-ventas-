        package sena.crudbasic.Controllers;

        import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.*;

        import sena.crudbasic.Dto.CustomersDto;
        import sena.crudbasic.Dto.ResponseDto;
        import sena.crudbasic.service.CustomersService;

        @RestController
        @RequestMapping("/api/customers")
        public class CustomersControllers {

            @Autowired
            private CustomersService service;

            @PostMapping("")
            public ResponseEntity<ResponseDto<CustomersDto>> save(@RequestBody CustomersDto customersDto) {
                try {
                    return ResponseEntity.status(HttpStatus.CREATED)
                            .body(new ResponseDto<>(true, "Cliente creado correctamente", service.save(customersDto)));
                } catch (RuntimeException exception) {
                    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                            .body(new ResponseDto<>(false, exception.getMessage(), null));
                }
            }

            @PutMapping("/{id}")
            public ResponseEntity<ResponseDto<CustomersDto>> update(@PathVariable int id, @RequestBody CustomersDto customersDto) {
                try {
                    CustomersDto updated = service.update(id, customersDto);

                    if (updated == null) {
                        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                .body(new ResponseDto<>(false, "El cliente no existe", null));
                    }

                    return ResponseEntity.ok(new ResponseDto<>(true, "Cliente actualizado", updated));

                } catch (RuntimeException exception) {
                    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                            .body(new ResponseDto<>(false, exception.getMessage(), null));
                }
            }

            @DeleteMapping("/{id}")
            public ResponseEntity<ResponseDto<CustomersDto>> delete(@PathVariable int id) {
                if (service.delete(id)) {
                    return ResponseEntity.ok(new ResponseDto<>(true, "Cliente eliminado correctamente", null));
                } 
                    return ResponseEntity.status(HttpStatus.NOT_FOUND)
                            .body(new ResponseDto<>(false, "El cliente no existe", null));
            }

            @GetMapping("")
             public ResponseEntity<ResponseDto<List<CustomersDto>>> findAll() {
                return ResponseEntity.ok(new ResponseDto<>(true, "Lista de clientes", service.findAll()));
            }

            @GetMapping("/{id}")
             public ResponseEntity<ResponseDto<CustomersDto>> findById(@PathVariable int id) {
                CustomersDto dto = service.findById(id);

                if (dto == null) {
                    return ResponseEntity.status(HttpStatus.NOT_FOUND)
                            .body(new ResponseDto<>(false, "No se encontró el cliente", null));
                }

                return ResponseEntity.ok(new ResponseDto<>(true, "Cliente encontrado", dto));
            }
        }
