/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Entidades.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.DAOUsuarios;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import Entidades.Usuarios;

/**
 *
 * @author Armando
 */
@WebServlet(name = "registrarUsuario", urlPatterns = {"/registrarUsuario"})
public class registrarUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.text.ParseException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {

        DAOUsuarios dao = new DAOUsuarios();

        HttpSession session = request.getSession();
        RequestDispatcher rd;

//            RequestDispatcher rd;
        String nombre = (String) request.getParameter("nombres");
        String apellido = (String) request.getParameter("apellidos");
        String correo = (String) request.getParameter("correo");
        String fecha = (String) request.getParameter("fechaN");
        String rol = (String) request.getParameter("rol");
        String contra = (String) request.getParameter("password");

        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        Date fechaPars = formato.parse(fecha);

        Usuarios usuario = new Usuarios(nombre, apellido, fechaPars, contra, rol, correo);

        rd = request.getRequestDispatcher("index.jsp");
        try {

            dao.agregar(usuario);
            response.sendRedirect("index.jsp");
        } catch (Exception e) {
            response.sendRedirect("registrarse.jsp");
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
        } catch (ParseException ex) {
            Logger.getLogger(registrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (ParseException ex) {
            Logger.getLogger(registrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
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
