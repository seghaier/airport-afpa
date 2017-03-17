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
import java.sql.PreparedStatement;

/**
 *
 * @author Formation
 */
public class AirportsDao extends Dao<Airports,String>{

    @Override
    public Airports create(Airports airports) {
        
        Airports airportCreate = new Airports();
        if (this.bddmanager.connect()) {
            
            try {

                // create requete 
                String requete = "INSERT INTO airports (aita, city, pays) VALUES (?,?,?)";
                // prepared requete 
                PreparedStatement pst = this.bddmanager.getConnectionManager().prepareStatement(requete);
                // insert value in requete
                pst.setString(1, airports.getAita());
                pst.setString(2, airports.getCity());
                pst.setString(3, airports.getPays());
                // excute insert row in table
                pst.executeUpdate();
                
                airportCreate = this.find(airports.getAita());
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                return airportCreate;
            }

        } else {
            return airportCreate;
        }
 
        return airportCreate;
 
        
    }

    @Override
    public boolean delete(Airports air) {
        
        boolean success = false;

        if (this.bddmanager.connect()) {

            try {

                // create requete 
                String requete = "DELETE FROM airports WHERE aita LIKE ?";
                // prepared requete 
                PreparedStatement pst = this.bddmanager.getConnectionManager().prepareStatement(requete);
                // insert value in requete
                pst.setString(1, air.getAita());
                // excute delete row in table
                int insert = pst.executeUpdate();
                // if insert in table 
                if (insert != 0) {
                    success = true;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                return success;
            }

        } else {
            return success;
        }
        
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
                    airport.setCity(rs.getString("city"));
                    airport.setPays(rs.getString("pays"));
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
