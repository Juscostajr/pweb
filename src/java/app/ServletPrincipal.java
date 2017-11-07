/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Juscelino Jr
 */
public class ServletPrincipal extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    //
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String a = request.getParameter("a");
       String b = request.getParameter("b");
       
       

           HttpSession session = request.getSession(true);
           session.setAttribute("a", Double.parseDouble(a));
           session.setAttribute("b", Double.parseDouble(b));
           
           response.sendRedirect("calculos.jsp");

       
       
      
       
       
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
