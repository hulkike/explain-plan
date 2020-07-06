package com.mycompany.explainplan.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ex1_cliente", schema = "public", catalog = "explain")
public class Ex1Cliente {
    @EmbeddedId
    protected Ex1ClientePK ex1ClientePK;
    private String nombres;
    private String apellidos;

    @ManyToOne
    @JoinColumn(name = "sigla", referencedColumnName = "sigla", insertable = false, updatable = false)
    private Ex1TipoDocumento tipoDocumento;

    public Ex1ClientePK getEx1ClientePK() {
        return ex1ClientePK;
    }

    public void setEx1ClientePK(Ex1ClientePK ex1ClientePK) {
        this.ex1ClientePK = ex1ClientePK;
    }

    @Basic
    @Column(name = "nombres")
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Basic
    @Column(name = "apellidos")
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ex1Cliente that = (Ex1Cliente) o;
        return Objects.equals(nombres, that.nombres) &&
               Objects.equals(apellidos, that.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombres, apellidos);
    }


    public Ex1TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(Ex1TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}
