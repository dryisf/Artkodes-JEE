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

public class OraclePhotoDAO{
    private DataSource ds;
    private Connection connexionBD;

    public void setDataSource(DataSource ds) {
        this.ds = ds;
    }

    public void setConnection(Connection c) {
        this.connexionBD = c;
    }
    
    public List<Photo> getLesMinibus() {
        Statement stmt;
        List<Photo> photoList = null;
        try {
            stmt = connexionBD.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM PHOTO");
            while (rs.next()) {
                Photo photo = new Photo(rs.getInt("..."), rs.getInt("..."));
                photoList.add(photo);
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(OraclePhotoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return photoList;
    }

    public void creerPhoto(Photo photo) {
        PreparedStatement stmt;
        try {
            stmt = connexionBD.prepareStatement("INSERT INTO PHOTO VALUES(?, ?)");
            stmt.setInt(1,photo.get...());
            stmt.setInt(2,photo.get..photo.());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OraclePhotoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void supprimerPhoto(int photoId) {
        PreparedStatement stmt;
        try {
            stmt = connexionBD.prepareStatement("DELETE FROM PHOTO WHERE ... = ?");
            stmt.setInt(1, photoId);
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OraclePhotoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
