/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airafpa;

import bddsql.LiaisonSql;
import dao.*;
import data.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class Airafpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // pour afficher la liste :
        AirportsDao el = new AirportsDao();
    ArrayList<Airports> listeaireport = el.getAll();
        System.out.println("on a "+ listeaireport.size() + " les Airoport :");  
        System.out.println();
        
        for(Airports ai : listeaireport) {
            System.out.println("N° " + ai.getAita()+ "/ " + ai.getCity()+ " " + ai.getPays());
    }
        
    }
    
}
