<%-- 
    Document   : registrarse
    Created on : Dec 8, 2021, 10:40:52 PM
    Author     : Roberto
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Registro del IMSS </title>    
        
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
                        Bienvenido a Registrarse
                    </div>
                    <form id="loginform" action="registrarUsuario" method="post">
                        <input type="text" id="nombresId" name="nombres" placeholder="Nombres" required>
                        <input type="text" id="apellidosId" placeholder="Apellidos" name="apellidos" required> 
                        <input type="text" id="correoId" name="correo" placeholder="Correo" required>
                        <input type="date" id="fechaNId"  name="fechaFin" required>
                        <select id="rolId" name="rol">
                            <option value="paciente">Paciente</option>
                            <option value="paciente">Doctor</option>  
                        </select>
                        <input type="password" placeholder="Contraseña" name="password" id="passwordId" required> 
                        <input type="text" name="confirpass" placeholder="Confirmar contraseña" required>
                        <button type="submit" title="Ingresar" name="Ingresar">Registrarse</button>
                    </form>
                </div>
                <div class="inferior">
                    <a href="index.jsp">Volver</a>
                </div>
            </div>
        </div>
    </body>
</html>
