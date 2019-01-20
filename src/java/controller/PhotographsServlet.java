/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.OracleCategoryDAO;
import dao.OracleDataSourceDAO;
import dao.OraclePhotoDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Category;
import model.Photo;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Michel
 */
@WebServlet(name = "PhotographsServlet", urlPatterns = {"/photographs"})
public class PhotographsServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        int catid = Integer.parseInt(request.getParameter("catid"));
        
        OracleCategoryDAO bd = new OracleCategoryDAO();
        OracleDataSource ods = OracleDataSourceDAO.getOracleDataSourceDAO();
        bd.setDataSource(ods);
        bd.setConnection(ods.getConnection());
        Category cat = bd.getCategorybyId(catid);
        request.setAttribute("cat", cat.getName());
        
        OraclePhotoDAO bd1 = new OraclePhotoDAO();
        OracleDataSource ods1 = OracleDataSourceDAO.getOracleDataSourceDAO();
        bd1.setDataSource(ods1);
        bd1.setConnection(ods1.getConnection());
        List<Photo> photoList = bd1.getPhotosByCategory(catid);
        request.setAttribute("photoList", photoList);
        if(photoList==null){
            request.setAttribute("photoNb", 0);
        }else{
            System.out.println(photoList.size());
            request.setAttribute("photoNb", photoList.size());
        }
        
        RequestDispatcher rd = request.getRequestDispatcher("photographs.jsp");
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(PhotographsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(PhotographsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
