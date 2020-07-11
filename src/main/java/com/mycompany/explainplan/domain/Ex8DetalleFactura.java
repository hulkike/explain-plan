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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author enrique
 */
@Entity
@Table(name = "ex8_detalle_factura")
public class Ex8DetalleFactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "precio_venta")
    private BigInteger precioVenta;
    @JoinColumn(name = "factura_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ex8Factura facturaId;
    @JoinColumn(name = "producto_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ex8Producto productoId;

    public Ex8DetalleFactura() {
    }

    public Ex8DetalleFactura(Integer id) {
        this.id = id;
    }

    public Ex8DetalleFactura(Integer id, int cantidad, BigInteger precioVenta) {
        this.id = id;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Ex8Factura getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Ex8Factura facturaId) {
        this.facturaId = facturaId;
    }

    public Ex8Producto getProductoId() {
        return productoId;
    }

    public void setProductoId(Ex8Producto productoId) {
        this.productoId = productoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ex8DetalleFactura)) {
            return false;
        }
        Ex8DetalleFactura other = (Ex8DetalleFactura) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.explainplan.domain.Ex8DetalleFactura[ id=" + id + " ]";
    }
    
}
