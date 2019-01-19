package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import model.Photo;
import oracle.jdbc.pool.OracleDataSource;

/*
    Comment utiliser ce DAO ?

    OraclePhotoDAO bd = new OraclePhotoDAO() ;
    OracleDataSource ods = OracleDataSourceDAO.getOracleDataSourceDAO();
    bd.setDataSource(ods);
    bd.setConnection(ods.getConnection());
        
    List<Photo> photoList = bd.getAllPhotos();
    List<Photo> photoList = bd.getPhotosByCategory([une classe Category]);
    Photo photo = new Photo(id, nom, [une classe Category], path);
    bd.createPhoto(photo);
    bd.deletePhoto(photo.getPhotoId());
*/
public class OraclePhotoDAO{
    private DataSource ds;
    private Connection connexionBD;

    public void setDataSource(DataSource ds) {
        this.ds = ds;
    }

    public void setConnection(Connection c) {
        this.connexionBD = c;
    }
    
    public List<Photo> getAllPhotos() throws SQLException {
        Statement stmt;
        List<Photo> photoList = null;
        OracleCategoryDAO bd = new OracleCategoryDAO() ;
        OracleDataSource ods = OracleDataSourceDAO.getOracleDataSourceDAO();
        bd.setDataSource(ods);
        bd.setConnection(ods.getConnection());
        try {
            stmt = connexionBD.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM PHOTO ORDER BY PHOTOID");
            while (rs.next()) {
                Photo photo = new Photo(rs.getInt("PHOTOID"), rs.getString("PHOTONAME"), bd.getCategorybyId(rs.getInt("PHOTOCAT")), rs.getString("PHOTOPATH"));
                photoList.add(photo);
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(OraclePhotoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return photoList;
    }
    
    public List<Photo> getPhotosByCategory(int catid) throws SQLException{
        Statement stmt;
        List<Photo> photoList = null;
        OracleCategoryDAO bd = new OracleCategoryDAO() ;
        OracleDataSource ods = OracleDataSourceDAO.getOracleDataSourceDAO();
        bd.setDataSource(ods);
        bd.setConnection(ods.getConnection());
        try {
            stmt = connexionBD.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM PHOTO WHERE PHOTOCAT = "+catid+" ORDER BY PHOTOID");
            while (rs.next()) {
                Photo photo = new Photo(rs.getInt("PHOTOID"), rs.getString("PHOTONAME"), bd.getCategorybyId(rs.getInt("PHOTOCAT")), rs.getString("PHOTOPATH"));
                photoList.add(photo);
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(OraclePhotoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return photoList;
    }

    public void createPhoto(Photo photo) {
        PreparedStatement stmt;
        try {
            stmt = connexionBD.prepareStatement("INSERT INTO PHOTO VALUES(?, ?, ?, ?)");
            stmt.setInt(1,photo.getPhotoId());
            stmt.setString(2,photo.getName());
            stmt.setInt(3,photo.getCategory().getCatId());
            stmt.setString(4,photo.getPath());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OraclePhotoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deletePhoto(int photoId) {
        PreparedStatement stmt;
        try {
            stmt = connexionBD.prepareStatement("DELETE FROM PHOTO WHERE PHOTOID = ?");
            stmt.setInt(1, photoId);
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OraclePhotoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
