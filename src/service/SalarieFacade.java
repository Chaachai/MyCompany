/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Salarie;
import java.sql.ResultSet;
import static jdk.nashorn.internal.runtime.Debug.id;

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
     
     public void test(){
         int res = c.insertData("INSERT INTO employe values(sq_salarie.nextval, 'emp002', 'IBRAHIM', 'Housseini', 'abbalele', 'abbalele', '0671717171', '15000.00', 41)");
        if(res == 1){
            System.out.println("success !");
        }else
             System.out.println("error !!!");
     }

}
