package com.concesionario.Service.Impl;

import com.concesionario.Entity.Pais;
import com.concesionario.Repository.PaisRepository;
import com.concesionario.Service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisServiceImpl implements PaisService {

    @Autowired
    PaisRepository repository;


    @Override
    public List<Pais> listar() {
        try{
            List<Pais> paises = repository.findAll();
            if (paises.isEmpty()){
                return null;
            }
            return paises;
        }catch (Exception e){

        }
        return null;
    }

    @Override
    public Pais agregar(Pais pais) {
        try{
            if (pais !=null){
                Pais paises = new Pais();
                paises.setCodigo(paises.getCodigo());
                paises.setDescripcion(pais.getDescripcion());
                paises.setEstado(paises.getEstado());
                paises.setContinente(paises.getContinente());

                Pais paisNew = repository.save(pais);

                return pais;
            }
            return null;
        }catch (Exception e){
            System.out.println("Error"+e);
        }
        return null;
    }

    @Override
    public Pais listarId(int id) {
        try{
            Pais pais = repository.findById(id).orElse(null);
            if (pais == null){
                return null;
            }
            return pais;
        }catch (Exception e){
            System.out.println("Error"+e);
        }
        return null;
    }

    @Override
    public Pais actualizar(Pais pais, int id) {
        try {
            var PaisExiste = repository.findById(id).get();
            PaisExiste.setCodigo(pais.getCodigo());
            PaisExiste.setDescripcion(pais.getDescripcion());
            PaisExiste.setEstado(pais.getEstado());
            PaisExiste.setContinente(pais.getContinente());

            repository.save(PaisExiste);

            return pais;
        }catch (Exception e){
            System.out.println("Error"+e);

        }
        return null;
    }

    @Override
    public Pais eliminar(int id) {
        try {
            repository.deleteById(id);
        }catch (Exception e){
            System.out.println("Error"+e);
        }
        return null;
    }
}
