package com.mycompany.explainplan.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ex7_detalle_factura", schema = "public", catalog = "explain")
public class Ex7DetalleFactura {
    private Integer id;
    private Integer cantidad;
    private Integer precioVenta;
    private Ex7Factura ex7FacturaByFacturaId;
    private Ex7Producto ex7ProductoByProductoId;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cantidad")
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Basic
    @Column(name = "precio_venta")
    public Integer getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Integer precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ex7DetalleFactura that = (Ex7DetalleFactura) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(cantidad, that.cantidad) &&
                Objects.equals(precioVenta, that.precioVenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cantidad, precioVenta);
    }

    @ManyToOne
    @JoinColumn(name = "factura_id", referencedColumnName = "id", nullable = false)
    public Ex7Factura getEx7FacturaByFacturaId() {
        return ex7FacturaByFacturaId;
    }

    public void setEx7FacturaByFacturaId(Ex7Factura ex7FacturaByFacturaId) {
        this.ex7FacturaByFacturaId = ex7FacturaByFacturaId;
    }

    @ManyToOne
    @JoinColumn(name = "producto_id", referencedColumnName = "id", nullable = false)
    public Ex7Producto getEx7ProductoByProductoId() {
        return ex7ProductoByProductoId;
    }

    public void setEx7ProductoByProductoId(Ex7Producto ex7ProductoByProductoId) {
        this.ex7ProductoByProductoId = ex7ProductoByProductoId;
    }
}
