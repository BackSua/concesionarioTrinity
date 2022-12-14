package com.concesionario.Repository;

import com.concesionario.Dto.ContinentePaisDTO;
import com.concesionario.Entity.Continente;
import com.concesionario.Entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContinenteRepository extends JpaRepository<Continente, Integer> {

}
