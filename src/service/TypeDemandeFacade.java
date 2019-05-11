///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package service;
//
//import bean.TypeDemande;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// *
// * @author CHAACHAI Youssef
// */
//public class TypeDemandeFacade {
//
//    Config c = new Config();
//
//    public List<TypeDemande> getAllTypes() {
//        ResultSet rs = c.loadData("SELECT * FROM typeDemande");
//        List<TypeDemande> types = new ArrayList();
//        if (rs != null) {
//            try {
//                while (rs.next()) {
//                    // System.out.println(rs.getInt(1) + " " + rs.getString(2));
//                    types.add(new TypeDemande(rs.getInt(1), rs.getString(2)));
//                }
//                return types;
//            } catch (Exception e) {
//                System.out.println(e);
//                return null;
//            }
//        } else {
//            return null;
//        }
//    }
//
//    public TypeDemande getTypeById(int id) {
//        ResultSet rs = c.loadData("SELECT * FROM typeDemande WHERE id = " + id);
//        TypeDemande type = new TypeDemande();
//        if (rs != null) {
//            try {
//                while (rs.next()) {
//                    type.setId(rs.getInt(1));
//                    type.setLibelle(rs.getString(2));
//                }
//                return type;
//            } catch (Exception e) {
//                System.out.println(e);
//                return null;
//            }
//        } else {
//            return null;
//        }
//    }
//
//    public void test() {
//        List<TypeDemande> types = getAllTypes();
//        for (TypeDemande type : types) {
//            System.out.println(type);
//        }
//    }
//}
