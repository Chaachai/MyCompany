/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.DemandeAugmentation;
import bean.EtatDemande;
import bean.Salarie;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.Session;

/**
 *
 * @author hamza
 */
public class DemandeAugmentationFacade {
    Config c = new Config();
    EtatDemandeFacade etatDemandeFacade = new EtatDemandeFacade();

    public List<DemandeAugmentation> getAllDemandes() {
        Salarie sal = ((Salarie) Session.getAttribut("connectedUser"));
        ResultSet rs = c.loadData("SELECT * FROM demandeaugmentation WHERE id_salarie = "+sal.getId());
        List<DemandeAugmentation> demandes = new ArrayList();
        if (rs != null) {
            try {
                while (rs.next()) {
                    // System.out.println(rs.getInt(1) + " " + rs.getString(2));
                    DemandeAugmentation da = new DemandeAugmentation(rs.getLong(1), rs.getString(2), rs.getDate(7), rs.getDate(5), rs.getDate(6));
                    EtatDemande etat = etatDemandeFacade.findEtatById(rs.getInt(3));
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
    
}
