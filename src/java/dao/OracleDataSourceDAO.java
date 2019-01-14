package dao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.pool.OracleDataSource;

public class OracleDataSourceDAO extends OracleDataSource {
    private static OracleDataSourceDAO ods;
    
    private OracleDataSourceDAO() throws SQLException {
    }
    
    public static OracleDataSourceDAO getOracleDataSourceDAO() {
        try {
            ods = new OracleDataSourceDAO();
            ods.setDriverType("thin");
            ods.setPortNumber(1521);
            ods.setServiceName("orcl.univ-lyon1.fr");
            ods.setUser("p1709386");
            ods.setPassword("300730");
            ods.setServerName("iutdoua-oracle.univ-lyon1.fr");
        } catch (SQLException ex) {
            Logger.getLogger(OracleDataSourceDAO.class.getName()).log(Level.SEVERE,
                    null, ex);
        } finally {
            
        }
        return ods;
    }
}
