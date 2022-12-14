package com.concesionario.Service;


import com.concesionario.Entity.Continente;
import com.concesionario.Entity.Pais;

import java.util.List;

public interface PaisService {

    List<Pais> listar ();

    Pais agregar (Pais pais);

    Pais listarId (int id);

    Pais actualizar(Pais pais, int id);

    Pais eliminar (int id);


}
