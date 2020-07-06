package com.mycompany.explainplan.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Ex1ClientePK implements Serializable {
    private String sigla;
    private String numeroDocumento;

    public Ex1ClientePK() {
    }

    public Ex1ClientePK(String sigla, String numeroDocumento) {
        this.sigla= sigla;
        this.numeroDocumento= numeroDocumento;
    }


    @Column(name = "sigla")
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Column(name = "numero_documento")
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ex1ClientePK that = (Ex1ClientePK) o;
        return Objects.equals(sigla, that.sigla) &&
                Objects.equals(numeroDocumento, that.numeroDocumento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sigla, numeroDocumento);
    }
}
