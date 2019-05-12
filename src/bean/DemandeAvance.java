/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;

/**
 *
 * @author CHAACHAI Youssef
 */
public class DemandeAvance {

    private Long id;
    private String commentaire;
    private Date date;
    private EtatDemande etat;
    private Salarie salarie;
    private int type;
    private int pourcentage;
    private int mois;

    public DemandeAvance() {
    }

    public DemandeAvance(Long id) {
        this.id = id;
    }

    public DemandeAvance(Long id, String commentaire, Date date, int id_etat, Long id_salarie, int type, int pourcentage, int mois) {
        this.id = id;
        this.commentaire = commentaire;
        this.date = date;
        etat = new EtatDemande(id_etat);
        salarie = new Salarie(id_salarie);
        this.type = type;
        this.pourcentage = pourcentage;
        this.mois = mois;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public EtatDemande getEtat() {
        return etat;
    }

    public void setEtat(EtatDemande etat) {
        this.etat = etat;
    }

    public Salarie getSalarie() {
        return salarie;
    }

    public void setSalarie(Salarie salarie) {
        this.salarie = salarie;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(int pourcentage) {
        this.pourcentage = pourcentage;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    @Override
    public String toString() {
        return "DemandeAvance{" + "id=" + id + ", commentaire=" + commentaire + ", date=" + date + ", type=" + type + ", pourcentage=" + pourcentage + ", mois=" + mois + '}';
    }

}
