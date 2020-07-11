package com.mycompany.explainplan.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ex6_detalle_factura", schema = "public", catalog = "explain")
public class Ex6DetalleFactura {
    private Integer cantidad;
    private Integer precioVenta;
    private Ex6Factura factura;
    private Ex6Producto producto;

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
        Ex6DetalleFactura that = (Ex6DetalleFactura) o;
        return Objects.equals(cantidad, that.cantidad) &&
                Objects.equals(precioVenta, that.precioVenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cantidad, precioVenta);
    }

    @ManyToOne
    @JoinColumn(name = "factura_id", referencedColumnName = "id", nullable = false)
    public Ex6Factura getFactura() {
        return factura;
    }

    public void setFactura(Ex6Factura factura) {
        this.factura = factura;
    }

    @ManyToOne
    @JoinColumn(name = "producto_id", referencedColumnName = "id", nullable = false)
    public Ex6Producto getProducto() {
        return producto;
    }

    public void setProducto(Ex6Producto producto) {
        this.producto = producto;
    }
}
