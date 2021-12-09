<%-- 
    Document   : inicio
    Created on : Dec 9, 2021, 2:28:07 AM
    Author     : Roberto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <title> Inicio del IMSS </title>
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
                        Bienvenido 
                    </div>
                    <form id="loginform"> 
                       <a href="crearExpediente.jsp"><button type="submit"title="Ingresar" name="Ingresar">Crear Expediente</a></button>
                       <a href="buscarExpediente.jsp"><button type="submit"title="Ingresar" name="Ingresar">Acceder Expediente</a></button>
                    </form>
                </div>
            </div>
        </div>

    </body>
</html>