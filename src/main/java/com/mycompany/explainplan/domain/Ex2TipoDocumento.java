package com.mycompany.explainplan.domain;

import lombok.Builder;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "ex2_tipo_documento", schema = "public", catalog = "explain")
public class Ex2TipoDocumento {
    private Integer id;
    private String sigla;
    private String nombre;
    private Collection<Ex2Cliente> ex2ClientesById;

    public Ex2TipoDocumento() {
    }

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sigla")
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ex2TipoDocumento that = (Ex2TipoDocumento) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(sigla, that.sigla) &&
                Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sigla, nombre);
    }

    @OneToMany(mappedBy = "ex2TipoDocumentoByIdTipoDocumento")
    public Collection<Ex2Cliente> getEx2ClientesById() {
        return ex2ClientesById;
    }

    public void setEx2ClientesById(Collection<Ex2Cliente> ex2ClientesById) {
        this.ex2ClientesById = ex2ClientesById;
    }
}
