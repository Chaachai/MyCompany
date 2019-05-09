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
public class Employe {

    private Long id;
    private String nom;
    private String prenom;
    private String login;
    private String password;
    private String telephone;
    private double salaire;
    private String numEmploye;
    private Departement departement;

    public Employe() {
    }

    public Employe(Long id) {
        this.id = id;
    }

    public Employe(Long id, String nom, String prenom, String login, String password, String telephone, double salaire, String numEmploye, String num_departement) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
        this.telephone = telephone;
        this.salaire = salaire;
        this.numEmploye = numEmploye;
        departement = new Departement(num_departement);
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
    
    

    public String getNumEmploye() {
        return numEmploye;
    }

    public void setNumEmploye(String numEmploye) {
        this.numEmploye = numEmploye;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.numEmploye);
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
        final Employe other = (Employe) obj;
        if (!Objects.equals(this.numEmploye, other.numEmploye)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employe{" + "numEmploye=" + numEmploye + '}';
    }

}
