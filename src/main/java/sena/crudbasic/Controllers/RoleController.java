package sena.crudbasic.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sena.crudbasic.Dto.CustomersDto;
import sena.crudbasic.Dto.ResponseDto;
import sena.crudbasic.Dto.RoleDto;
import sena.crudbasic.service.RoleService;

@RestController
@RequestMapping("/api/role")
public class RoleController {

    @Autowired
    private RoleService service;

    @PostMapping("")
    public ResponseEntity<ResponseDto<RoleDto>> save(@RequestBody RoleDto role) {
        try {
            RoleDto saved = service.save(role);
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(new ResponseDto<>(true, "Role creado correctamente ", saved));

        } catch (RuntimeException exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ResponseDto<>(false, exception.getMessage(), null));
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseDto<RoleDto>> update(@PathVariable int id , RoleDto roleDto){
        try{
            RoleDto update = service.update(id, roleDto);
            if (update== null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ResponseDto<>(false,"el rol no existe", null));

            }

            return ResponseEntity.ok(new ResponseDto<>(true,"rol actualizado", update));
            
        }catch (RuntimeException exception ){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
            .body(new ResponseDto<>(false,exception.getMessage(),null));
        }
    }

    @GetMapping("")

    public ResponseEntity<ResponseDto<List<RoleDto>>> findAll(){
        return ResponseEntity.ok(new ResponseDto<>(true, "lista de roles: ", service.findAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto<RoleDto>> findById(@PathVariable int id){
        RoleDto dto = service.findById(id);
        if (dto == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body(new ResponseDto<>(false, "no se encontro el rol: ", null));
        }
        return ResponseEntity.ok(new ResponseDto<>(true, "rol encontrado", dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDto<RoleDto>> delete(@PathVariable int id){
        if (service.delete(id)) {
            return ResponseEntity.ok( new ResponseDto<>(false , "rol eliminado correctamente", null));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
        .body(new ResponseDto<>(false, "el rol no existe: " , null));
    }

}
