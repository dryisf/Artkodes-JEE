package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import model.Category;

/*
    Comment utiliser ce DAO ?

    OracleCategoryDAO bd = new OracleCategoryDAO() ;
    OracleDataSource ods = OracleDataSourceDAO.getOracleDataSourceDAO();
    bd.setDataSource(ods);
    bd.setConnection(ods.getConnection());
        
    List<Category> catList = bd.getAllCategories();
    List<Category> catList = bd.getCategoryById(photo.getCategory().getCatId());
    Category = new Category(id, nom, description);
    bd.createCategory(Category category);
    bd.deleteCategory(category.getCatId());
*/
public class OracleCategoryDAO{
    private DataSource ds;
    private Connection connexionBD;

    public void setDataSource(DataSource ds) {
        this.ds = ds;
    }
    
    public void setConnection(Connection c) {
        this.connexionBD = c;
    }
    
    public List<Category> getAllCategories() {
        Statement stmt;
        List<Category> catList = new ArrayList<Category>();
        try {
            stmt = connexionBD.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM CATEGORY ORDER BY CATID");
            while (rs.next()) {
                Category cat = new Category(rs.getInt("CATID"), rs.getString("CATNAME"), rs.getString("CATDESC"));
                catList.add(cat);
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(OraclePhotoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return catList;
    }

    public Category getCategorybyId(int catId){
        Statement stmt;
        Category cat = null;
        try {
            stmt = connexionBD.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM CATEGORY WHERE CATID="+catId);
            if(rs.next() == false){
                cat = new Category(-1, "Catégorie inconnue", "Catégorie inconnue");
            }else{
                cat = new Category(rs.getInt("CATID"), rs.getString("CATNAME"), rs.getString("CATDESC"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(OraclePhotoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cat;
    }
    
    public void createCategory(Category category){
        PreparedStatement stmt;
        try {
            stmt = connexionBD.prepareStatement("INSERT INTO CATEGORY VALUES(?, ?, ?)");
            stmt.setInt(1,category.getCatId());
            stmt.setString(2,category.getName());
            stmt.setString(3,category.getDescription());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OraclePhotoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteCategory(int catId){
        PreparedStatement stmt;
        try {
            stmt = connexionBD.prepareStatement("DELETE FROM CATEGORY WHERE CATID = ?");
            stmt.setInt(1, catId);
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OraclePhotoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}