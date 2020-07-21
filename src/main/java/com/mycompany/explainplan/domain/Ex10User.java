package com.mycompany.explainplan.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "ex10_user", schema = "public", catalog = "explain")
public class Ex10User {
    private Integer id;
    private String login;
    private String password;
    private String estado;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "estado")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ex10User ex10User = (Ex10User) o;
        return Objects.equals(id, ex10User.id) &&
                Objects.equals(login, ex10User.login) &&
                Objects.equals(password, ex10User.password) &&
                Objects.equals(estado, ex10User.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, estado);
    }
}
