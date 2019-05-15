/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.DemandeAugmentation;
import bean.DemandeAvance;
import bean.DemandeConge;
import bean.EtatDemande;
import bean.Mois;
import bean.Salarie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Session;

/**
 *
 * @author CHAACHAI Youssef
 */
public class DemandeFacade {

    Config c = new Config();
    EtatDemandeFacade etatDemandeFacade = new EtatDemandeFacade();

    public List<DemandeAvance> getAllDemandesAvance() {
        Salarie sal = ((Salarie) Session.getAttribut("connectedUser"));
        ResultSet rs = c.loadData("SELECT * FROM demandeavance WHERE id_salarie = " + sal.getId());
        List<DemandeAvance> demandes = new ArrayList();
        if (rs != null) {
            try {
                while (rs.next()) {
                    DemandeAvance da = new DemandeAvance(rs.getLong(1), rs.getString(2), rs.getDate(3), rs.getInt(6));
                    EtatDemande etat = etatDemandeFacade.findEtatById(rs.getInt(4));
                    da.setEtat(etat);
                    da.setMois(new Mois(rs.getInt(7)));
                    demandes.add(da);
                }
                return demandes;
            } catch (Exception e) {
                System.out.println(e);
                return null;
            }
        } else {
            return null;
        }
    }

    public List<DemandeConge> getAllDemandesConges() {
        Salarie sal = ((Salarie) Session.getAttribut("connectedUser"));
        ResultSet rs = c.loadData("SELECT * FROM demandeConge WHERE id_salarie = " + sal.getId());
        List<DemandeConge> demandes = new ArrayList();
        if (rs != null) {
            try {
                while (rs.next()) {
                    // System.out.println(rs.getInt(1) + " " + rs.getString(2));
                    DemandeConge dc = new DemandeConge(rs.getLong(1), rs.getString(2), rs.getDate(7), rs.getDate(5), rs.getDate(6));
                    EtatDemande etat = etatDemandeFacade.findEtatById(rs.getInt(3));
                    dc.setEtat(etat);
                    demandes.add(dc);
                }
                return demandes;
            } catch (Exception e) {
                System.out.println(e);
                return null;
            }
        } else {
            return null;
        }
    }

    public List<DemandeAugmentation> getAllDemandesAugmentations() {
        Salarie sal = ((Salarie) Session.getAttribut("connectedUser"));
        ResultSet rs = c.loadData("SELECT * FROM demandeaugmentation WHERE id_salarie = " + sal.getId());
        List<DemandeAugmentation> demandes = new ArrayList();
        if (rs != null) {
            try {
                while (rs.next()) {
                    DemandeAugmentation da = new DemandeAugmentation(rs.getLong(1), rs.getString(2), rs.getDate(3), rs.getInt(6));
                    EtatDemande etat = etatDemandeFacade.findEtatById(rs.getInt(4));
                    da.setEtat(etat);
                    demandes.add(da);
                }
                return demandes;
            } catch (Exception e) {
                System.out.println(e);
                return null;
            }
        } else {
            return null;
        }
    }

    public int ajouterDemandeConge(Date date_debut, Date date_fin, String comment) {
        Salarie sal = ((Salarie) Session.getAttribut("connectedUser"));
        Connection con = c.connect();
        Date nowDate = new Date();
        java.sql.Date sqlDateDebut = new java.sql.Date(date_debut.getTime());
        java.sql.Date sqlDateFin = new java.sql.Date(date_fin.getTime());
        java.sql.Date sqlNowDate = new java.sql.Date(nowDate.getTime());
        String query = "INSERT INTO demandeconge VALUES (?,?,?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(query);
            ps.setLong(1, c.generateId("demandeConge", "id"));
            ps.setString(2, comment);
            ps.setInt(3, 0);
            ps.setLong(4, sal.getId());
            ps.setDate(5, sqlDateDebut);
            ps.setDate(6, sqlDateFin);
            ps.setDate(7, sqlNowDate);
            ps.execute();
            ps.close();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(DemandeFacade.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    
    public int ajouterDemandeAvance(int pourcentage, int mois, String comment) {
        Salarie sal = ((Salarie) Session.getAttribut("connectedUser"));
        Connection con = c.connect();
        Date nowDate = new Date();
        java.sql.Date sqlNowDate = new java.sql.Date(nowDate.getTime());
        String query = "INSERT INTO demandeavance VALUES (?,?,?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(query);
            ps.setLong(1, c.generateId("demandeAvance", "id"));
            ps.setString(2, comment);
            ps.setDate(3, sqlNowDate);
            ps.setInt(4, 0);
            ps.setLong(5, sal.getId());
            ps.setInt(6, pourcentage);
            ps.setInt(7, mois);
            ps.execute();
            ps.close();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(DemandeFacade.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
}
