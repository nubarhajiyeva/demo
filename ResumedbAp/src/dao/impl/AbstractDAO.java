/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author NUBAR
 */
public class AbstractDAO {
    public  Connection connect() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/resume";
        String username = "root";
        String password = "askyok321";
        Connection c = DriverManager.getConnection(url, username, password);
        return c;
    }
}
