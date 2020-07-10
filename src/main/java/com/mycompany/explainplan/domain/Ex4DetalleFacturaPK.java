/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.explainplan.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author enrique
 */
@Embeddable
public class Ex4DetalleFacturaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "numero_factura")
    private int numeroFactura;
    @Basic(optional = false)
    @Column(name = "anio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date anio;
    @Basic(optional = false)
    @Column(name = "codigo_barras")
    private String codigoBarras;

    public Ex4DetalleFacturaPK() {
    }

    public Ex4DetalleFacturaPK(int numeroFactura, Date anio, String codigoBarras) {
        this.numeroFactura = numeroFactura;
        this.anio = anio;
        this.codigoBarras = codigoBarras;
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

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numeroFactura;
        hash += (anio != null ? anio.hashCode() : 0);
        hash += (codigoBarras != null ? codigoBarras.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ex4DetalleFacturaPK)) {
            return false;
        }
        Ex4DetalleFacturaPK other = (Ex4DetalleFacturaPK) object;
        if (this.numeroFactura != other.numeroFactura) {
            return false;
        }
        if ((this.anio == null && other.anio != null) || (this.anio != null && !this.anio.equals(other.anio))) {
            return false;
        }
        if ((this.codigoBarras == null && other.codigoBarras != null) || (this.codigoBarras != null && !this.codigoBarras.equals(other.codigoBarras))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.explainplan.domain.Ex4DetalleFacturaPK[ numeroFactura=" + numeroFactura + ", anio=" + anio + ", codigoBarras=" + codigoBarras + " ]";
    }
    
}
