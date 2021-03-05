/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author NUBAR
 */
public class Main {

    private static void method() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
com.mysql.jdbc.Driver s;
        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "";
        Connection c=DriverManager.getConnection(url, url, password);
    }

}
