package com.umanizales.apipaseoperros.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Perro implements Serializable {
    private String nombre;
    private String identificacion;
    private String raza;
}
