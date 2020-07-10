/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.explainplan.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author enrique
 */
@Entity
@Table(name = "ex4_producto")
@NamedQueries({
    @NamedQuery(name = "Ex4Producto.findAll", query = "SELECT e FROM Ex4Producto e")})
public class Ex4Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo_barras")
    private String codigoBarras;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "imagen")
    private String imagen;
    @Basic(optional = false)
    @Column(name = "stock")
    private int stock;
    @Basic(optional = false)
    @Column(name = "precio")
    private BigInteger precio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ex4Producto")
    private Set<Ex4DetalleFactura> ex4DetalleFacturaSet;

    public Ex4Producto() {
    }

    public Ex4Producto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Ex4Producto(String codigoBarras, String nombre, String descripcion, String imagen, int stock, BigInteger precio) {
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.stock = stock;
        this.precio = precio;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public BigInteger getPrecio() {
        return precio;
    }

    public void setPrecio(BigInteger precio) {
        this.precio = precio;
    }

    public Set<Ex4DetalleFactura> getEx4DetalleFacturaSet() {
        return ex4DetalleFacturaSet;
    }

    public void setEx4DetalleFacturaSet(Set<Ex4DetalleFactura> ex4DetalleFacturaSet) {
        this.ex4DetalleFacturaSet = ex4DetalleFacturaSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoBarras != null ? codigoBarras.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ex4Producto)) {
            return false;
        }
        Ex4Producto other = (Ex4Producto) object;
        if ((this.codigoBarras == null && other.codigoBarras != null) || (this.codigoBarras != null && !this.codigoBarras.equals(other.codigoBarras))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.explainplan.domain.Ex4Producto[ codigoBarras=" + codigoBarras + " ]";
    }
    
}
