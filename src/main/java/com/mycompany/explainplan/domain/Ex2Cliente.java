package com.mycompany.explainplan.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ex2_cliente", schema = "public", catalog = "explain")
public class Ex2Cliente {
    private Integer id;
    private String numeroDocumento;
    private String nombres;
    private String apellidos;
    private Ex2TipoDocumento ex2TipoDocumentoByIdTipoDocumento;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "numero_documento")
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
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
        Ex2Cliente that = (Ex2Cliente) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(numeroDocumento, that.numeroDocumento) &&
                Objects.equals(nombres, that.nombres) &&
                Objects.equals(apellidos, that.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numeroDocumento, nombres, apellidos);
    }

    @ManyToOne
    @JoinColumn(name = "id_tipo_documento", referencedColumnName = "id", nullable = false)
    public Ex2TipoDocumento getEx2TipoDocumentoByIdTipoDocumento() {
        return ex2TipoDocumentoByIdTipoDocumento;
    }

    public void setEx2TipoDocumentoByIdTipoDocumento(Ex2TipoDocumento ex2TipoDocumentoByIdTipoDocumento) {
        this.ex2TipoDocumentoByIdTipoDocumento = ex2TipoDocumentoByIdTipoDocumento;
    }
}
