/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.ResultSet;

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

}
