/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bddsql.LiaisonSql;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import data.Airports;

/**
 *
 * @author Formation
 */
public class AirportsDao extends Dao<Airports,String>{

    @Override
    public Airports create(Airports airports) {
        
        return airports;
    }

    @Override
    public boolean delete(Airports airports) {
        return true;
    }



    @Override
    public ArrayList getAll() {
         ArrayList<Airports> listeairports = new ArrayList<>();
        
        if(this.bddmanager.connect()) {
            
            try {
                Statement st = this.bddmanager.getConnectionManager().createStatement();
                String requete = "SELECT * FROM airports";
                ResultSet rs = st.executeQuery(requete);
                
                while(rs.next()){
                    
                    Airports airport = new Airports(rs.getString("aita"), rs.getString("city"),
                            rs.getString("pays"));
                    listeairports.add(airport);
                }
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                return listeairports;
            }
            
            
            
        } else {
        
        return listeairports;
    }
        return listeairports;
    }

     @Override
    public Airports find(String key) {
        Airports airport = new Airports();
        if(this.bddmanager.connect()) {
            
            try {
                Statement st = this.bddmanager.getConnectionManager().createStatement();
                String requete = "SELECT * FROM airports WHERE aita = \""+ key + "\"";
                ResultSet rs = st.executeQuery(requete);
                
                while(rs.next()){
                    airport.setAita(rs.getString("aita"));
                    airport.setCity(rs.getString("City"));
                    airport.setPays(rs.getString("Pays"));
                }
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                return airport;
            }
            
            
            
        } else {
        
        return airport;
    }
        return airport;
    }

    @Override
    public boolean update(Airports airport) {
        return true;
    }


  


    
}
