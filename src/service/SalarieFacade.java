/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import bean.Salarie;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHAACHAI Youssef
 */
public class SalarieFacade {

    private Config c = new Config();

    public int login(String login, String password) {
        ResultSet rs = c.loadData("SELECT * FROM salarie WHERE login = '" + login + "' AND password = '" + password+"' ");
        if (rs != null) {
            try {
                while (rs.next()) {
                    return 1;
                }

                return -1;
            } catch (Exception e) {
                System.out.println(e);
                return -3;
            }

        }
        return -2;

    }
    
     public Salarie getSalarieByLogin(String login) {
        ResultSet rs = c.loadData("SELECT * FROM salarie WHERE login = '" + login+"' ");
        Salarie sal = new Salarie();
        if (sal != null) {
            try {
                while (rs.next()) {
                    sal.setId(rs.getLong(1));
                    sal.setNom(rs.getString(2));
                    sal.setPrenom(rs.getString(3));
                    sal.setLogin(rs.getString(4));
                    sal.setPassword(rs.getString(5));
                    sal.setTelephone(rs.getString(6));
                    sal.setSalaire(rs.getDouble(7));
                    sal.setRole(rs.getInt(8));                                                       
                }
                
                return sal;
            } catch (Exception e) {
                System.out.println(e);
                return null;
            }
        } else {
            return null;
        }
    }
     
     public void test() throws SQLException{
         Connection con = c.connect();
         PreparedStatement ps = null ;
         String query = "INSERT INTO employe values(1111, 'emp008', 'ghollam', 'bahri', 'gholam', 'gholam', '0671717171', '15000', 21)" ;
         ps.execute();
         ps.close();
         
     }
     public void ajouterEmploye(String nom,String prenom, String login,String motPasse,String telephone,float salaire,int role,int IDdep) {
        try {
            //        Salarie sal = ((Salarie) Session.getAttribut("connectedUser"));
            Connection con = c.connect();
            CallableStatement cs ;
            cs = con.prepareCall("{ call ajouterEmp(?,?,?,?,?,?,?,?,?)}") ;
            cs.setLong(1,c.generateId("salarie", "ID"));
            cs.setString(2,nom);
            cs.setString(3, prenom);
            cs.setString(4,login);
            cs.setString(5,motPasse);
            cs.setString(6,telephone);
            cs.setFloat(7, salaire);           
            cs.setInt(8, role);
            cs.setInt(9, IDdep);
            
            cs.execute();
            System.out.println("insert succes");
                              
        } catch (SQLException ex) {
            System.out.println("exeption");
            Logger.getLogger(SalarieFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
     
}
