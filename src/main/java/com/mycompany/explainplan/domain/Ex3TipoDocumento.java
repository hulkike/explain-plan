package com.mycompany.explainplan.domain;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "ex3_tipo_documento", schema = "public", catalog = "explain")
public class Ex3TipoDocumento {
    private Integer id;
    private String sigla;
    private String nombre;
    private Collection<Ex3Cliente> ex3ClientesById;

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
        Ex3TipoDocumento that = (Ex3TipoDocumento) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(sigla, that.sigla) &&
                Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sigla, nombre);
    }

    @OneToMany(mappedBy = "ex3TipoDocumentoByIdTipoDocumento")
    public Collection<Ex3Cliente> getEx3ClientesById() {
        return ex3ClientesById;
    }

    public void setEx3ClientesById(Collection<Ex3Cliente> ex3ClientesById) {
        this.ex3ClientesById = ex3ClientesById;
    }
}
