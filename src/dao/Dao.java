/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bddsql.LiaisonSql;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public abstract class Dao<T, S> {
   
    protected LiaisonSql bddmanager = null;

    public Dao(){
        this.bddmanager = LiaisonSql.getInstance();
    }

public abstract T create(T obj);
public abstract boolean delete(T obj);
public abstract boolean update(T obj);
public abstract ArrayList<T> getAll();
public abstract T find(S key);


}

