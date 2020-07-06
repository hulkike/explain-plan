package com.mycompany.explainplan.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ex3_cliente", schema = "public", catalog = "explain")
public class Ex3Cliente {
    private Integer id;
    private String numeroDocumento;
    private String apellidos;
    private String nombres;
    private Ex3TipoDocumento ex3TipoDocumentoByIdTipoDocumento;

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
    @Column(name = "apellidos")
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Basic
    @Column(name = "nombres")
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ex3Cliente that = (Ex3Cliente) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(numeroDocumento, that.numeroDocumento) &&
                Objects.equals(apellidos, that.apellidos) &&
                Objects.equals(nombres, that.nombres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numeroDocumento, apellidos, nombres);
    }

    @ManyToOne
    @JoinColumn(name = "id_tipo_documento", referencedColumnName = "id", nullable = false)
    public Ex3TipoDocumento getEx3TipoDocumentoByIdTipoDocumento() {
        return ex3TipoDocumentoByIdTipoDocumento;
    }

    public void setEx3TipoDocumentoByIdTipoDocumento(Ex3TipoDocumento ex3TipoDocumentoByIdTipoDocumento) {
        this.ex3TipoDocumentoByIdTipoDocumento = ex3TipoDocumentoByIdTipoDocumento;
    }
}
