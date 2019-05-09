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
public class Directeur {

    private Long id;
    private String nom;
    private String prenom;
    private String login;
    private String password;
    private String telephone;
    private double salaire;
    private String numeroDirecteur;

    public Directeur() {
    }

    public Directeur(Long id) {
        this.id = id;
    }

    public Directeur(Long id, String nom, String prenom, String login, String password, String telephone, double salaire, String numeroDirecteur) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
        this.telephone = telephone;
        this.salaire = salaire;
        this.numeroDirecteur = numeroDirecteur;
    }

    public String getNumeroDirecteur() {
        return numeroDirecteur;
    }

    public void setNumeroDirecteur(String numeroDirecteur) {
        this.numeroDirecteur = numeroDirecteur;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final Directeur other = (Directeur) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Directeur{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", password=" + password + ", salaire=" + salaire + ", numeroDirecteur=" + numeroDirecteur + '}';
    }

}
