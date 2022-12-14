package com.concesionario.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Continente {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String codigo;
    private String descripcion;
    private int estado;
}
