package com.concesionario.Controller;

import com.concesionario.Entity.Pais;
import com.concesionario.Service.PaisService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class PaisController {

    @Autowired
    PaisService service ;

    @GetMapping
    public List<Pais> listar (){
        return service.listar();
    }

    @PostMapping()
    public Pais agregar (@RequestBody Pais pais){
        return service.agregar(pais);
    }

    @GetMapping("{id}")
    public Pais listarId (@PathVariable ("id")int id){
        return service.listarId(id);
    }

    @PutMapping("{id}")
    public Pais actualizar (@RequestBody Pais pais,@PathVariable ("id") int id){
        return service.actualizar(pais, id);
    }

    @DeleteMapping("{id}")
    public Pais eliminar (@PathVariable ("id")int id){
        return service.eliminar(id);
    }
}
