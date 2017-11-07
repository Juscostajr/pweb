/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juscelino Jr
 */
public class Principal implements Filter {

    private static final boolean debug = true;

    // The filter configuration object we are associated with.  If
    // this value is null, this filter instance is not currently
    // configured. 
    private FilterConfig filterConfig = null;

    public Principal() {
    }

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        PrintWriter out = response.getWriter();
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;

        Boolean a = request.getParameter("b") != null;

        Boolean b = request.getParameter("a") != null;

        if (a && b) {
            try {
                Boolean.parseBoolean(request.getParameter("a"));
                Boolean.parseBoolean(request.getParameter("b"));
                chain.doFilter(request, response);
            } catch (Exception e) {
                out.println("Número inválido");
            }
        } else {
            out.println("Todos campos são obrigatórios");
        }
    }

    public void destroy() {
    }

    /**
     * Init method for this filter
     */
    public void init(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;

    }

    public void log(String msg) {
        filterConfig.getServletContext().log(msg);
    }

}
