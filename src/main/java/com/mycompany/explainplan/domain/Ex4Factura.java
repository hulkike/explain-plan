/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.explainplan.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author enrique
 */
@Entity
@Table(name = "ex4_factura")
public class Ex4Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Ex4FacturaPK ex4FacturaPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "total")
    private BigDecimal total;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ex4Factura")
    private Set<Ex4DetalleFactura> ex4DetalleFacturaSet;

    public Ex4Factura() {
    }

    public Ex4Factura(Ex4FacturaPK ex4FacturaPK) {
        this.ex4FacturaPK = ex4FacturaPK;
    }

    public Ex4Factura(Ex4FacturaPK ex4FacturaPK, BigDecimal total) {
        this.ex4FacturaPK = ex4FacturaPK;
        this.total = total;
    }

    public Ex4Factura(int numeroFactura, Date anio) {
        this.ex4FacturaPK = new Ex4FacturaPK(numeroFactura, anio);
    }

    public Ex4FacturaPK getEx4FacturaPK() {
        return ex4FacturaPK;
    }

    public void setEx4FacturaPK(Ex4FacturaPK ex4FacturaPK) {
        this.ex4FacturaPK = ex4FacturaPK;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
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
        hash += (ex4FacturaPK != null ? ex4FacturaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ex4Factura)) {
            return false;
        }
        Ex4Factura other = (Ex4Factura) object;
        if ((this.ex4FacturaPK == null && other.ex4FacturaPK != null) || (this.ex4FacturaPK != null && !this.ex4FacturaPK.equals(other.ex4FacturaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.explainplan.domain.Ex4Factura[ ex4FacturaPK=" + ex4FacturaPK + " ]";
    }
    
}
