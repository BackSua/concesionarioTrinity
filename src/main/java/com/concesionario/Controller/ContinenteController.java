package com.concesionario.Controller;

import com.concesionario.Dto.ContinentePaisDTO;
import com.concesionario.Entity.Continente;
import com.concesionario.Entity.Pais;
import com.concesionario.Service.ContinenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/continente")
public class ContinenteController {

    @Autowired
    ContinenteService service;

    @GetMapping
    public List<Continente> listar (){
        return service.listar();
    }

    @PostMapping
    public Continente agregar (@RequestBody Continente continente){
        return service.agregar(continente);
    }

    @GetMapping("{id}")
    public Continente listarId (@PathVariable ("id")int id){
        return service.listarId(id);
    }

}
