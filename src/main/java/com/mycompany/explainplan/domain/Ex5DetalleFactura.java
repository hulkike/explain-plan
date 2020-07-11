/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.explainplan.domain;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author enrique
 */
@Entity
@Table(name = "ex5_detalle_factura")
public class Ex5DetalleFactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Ex5DetalleFacturaPK ex5DetalleFacturaPK;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "precio_venta")
    private BigInteger precioVenta;
    @JoinColumn(name = "factura_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ex5Factura ex5Factura;
    @JoinColumn(name = "producto_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ex5Producto ex5Producto;

    public Ex5DetalleFactura() {
    }

    public Ex5DetalleFactura(Ex5DetalleFacturaPK ex5DetalleFacturaPK) {
        this.ex5DetalleFacturaPK = ex5DetalleFacturaPK;
    }

    public Ex5DetalleFactura(Ex5DetalleFacturaPK ex5DetalleFacturaPK, int cantidad, BigInteger precioVenta) {
        this.ex5DetalleFacturaPK = ex5DetalleFacturaPK;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
    }

    public Ex5DetalleFactura(int facturaId, int productoId) {
        this.ex5DetalleFacturaPK = new Ex5DetalleFacturaPK(facturaId, productoId);
    }

    public Ex5DetalleFacturaPK getEx5DetalleFacturaPK() {
        return ex5DetalleFacturaPK;
    }

    public void setEx5DetalleFacturaPK(Ex5DetalleFacturaPK ex5DetalleFacturaPK) {
        this.ex5DetalleFacturaPK = ex5DetalleFacturaPK;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigInteger getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigInteger precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Ex5Factura getEx5Factura() {
        return ex5Factura;
    }

    public void setEx5Factura(Ex5Factura ex5Factura) {
        this.ex5Factura = ex5Factura;
    }

    public Ex5Producto getEx5Producto() {
        return ex5Producto;
    }

    public void setEx5Producto(Ex5Producto ex5Producto) {
        this.ex5Producto = ex5Producto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ex5DetalleFacturaPK != null ? ex5DetalleFacturaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ex5DetalleFactura)) {
            return false;
        }
        Ex5DetalleFactura other = (Ex5DetalleFactura) object;
        if ((this.ex5DetalleFacturaPK == null && other.ex5DetalleFacturaPK != null) || (this.ex5DetalleFacturaPK != null && !this.ex5DetalleFacturaPK.equals(other.ex5DetalleFacturaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.explainplan.domain.Ex5DetalleFactura[ ex5DetalleFacturaPK=" + ex5DetalleFacturaPK + " ]";
    }
    
}
