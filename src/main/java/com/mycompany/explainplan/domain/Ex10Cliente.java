package com.mycompany.explainplan.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ex10_cliente", schema = "public", catalog = "explain")
public class Ex10Cliente {
    private Integer id;
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombres;
    private String apellidos;
    private Ex10User ex10UserByUserId;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tipo_documento")
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
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
        Ex10Cliente that = (Ex10Cliente) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(tipoDocumento, that.tipoDocumento) &&
                Objects.equals(numeroDocumento, that.numeroDocumento) &&
                Objects.equals(nombres, that.nombres) &&
                Objects.equals(apellidos, that.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipoDocumento, numeroDocumento, nombres, apellidos);
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    public Ex10User getEx10UserByUserId() {
        return ex10UserByUserId;
    }

    public void setEx10UserByUserId(Ex10User ex10UserByUserId) {
        this.ex10UserByUserId = ex10UserByUserId;
    }
}
