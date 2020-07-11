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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author enrique
 */
@Entity
@Table(name = "ex8_producto")
public class Ex8Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoId", fetch = FetchType.LAZY)
    private Set<Ex8DetalleFactura> ex8DetalleFacturaSet;

    public Ex8Producto() {
    }

    public Ex8Producto(Integer id) {
        this.id = id;
    }

    public Ex8Producto(Integer id, String codigoBarras, String nombre, String descripcion, String imagen, int stock, BigInteger precio) {
        this.id = id;
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.stock = stock;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Set<Ex8DetalleFactura> getEx8DetalleFacturaSet() {
        return ex8DetalleFacturaSet;
    }

    public void setEx8DetalleFacturaSet(Set<Ex8DetalleFactura> ex8DetalleFacturaSet) {
        this.ex8DetalleFacturaSet = ex8DetalleFacturaSet;
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
        if (!(object instanceof Ex8Producto)) {
            return false;
        }
        Ex8Producto other = (Ex8Producto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.explainplan.domain.Ex8Producto[ id=" + id + " ]";
    }
    
}
