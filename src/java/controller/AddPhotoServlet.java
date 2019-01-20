/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.OracleCategoryDAO;
import dao.OracleDataSourceDAO;
import dao.OraclePhotoDAO;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.CREATE;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import model.Photo;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Michel
 */
@WebServlet(name = "AddPhotoServlet", urlPatterns = {"/addphoto"})
@MultipartConfig
public class AddPhotoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        HttpSession session = request.getSession();
        if(request.getParameter("photoname")==null){
            if(session.getAttribute("username")!=null){
                RequestDispatcher rd = request.getRequestDispatcher("addphoto.jsp");
                rd.forward(request, response);
            }else{
                request.setAttribute("alertFail", "Vous devez vous connecter pour accéder à cette page");

                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }
        }else{
            if(session.getAttribute("username")!=null){
                String photoName = request.getParameter("photoname");
                int catid = Integer.parseInt(request.getParameter("cat"));
                Part filePart = request.getPart("photo");
                String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
                
                OraclePhotoDAO bd = new OraclePhotoDAO() ;
                OracleDataSource ods = OracleDataSourceDAO.getOracleDataSourceDAO();
                bd.setDataSource(ods);
                bd.setConnection(ods.getConnection());
                
                int photoId = bd.getPhotoMaxId()+1;
                int photoNo = bd.getPhotosByCategory(catid).size()+1;
                
                OutputStream out = null;
                PrintWriter writer = response.getWriter();
                InputStream filecontent = null;
                byte[] data;
                String path = "";
                switch(catid){
                    case 0: out = new FileOutputStream(new File("./assets/photos/deception/deception("+photoNo+").jpg"));
                            filecontent = filePart.getInputStream();
                            data = new byte[filecontent.available()];
                            out.write(data, 0, data.length);
                            path = "./assets/photos/deception/deception("+photoNo+").jpg";
                            break;
                    case 1: out = new FileOutputStream(new File("./assets/photos/musee/musee("+photoNo+").jpg"));
                            filecontent = filePart.getInputStream();
                            data = new byte[filecontent.available()];
                            out.write(data, 0, data.length);
                            path = "./assets/photos/musee/musee("+photoNo+").jpg";
                            break;
                    case 2: out = new FileOutputStream(new File("./assets/photos/pfw/pfw("+photoNo+").jpg"));
                            filecontent = filePart.getInputStream();
                            data = new byte[filecontent.available()];
                            out.write(data, 0, data.length);
                            path = "./assets/photos/pfw/pfw("+photoNo+").jpg";
                            break;
                    case 3: out = new FileOutputStream(new File("./assets/photos/rebel/rebel("+photoNo+").jpg"));
                            filecontent = filePart.getInputStream();
                            data = new byte[filecontent.available()];
                            out.write(data, 0, data.length);
                            path = "./assets/photos/rebel/rebel("+photoNo+").jpg";
                            break;
                    case 4: out = new FileOutputStream(new File("tp("+photoNo+").jpg"));
                            filecontent = filePart.getInputStream();
                            data = new byte[filecontent.available()];
                            out.write(data, 0, data.length);
                            path = "./assets/photos/the-prince/tp("+photoNo+").jpg";
                            break;
                    case 5: out = new FileOutputStream(new File("./assets/photos/tired-boys/tb("+photoNo+").jpg"));
                            filecontent = filePart.getInputStream();
                            data = new byte[filecontent.available()];
                            out.write(data, 0, data.length);
                            path = "./assets/photos/tired-boys/tb("+photoNo+").jpg";
                            break;
                }
                
                OracleCategoryDAO bd1 = new OracleCategoryDAO() ;
                OracleDataSource ods1 = OracleDataSourceDAO.getOracleDataSourceDAO();
                bd1.setDataSource(ods1);
                bd1.setConnection(ods1.getConnection());
                
                Photo photo = new Photo(photoId, photoName, bd1.getCategorybyId(catid), path);
                bd.createPhoto(photo);
                
                request.setAttribute("alertSuccess", "Votre photo a bien été ajoutée");

                RequestDispatcher rd = request.getRequestDispatcher("addphoto.jsp");
                rd.forward(request, response);
            }
        }
        
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
            Logger.getLogger(AddPhotoServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AddPhotoServlet.class.getName()).log(Level.SEVERE, null, ex);
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
