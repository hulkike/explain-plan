package com.mycompany.explainplan.domain;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "ex6_producto", schema = "public", catalog = "explain")
public class Ex6Producto {
    private Integer id;
    private String codigoBarras;
    private String nombre;
    private String descripcion;
    private String imagen;
    private Integer stock;
    private Integer precio;
    private Collection<Ex6DetalleFactura> ex6DetalleFacturasById;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "codigo_barras")
    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "imagen")
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Basic
    @Column(name = "stock")
    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Basic
    @Column(name = "precio")
    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ex6Producto that = (Ex6Producto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(codigoBarras, that.codigoBarras) &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(descripcion, that.descripcion) &&
                Objects.equals(imagen, that.imagen) &&
                Objects.equals(stock, that.stock) &&
                Objects.equals(precio, that.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigoBarras, nombre, descripcion, imagen, stock, precio);
    }

    @OneToMany(mappedBy = "producto")
    public Collection<Ex6DetalleFactura> getEx6DetalleFacturasById() {
        return ex6DetalleFacturasById;
    }

    public void setEx6DetalleFacturasById(Collection<Ex6DetalleFactura> ex6DetalleFacturasById) {
        this.ex6DetalleFacturasById = ex6DetalleFacturasById;
    }
}
