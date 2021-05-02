package com.umanizales.apipaseoperros.model.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tipo_usuario", schema = "public", catalog = "paseoperros")
public class TipoUsuario implements Serializable {
    private short codigo;
    private String descripcion;
    private List<Usuario> usuariosByCodigo;

    @Id
    @Column(name = "codigo")
    public short getCodigo() {
        return codigo;
    }

    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoUsuario that = (TipoUsuario) o;

        if (codigo != that.codigo) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) codigo;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tipoUsuario")
    public List<Usuario> getUsuariosByCodigo() {
        return usuariosByCodigo;
    }

    public void setUsuariosByCodigo(List<Usuario> usuariosByCodigo) {
        this.usuariosByCodigo = usuariosByCodigo;
    }
}
