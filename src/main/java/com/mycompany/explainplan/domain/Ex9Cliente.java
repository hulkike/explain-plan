/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.explainplan.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author enrique
 */
@Entity
@Table(name = "ex9_cliente")
public class Ex9Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Ex9ClientePK ex9ClientePK;
    @Basic(optional = false)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @Column(name = "apellidos")
    private String apellidos;
    @JoinColumn(name = "login", referencedColumnName = "login")
    @ManyToOne(optional = false)
    private Ex9User login;

    public Ex9Cliente() {
    }

    public Ex9Cliente(Ex9ClientePK ex9ClientePK) {
        this.ex9ClientePK = ex9ClientePK;
    }

    public Ex9Cliente(Ex9ClientePK ex9ClientePK, String nombres, String apellidos) {
        this.ex9ClientePK = ex9ClientePK;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Ex9Cliente(String tipoDocumento, String numeroDocumento) {
        this.ex9ClientePK = new Ex9ClientePK(tipoDocumento, numeroDocumento);
    }

    public Ex9ClientePK getEx9ClientePK() {
        return ex9ClientePK;
    }

    public void setEx9ClientePK(Ex9ClientePK ex9ClientePK) {
        this.ex9ClientePK = ex9ClientePK;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Ex9User getLogin() {
        return login;
    }

    public void setLogin(Ex9User login) {
        this.login = login;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ex9ClientePK != null ? ex9ClientePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ex9Cliente)) {
            return false;
        }
        Ex9Cliente other = (Ex9Cliente) object;
        if ((this.ex9ClientePK == null && other.ex9ClientePK != null) || (this.ex9ClientePK != null && !this.ex9ClientePK.equals(other.ex9ClientePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.explainplan.domain.Ex9Cliente[ ex9ClientePK=" + ex9ClientePK + " ]";
    }
    
}
