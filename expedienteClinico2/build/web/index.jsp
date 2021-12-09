<%-- 
    Document   : index
    Created on : Dec 8, 2021, 10:41:57 PM
    Author     : Roberto
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Login del IMSS </title>    
        
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <link href="https://fonts.googleapis.com/css?family=Nunito&display=swap" rel="stylesheet"> 
        <link href="https://fonts.googleapis.com/css?family=Overpass&display=swap" rel="stylesheet">
        
        <!-- Link hacia el archivo de estilos css -->
        <link rel="stylesheet" href="css/style.css">

        <style type="text/css">

        </style>
    </head>
    <body>
        <div id="contenedor">
            <div id="central">
                <div id="login">
                    <div class="titulo">
                        Bienvenido al Login
                    </div>
                    <form id="loginform" action="consultarUsuario" method="post"> 
                        <input type="text" name="correo" placeholder="Correo" required>
                        <input type="password" placeholder="Contraseña" name="password" required>   
                        <button type="submit" title="Ingresar" name="Ingresar">Login</button>
                    </form>
                    <div class="pie-form">
                        <a href="#">¿Perdiste tu contraseña?</a>
                        <a href="registrarse.jsp">¿No tienes Cuenta? Registrate</a>
                        
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
