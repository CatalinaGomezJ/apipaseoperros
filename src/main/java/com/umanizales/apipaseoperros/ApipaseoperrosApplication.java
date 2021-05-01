package com.umanizales.apipaseoperros;

import com.umanizales.apipaseoperros.model.Empleado;
import com.umanizales.apipaseoperros.model.Perro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApipaseoperrosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApipaseoperrosApplication.class, args);
    }
    
    Perro perrito = new Perro("firulais", "3030", "bigol");



}
