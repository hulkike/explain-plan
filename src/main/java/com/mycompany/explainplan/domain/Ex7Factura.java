package com.mycompany.explainplan.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "ex7_factura", schema = "public", catalog = "explain")
public class Ex7Factura {
    private Integer id;
    private Integer numeroFactura;
    private Timestamp anio;
    private Integer total;
    private Collection<Ex7DetalleFactura> ex7DetalleFacturasById;

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
        Ex7Factura that = (Ex7Factura) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(numeroFactura, that.numeroFactura) &&
                Objects.equals(anio, that.anio) &&
                Objects.equals(total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numeroFactura, anio, total);
    }

    @OneToMany(mappedBy = "ex7FacturaByFacturaId")
    public Collection<Ex7DetalleFactura> getEx7DetalleFacturasById() {
        return ex7DetalleFacturasById;
    }

    public void setEx7DetalleFacturasById(Collection<Ex7DetalleFactura> ex7DetalleFacturasById) {
        this.ex7DetalleFacturasById = ex7DetalleFacturasById;
    }
}
