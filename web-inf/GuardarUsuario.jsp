<%@ page import="src.Dao.Usuario" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String username = request.getParameter("username");
    String email = request.getParameter("email");
    String password = request.getParameter("pass");


    Usuario usuario = new Usuario(username, email, password);

    String msg = usuario.guardarUsuario();
%>
<html>
<head>
</head>