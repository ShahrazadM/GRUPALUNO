<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Crear Nueva Capacitación</title>
    <style>
        /* Estilo para el formulario */
        .formulario-container {
            max-width: 600px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .formulario-container h1 {
            color: #333;
        }
        .formulario-container input[type="text"],
        .formulario-container textarea {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
            box-sizing: border-box;
        }
        .formulario-container input[type="submit"] {
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }
        .formulario-container input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <%@ include file="minenu.jsp" %> <!-- Incluye el menú -->
    <div class="formulario-container">
        <h1>Crear NuevasCapacitación</h1>
        <form action="creacapacitacion" method="post">
            <label for="titulo">Título:</label>
            <input type="text" id="titulo" name="titulo" required><br>
            <label for="descripcion">Descripción:</label>
            <textarea id="descripcion" name="descripcion" rows="5" required></textarea><br>
            <input type="submit" value="Crear">
        </form>
    </div>
</body>
</html>
