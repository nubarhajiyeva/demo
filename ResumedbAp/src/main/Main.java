/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entity.User;
import dao.impl.UserDaoImpl;
import dao.inter.UserDaoInter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author NUBAR
 */
public class Main {

  

    public static void main(String[] args) throws Exception {
        UserDaoInter userdao=new UserDaoImpl();
     
       
        System.out.println(userdao.getAllSkillByUserId(5));    
        // userdao.removeUser(2);
//        List<User> list=userdao.getAll();
//        System.out.println("list="+list);
    }
}
