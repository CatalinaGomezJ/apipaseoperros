package com.umanizales.apipaseoperros.model.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Usuario implements Serializable {
    private int id;
    private String correo;
    private String contrasenia;
    private List<PaseoPerro> paseoPerrosById;
    private TipoUsuario tipoUsuario;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "correo")
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Basic
    @Column(name = "contrasenia")
    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        if (id != usuario.id) return false;
        if (correo != null ? !correo.equals(usuario.correo) : usuario.correo != null) return false;
        if (contrasenia != null ? !contrasenia.equals(usuario.contrasenia) : usuario.contrasenia != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (correo != null ? correo.hashCode() : 0);
        result = 31 * result + (contrasenia != null ? contrasenia.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "paseador")
    public List<PaseoPerro> getPaseoPerrosById() {
        return paseoPerrosById;
    }

    public void setPaseoPerrosById(List<PaseoPerro> paseoPerrosById) {
        this.paseoPerrosById = paseoPerrosById;
    }

    @ManyToOne
    @JoinColumn(name = "tipo_usuario", referencedColumnName = "codigo", nullable = false)
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
