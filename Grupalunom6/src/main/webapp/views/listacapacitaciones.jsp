
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="Grupaluno.Grupalunom6.Model.Capacitaciones" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tabla de Capacitaciones </title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
 <%@ include file="minenu.jsp" %>
<div class="container">
   
    <section>
        <h1>Tabla de Capacitaciones</h1>
        
        <table class="table">
            <thead class="table-dark">
                <tr>
                    <th>Identificador</th>
                    <th>Rut Cliente</th>
                    <th>Día</th>
                    <th>Hora</th>
                    <th>Lugar</th>
                    <th>Duración</th>
                    <th>Cantidad Asistentes</th>
                </tr>           
            </thead>
            <tbody>
                <c:forEach var="capacitacion" items="${capacitaciones}">
                    <tr>
                        <td><c:out value="${capacitacion.identificador}"/></td>
                        <td><c:out value="${capacitacion.rutCliente}"/></td>
                        <td><c:out value="${capacitacion.dia}"/></td>
                        <td><c:out value="${capacitacion.hora}"/></td>
                        <td><c:out value="${capacitacion.lugar}"/></td>
                        <td><c:out value="${capacitacion.duracion}"/></td>
                        <td><c:out value="${capacitacion.cantidadAsistentes}"/></td>
                    </tr>
                </c:forEach>                           
            </tbody>        
        </table>        
    </section>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>