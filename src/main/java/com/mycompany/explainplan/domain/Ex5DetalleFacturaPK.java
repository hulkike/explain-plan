/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.explainplan.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author enrique
 */
@Embeddable
public class Ex5DetalleFacturaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "factura_id")
    private int facturaId;
    @Basic(optional = false)
    @Column(name = "producto_id")
    private int productoId;

    public Ex5DetalleFacturaPK() {
    }

    public Ex5DetalleFacturaPK(int facturaId, int productoId) {
        this.facturaId = facturaId;
        this.productoId = productoId;
    }

    public int getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(int facturaId) {
        this.facturaId = facturaId;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) facturaId;
        hash += (int) productoId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ex5DetalleFacturaPK)) {
            return false;
        }
        Ex5DetalleFacturaPK other = (Ex5DetalleFacturaPK) object;
        if (this.facturaId != other.facturaId) {
            return false;
        }
        if (this.productoId != other.productoId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.explainplan.domain.Ex5DetalleFacturaPK[ facturaId=" + facturaId + ", productoId=" + productoId + " ]";
    }
    
}
