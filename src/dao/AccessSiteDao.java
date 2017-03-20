/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import data.AccessSite;
import data.Airports;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Formation
 */
public class AccessSiteDao extends Dao<AccessSite, Object>{

    @Override
    public AccessSite create(AccessSite obj) {
       AccessSite accesscreate = new AccessSite();
       try{
           String requete = "INSERT INTO airports (user_id, nickname, password) VALUES (?,?,?)";
           PreparedStatement pst = this.bddmanager.getConnectionManager().prepareStatement(requete);
           pst.setLong(1, accesscreate.getUser_id());
           pst.setString(2, accesscreate.getNickname());
           pst.setString(3, accesscreate.getPassword());
           pst.executeUpdate();
           accesscreate = this.find(obj.getUser_id());
       }catch (SQLException ex) {
                ex.printStackTrace();
                return accesscreate;
            }
       return accesscreate;
    }

    @Override
    public boolean delete(AccessSite obj) {
        boolean success = false;

        if (this.bddmanager.connect()) {

            try {

                 
                String requete = "DELETE FROM access_site WHERE user_id LIKE ?";
                
                PreparedStatement pst = this.bddmanager.getConnectionManager().prepareStatement(requete);
                
                pst.setLong(1, obj.getUser_id());
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
    public boolean update(AccessSite obj) {
        boolean success = false;

        if (this.bddmanager.connect()) {

            try {

                // create requete 
                String requete = "Update access_site set nickname = ?,password = ? WHERE user_id LIKE ?";
                // prepared requete 
                PreparedStatement pst = this.bddmanager.getConnectionManager().prepareStatement(requete);
                // insert value in requete
                pst.setLong(1, obj.getUser_id());
                pst.setString(2, obj.getNickname());
                pst.setString(3, obj.getPassword());
                // excute update row in table
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
        return success;
    }

    @Override
    public ArrayList<AccessSite> getAll() {
        ArrayList<AccessSite> accessgetAll = new ArrayList<>();
        
        if(this.bddmanager.connect()) {
            
            try {
                Statement st = this.bddmanager.getConnectionManager().createStatement();
                String requete = "SELECT * FROM access_site";
                ResultSet rs = st.executeQuery(requete);
                
                while(rs.next()){
                    
                    AccessSite accessSite = new AccessSite(rs.getLong("user_id"), rs.getString("nickname"),
                            rs.getString("password"));
                    accessgetAll.add(accessSite);
                }
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                return accessgetAll;
            }
            
            
            
        } else {
        
        return accessgetAll;
    }
        return accessgetAll;
    }

    @Override
    public AccessSite find(Object key) {
        Airports accessFind = new Airports();
        if(this.bddmanager.connect()) {
            
            try {
                Statement st = this.bddmanager.getConnectionManager().createStatement();
                String requete = "SELECT * FROM airports WHERE aita = \""+ key + "\"";
                ResultSet rs = st.executeQuery(requete);
                
                while(rs.next()){
                    accessFind.setAita(rs.getString("aita"));
                    accessFind.setCity(rs.getString("city"));
                    accessFind.setPays(rs.getString("pays"));
                }
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                return accessFind;
            }
            
            
            
        } else {
        
        return accessFind;
    }
        return accessFind;
    }
    
}
