/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bddsql;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Formation
 */
public class LiaisonSql {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/airafpa";
    private static final String DB_JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    private Connection cn = null;
    
    private LiaisonSql() {
        
     try {
            Class.forName(LiaisonSql.DB_JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.exit(1);
        }   
    }
    
    public static LiaisonSql getInstance() {
        return LiaisonSqlHolder.INSTANCE;
    }
    
    private static class LiaisonSqlHolder {

        private static final LiaisonSql INSTANCE = new LiaisonSql();
    }
    
   public boolean connect() {
        if (this.cn == null) {

            try {
                this.cn = DriverManager.getConnection(LiaisonSql.DB_URL, LiaisonSql.DB_USER, LiaisonSql.DB_PASSWORD);
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }

        } else {

            try {
                Statement st = this.cn.createStatement();
                String requete = "SELECT 1";
                st.executeQuery(requete);
            } catch (SQLException ex) {
                
                try {
                this.cn = DriverManager.getConnection(LiaisonSql.DB_URL, LiaisonSql.DB_USER, LiaisonSql.DB_PASSWORD);
            } catch (SQLException ex1) {
                ex1.printStackTrace();
                return false;
            }

            }
        }
        
        return true;
    }
    
    public Connection getConnectionManager(){
    return this.cn;
} 
}
