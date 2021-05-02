package com.umanizales.apipaseoperros.model.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Perro implements Serializable {
    private String codigo;
    private String nombre;
    private short edad;
    private List<PaseoPerro> paseoPerrosByCodigo;

    @Id
    @Column(name = "codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "edad")
    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Perro perro = (Perro) o;

        if (edad != perro.edad) return false;
        if (codigo != null ? !codigo.equals(perro.codigo) : perro.codigo != null) return false;
        if (nombre != null ? !nombre.equals(perro.nombre) : perro.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codigo != null ? codigo.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (int) edad;
        return result;
    }

    @OneToMany(mappedBy = "perro")
    public List<PaseoPerro> getPaseoPerrosByCodigo() {
        return paseoPerrosByCodigo;
    }

    public void setPaseoPerrosByCodigo(List<PaseoPerro> paseoPerrosByCodigo) {
        this.paseoPerrosByCodigo = paseoPerrosByCodigo;
    }
}
