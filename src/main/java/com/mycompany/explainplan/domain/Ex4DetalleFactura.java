/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.explainplan.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author enrique
 */
@Entity
@Table(name = "ex4_detalle_factura")
public class Ex4DetalleFactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Ex4DetalleFacturaPK ex4DetalleFacturaPK;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "precio_venta")
    private BigInteger precioVenta;
    @JoinColumns({
        @JoinColumn(name = "numero_factura", referencedColumnName = "numero_factura", insertable = false, updatable = false),
        @JoinColumn(name = "anio", referencedColumnName = "anio", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Ex4Factura ex4Factura;
    @JoinColumn(name = "codigo_barras", referencedColumnName = "codigo_barras", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Ex4Producto ex4Producto;

    public Ex4DetalleFactura() {
    }

    public Ex4DetalleFactura(Ex4DetalleFacturaPK ex4DetalleFacturaPK) {
        this.ex4DetalleFacturaPK = ex4DetalleFacturaPK;
    }

    public Ex4DetalleFactura(Ex4DetalleFacturaPK ex4DetalleFacturaPK, int cantidad, BigInteger precioVenta) {
        this.ex4DetalleFacturaPK = ex4DetalleFacturaPK;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
    }

    public Ex4DetalleFactura(int numeroFactura, Date anio, String codigoBarras) {
        this.ex4DetalleFacturaPK = new Ex4DetalleFacturaPK(numeroFactura, anio, codigoBarras);
    }

    public Ex4DetalleFacturaPK getEx4DetalleFacturaPK() {
        return ex4DetalleFacturaPK;
    }

    public void setEx4DetalleFacturaPK(Ex4DetalleFacturaPK ex4DetalleFacturaPK) {
        this.ex4DetalleFacturaPK = ex4DetalleFacturaPK;
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

    public Ex4Factura getEx4Factura() {
        return ex4Factura;
    }

    public void setEx4Factura(Ex4Factura ex4Factura) {
        this.ex4Factura = ex4Factura;
    }

    public Ex4Producto getEx4Producto() {
        return ex4Producto;
    }

    public void setEx4Producto(Ex4Producto ex4Producto) {
        this.ex4Producto = ex4Producto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ex4DetalleFacturaPK != null ? ex4DetalleFacturaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ex4DetalleFactura)) {
            return false;
        }
        Ex4DetalleFactura other = (Ex4DetalleFactura) object;
        if ((this.ex4DetalleFacturaPK == null && other.ex4DetalleFacturaPK != null) || (this.ex4DetalleFacturaPK != null && !this.ex4DetalleFacturaPK.equals(other.ex4DetalleFacturaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.explainplan.domain.Ex4DetalleFactura[ ex4DetalleFacturaPK=" + ex4DetalleFacturaPK + " ]";
    }
    
}
