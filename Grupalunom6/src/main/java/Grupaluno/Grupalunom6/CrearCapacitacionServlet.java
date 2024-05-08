package Grupaluno.Grupalunom6;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CrearCapacitacionServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lógica para manejar solicitudes GET relacionadas con la creación de capacitaciones
        response.setContentType("text/html");
        response.getWriter().println("<h1>Crear Nueva Capacitación</h1>");
        response.getWriter().println("<form action=\"creacapacitacion\" method=\"post\">");
        response.getWriter().println("Título: <input type=\"text\" name=\"titulo\"><br>");
        response.getWriter().println("Descripción: <textarea name=\"descripcion\" rows=\"5\" cols=\"50\"></textarea><br>");
        response.getWriter().println("<input type=\"submit\" value=\"Crear\">");
        response.getWriter().println("</form>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lógica para manejar solicitudes POST relacionadas con la creación de capacitaciones
        String titulo = request.getParameter("titulo");
        String descripcion = request.getParameter("descripcion");

        // Aquí puedes agregar la lógica para procesar la creación de la capacitación
        // Por ejemplo, guardar la nueva capacitación en una base de datos

        // Respondemos al usuario indicando que la capacitación fue creada
        response.setContentType("text/html");
        response.getWriter().println("<h1>Capacitación Creada</h1>");
        response.getWriter().println("<p>La capacitación '" + titulo + "' ha sido creada correctamente.</p>");
    }
}