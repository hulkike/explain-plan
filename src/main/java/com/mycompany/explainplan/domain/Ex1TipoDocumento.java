package com.mycompany.explainplan.domain;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "ex1_tipo_documento", schema = "public", catalog = "explain")
public class Ex1TipoDocumento {
    private String sigla;
    private String nombre;
    private Collection<Ex1Cliente> ex1Clientes;

    @Id
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
        Ex1TipoDocumento that = (Ex1TipoDocumento) o;
        return Objects.equals(sigla, that.sigla) &&
                Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sigla, nombre);
    }

    @OneToMany(mappedBy = "tipoDocumento")
    public Collection<Ex1Cliente> getEx1Clientes() {
        return ex1Clientes;
    }

    public void setEx1Clientes(Collection<Ex1Cliente> ex1ClientesBySigla) {
        this.ex1Clientes = ex1Clientes;
    }
}
