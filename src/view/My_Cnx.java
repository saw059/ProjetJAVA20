/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;

import java.util.logging.Logger;



/**
 *
 * @author sahraoui
 */
public class My_Cnx {
    
    private static String servername ="localhost";
    private static String dbname ="edt";
    private static String password ="root";
    private static String username ="root";
    private static Integer portnumber =8889;
    
    public static Connection getConnection()
    {
        Connection cnx =null;
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(servername);
        datasource.setServerName(servername);
        
        
        
        datasource.setUser(username);
        
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(My_Cnx.class.getName()+"get Connection ->").log(Level.SEVERE, null, ex);
        }
        
                
                
        return cnx;
    }
    private static MysqlDataSource datasource;
}