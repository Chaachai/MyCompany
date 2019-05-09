/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Objects;

/**
 *
 * @author CHAACHAI Youssef
 */
public class Responsable {

    private Long id;
    private String nom;
    private String prenom;
    private String login;
    private String password;
    private String telephone;
    private double salaire;
    private String numeroRespo;

    public Responsable() {
    }

    public Responsable(Long id) {
        this.id = id;
    }

    public Responsable(Long id, String nom, String prenom, String login, String password, String telephone, double salaire, String numeroRespo) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
        this.telephone = telephone;
        this.salaire = salaire;
        this.numeroRespo = numeroRespo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getNumeroRespo() {
        return numeroRespo;
    }

    public void setNumeroRespo(String numeroRespo) {
        this.numeroRespo = numeroRespo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Responsable other = (Responsable) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Responsabe{" + "numeroRespo=" + numeroRespo + '}';
    }

}
