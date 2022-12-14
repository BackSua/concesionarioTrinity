package com.concesionario.Service;

import com.concesionario.Dto.ContinentePaisDTO;
import com.concesionario.Entity.Continente;
import com.concesionario.Entity.Pais;

import java.util.List;

public interface ContinenteService {

    List<Continente> listar();

    Continente agregar (Continente continente);

    Continente listarId (int id);

    Continente actualizar (Continente continente, int id);

    Continente eliminar (int id);

}
