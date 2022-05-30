<% import "../../../../../../../../Usuario"
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String nombreUsuario = request.getParameter("username");
    String numDoc = request.getParameter("numeroDocumento");
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String email = request.getParameter("email");
    String telefono = request.getParameter("telefono");
    String password = request.getParameter("password");

    Usuario usuario = new Usuario(tipoDoc, numDoc, nombre, apellido,
            email, telefono, password);

    String msg = usuario.guardarUsuario();
%>