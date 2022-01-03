/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
/**
 *
 * @author akm
 */
public class conn {
   
    public static Connection getcon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");//registration mysql driver
            Connection con=DriverManager.getConnection("jdbc:mysql:///localhost:3306/library_management_system","root","");
            return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        
    }

    public static Connection getCon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
