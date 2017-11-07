<%-- 
    Document   : calculos.jsp
    Created on : 07/11/2016, 20:34:41
    Author     : Juscelino Jr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Caulculadora</h1>
        <%= session.getAttribute("a") %>
        <%= session.getAttribute("b") %>
        
        <a href="ServletCalcular?val=soma">Somar</a>
        <a href="ServletCalcular?val=sub">Subtrair</a>
        <a href="ServletCalcular?val=div">Dividir</a>
        <a href="ServletCalcular?val=mult">Multiplicar</a>
        
        <input type="text" value="<%= request.getParameter("msg") %>">
                
    </body>
</html>
