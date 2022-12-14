package com.concesionario.Dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ContinentePaisDTO implements Serializable {

    private String nombrePais;
    private int estado;

}
