package com.concesionario.Service.Impl;

import com.concesionario.Entity.Continente;
import com.concesionario.Repository.ContinenteRepository;
import com.concesionario.Service.ContinenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinenteServiceImpl implements ContinenteService {

    @Autowired
    ContinenteRepository repository ;

    @Override
    public List<Continente> listar() {
        try{
            List<Continente> continentes = repository.findAll();
            if (continentes.isEmpty()){
                return null;
            }
            return continentes;
        }catch (Exception e){
            System.out.println("Error"+e);
        }
        return null;
    }

    @Override
    public Continente agregar(Continente continente) {
        try{
            if(continente != null){

                Continente continentes = new Continente();
                continentes.setCodigo(continentes.getCodigo());
                continentes.setDescripcion(continentes.getDescripcion());
                continentes.setEstado(continentes.getEstado());
                Continente continenteNew = repository.save(continente);

                return continente;
            }
            return null;

        }catch (Exception e){
            System.out.println("Error"+e);
        }
        return null;
    }

    @Override
    public Continente listarId(int id) {
        try{
            Continente continente = repository.findById(id).orElse(null);
            if(continente==null){
                return null;
            }
            return continente;
        }catch (Exception e){
            System.out.println("Error"+e);
        }
        return null;
    }

    @Override
    public Continente actualizar(Continente continente, int id) {
        try{
            var ContinenteExiste = repository.findById(id).get();
            ContinenteExiste.setCodigo(continente.getCodigo());
            ContinenteExiste.setDescripcion(continente.getDescripcion());
            ContinenteExiste.setEstado(continente.getEstado());
            repository.save(ContinenteExiste);
            return new Continente();
        }catch (Exception e){
            System.out.println("Error"+e);
        }
        return null;
    }

    @Override
    public Continente eliminar(int id) {
        try{
            repository.deleteById(id);
        }catch (Exception e){
            System.out.println("Error"+e);
        }
        return null;
    }

}
