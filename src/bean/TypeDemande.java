/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author CHAACHAI Youssef
 */
public class TypeDemande {
    private int id;
    private String libelle;

    public TypeDemande() {
    }

    public TypeDemande(int id) {
        this.id = id;
    }

    public TypeDemande(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "TypeDemande{" + "id=" + id + ", libelle=" + libelle + '}';
    }
    
    
    
}
