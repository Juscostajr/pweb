<%-- 
    Document   : index
    Created on : 07/11/2016, 19:45:08
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
        <h1>Calculadora</h1>
        <form method="post" action="ServletPrincipal">
        <input type="text" name="a" placeholder="informe o número A">
        <input type="text" name="b" placeholder="informe o número B">
        <input type="submit" value="calcular">
        </form>
    </body>
</html>
