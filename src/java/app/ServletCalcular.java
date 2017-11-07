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
public class ServletCalcular extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(true);
        String operador = request.getParameter("val");

        Double a = Double.parseDouble(session.getAttribute("a").toString());
        Double b = Double.parseDouble(session.getAttribute("b").toString());

        Double operacao;
        switch (operador) {
            case "soma":
                operacao = a + b;
                break;
            case "sub":
                operacao = a - b;
                break;
            case "div":
                operacao = a / b;
                break;
            case "mult":
                operacao = a * b;
                break;
            default:
                operacao = 0.0;
        }
        response.sendRedirect("calculos.jsp?msg=" + operacao);
        out.print(operacao);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
