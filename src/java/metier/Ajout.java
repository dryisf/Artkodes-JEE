/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import dao.OracleCategoryDAO;
import dao.OracleDataSourceDAO;
import dao.OraclePhotoDAO;
import java.sql.SQLException;
import model.Photo;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author daryl
 */
public class Ajout {
    public static void main(String[] args) throws SQLException{
        OracleCategoryDAO bd0 = new OracleCategoryDAO() ;
        OraclePhotoDAO bd = new OraclePhotoDAO();
        OracleDataSource ods0 = OracleDataSourceDAO.getOracleDataSourceDAO();
        
        bd.setDataSource(ods0);
        bd.setConnection(ods0.getConnection());
        bd0.setDataSource(ods0);
        bd0.setConnection(ods0.getConnection());
////        
        Photo ph = new Photo(96, "9", bd0.getCategorybyId(5), "./assets/photos/tired-boys/tb(9).jpg");
        bd.createPhoto(ph);
        
//        int debut = 89;
//        int fin = 9;
//        Photo[] ph = new Photo[fin-1];
//        for(int i = 1; i<fin+1; i++){
//            ph[i-1] = new Photo(debut-1, Integer.toString(i), bd0.getCategorybyId(5), "./assets/photos/tired-boys/tb("+Integer.toString(i)+").jpg");
//              bd.createPhoto(ph[i-1]);
//              debut++;
//        }
//        
        
    }
    
}
