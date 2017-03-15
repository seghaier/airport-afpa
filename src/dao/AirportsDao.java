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
public class AirportsDao extends Dao{

    public AirportsDao() {
        super();
    }
    
    @Override
    public boolean creer(Object obj) {
        return true;
    }

    @Override
    public boolean supprimer(Object obj) {
        return true;
    }

    public ArrayList getAll() {
        ArrayList<Airports> listeairports = new ArrayList<>();
        
        if(this.bddmanager.connect()) {
            
            try {
                Statement st = this.bddmanager.getConnectionManager().createStatement();
                String requete = "SELECT * FROM airports";
                ResultSet rs = st.executeQuery(requete);
                
                while(rs.next()){
                    
                    Airports el = new Airports(rs.getString("id"), rs.getString("city"),
                            rs.getString("pays"));
                    listeairports.add(el);
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

    public LiaisonSql getmanager() {
        return bddmanager;
    }

    @Override
    public ArrayList fine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
