/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.explainplan.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author enrique
 */
@Entity
@Table(name = "ex5_factura")
public class Ex5Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "numero_factura")
    private int numeroFactura;
    @Basic(optional = false)
    @Column(name = "anio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date anio;
    @Basic(optional = false)
    @Column(name = "total")
    private BigInteger total;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ex5Factura", fetch = FetchType.LAZY)
    private Set<Ex5DetalleFactura> ex5DetalleFacturaSet;

    public Ex5Factura() {
    }

    public Ex5Factura(Integer id) {
        this.id = id;
    }

    public Ex5Factura(Integer id, int numeroFactura, Date anio, BigInteger total) {
        this.id = id;
        this.numeroFactura = numeroFactura;
        this.anio = anio;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Date getAnio() {
        return anio;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger total) {
        this.total = total;
    }

    public Set<Ex5DetalleFactura> getEx5DetalleFacturaSet() {
        return ex5DetalleFacturaSet;
    }

    public void setEx5DetalleFacturaSet(Set<Ex5DetalleFactura> ex5DetalleFacturaSet) {
        this.ex5DetalleFacturaSet = ex5DetalleFacturaSet;
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
        if (!(object instanceof Ex5Factura)) {
            return false;
        }
        Ex5Factura other = (Ex5Factura) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.explainplan.domain.Ex5Factura[ id=" + id + " ]";
    }
    
}
