/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author CHAACHAI Youssef
 */
public class Config {


    public Connection connect() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:employesdb", "system", "system");

            if (con != null) {
                System.out.println("Connected !");
            }else
                System.out.println("Not connected !!");

            return con;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public ResultSet loadData(String query) {
        Connection con = connect();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            return rs;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
