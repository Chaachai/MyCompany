/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.DemandeConge;
import bean.EtatDemande;
import bean.Salarie;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.Session;

/**
 *
 * @author CHAACHAI Youssef
 */
public class DemandeCongeFacade {

    Config c = new Config();
    EtatDemandeFacade etatDemandeFacade = new EtatDemandeFacade();

    public List<DemandeConge> getAllDemandes() {
        Salarie sal = ((Salarie) Session.getAttribut("connectedUser"));
        ResultSet rs = c.loadData("SELECT * FROM demandeConge WHERE id_salarie = "+sal.getId());
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
}
