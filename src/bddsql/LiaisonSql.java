/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bddsql;

/**
 *
 * @author Formation
 */
public class LiaisonSql {
    
    private LiaisonSql() {
    }
    
    public static LiaisonSql getInstance() {
        return LiaisonSqlHolder.INSTANCE;
    }
    
    private static class LiaisonSqlHolder {

        private static final LiaisonSql INSTANCE = new LiaisonSql();
    }
}
