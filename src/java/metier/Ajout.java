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
        
        Photo ph = new Photo(1, "1", bd0.getCategorybyId(1), "../../../web/assets/photos/musee/musee (1).jpg");
        bd.createPhoto(ph);
//        int fin = 52;
//        Photo[] ph = new Photo[fin-1];
//        for(int i = 1; i<fin+1; i++){
//            ph[i-1] = new Photo(i, Integer.toString(i), bd0.getCategorybyId(1), "../../../../web/assets/photos/musee ("+Integer.toString(i)+").jpg");
//        }
        
        
    }
    
}
