package com.mycompany.explainplan.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "ex6_factura", schema = "public", catalog = "explain")
public class Ex6Factura {
    private Integer id;
    private Integer numeroFactura;
    private Timestamp anio;
    private Integer total;
    private Collection<Ex6DetalleFactura> detalleFacturas;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "numero_factura")
    public Integer getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(Integer numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    @Basic
    @Column(name = "anio")
    public Timestamp getAnio() {
        return anio;
    }

    public void setAnio(Timestamp anio) {
        this.anio = anio;
    }

    @Basic
    @Column(name = "total")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ex6Factura that = (Ex6Factura) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(numeroFactura, that.numeroFactura) &&
                Objects.equals(anio, that.anio) &&
                Objects.equals(total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numeroFactura, anio, total);
    }

    @OneToMany(mappedBy = "factura")
    public Collection<Ex6DetalleFactura> getDetalleFacturas() {
        return detalleFacturas;
    }

    public void setDetalleFacturas(Collection<Ex6DetalleFactura> detalleFacturas) {
        this.detalleFacturas = detalleFacturas;
    }
}
