/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class classConexao {
    
    public Connection conectar(){
        
        String url = "jdbc:mysql://localhost/bdIgreja";
        String usuario = "root";
        String senha = "";
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = (Connection) DriverManager.getConnection(url,usuario,senha);
            
            return conn;
        }
        catch(SQLException ex){
            System.out.println("SQLException: "+ex.getMessage());
            System.out.println("SQLState: "+ex.getSQLState());
            System.out.println("VendorError: "+ex.getErrorCode());
            
            return null;
        }
        
        catch(Exception e){
            System.out.println("problemas ao tentar conectar com " + " o banco de dados: " + e);
            return null;
        }
    }
   
        }