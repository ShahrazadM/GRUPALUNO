package Grupaluno.Grupalunom6;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
@WebServlet("/")
public class InicioServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lógica para manejar solicitudes GET relacionadas con la página de inicio
        response.setContentType("text/html");
        response.getWriter().println("<h1>Bienvenido al Portal de Prevención de Riesgos</h1>");
        response.getWriter().println("<h2>Iniciar Sesión</h2>");
        response.getWriter().println("<form action=\"inicio\" method=\"post\">");
        response.getWriter().println("Usuario: <input type=\"text\" name=\"usuario\"><br>");
        response.getWriter().println("Contraseña: <input type=\"password\" name=\"contrasena\"><br>");
        response.getWriter().println("<input type=\"submit\" value=\"Iniciar Sesión\">");
        response.getWriter().println("</form>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lógica para manejar solicitudes POST relacionadas con la página de inicio
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");

        // Aquí puedes agregar la lógica para verificar las credenciales de inicio de sesión
        // Por ejemplo, consultar una base de datos para verificar si el usuario y la contraseña son válidos

        // Simulación: Verificar si las credenciales son válidas (usuario: admin, contraseña: admin)
        if ("admin".equals(usuario) && "admin".equals(contrasena)) {
            // Credenciales válidas, redirigir al usuario a una página de inicio de sesión exitosa
        	RequestDispatcher dispatcher = request.getRequestDispatcher("views/portalinicio.jsp");
            dispatcher.forward(request, response);
        } else {
            // Credenciales inválidas, volver a mostrar el formulario de inicio de sesión con un mensaje de error
            response.setContentType("text/html");
            response.getWriter().println("<h1>Error de inicio de sesión</h1>");
            response.getWriter().println("<p>Usuario o contraseña incorrectos. Por favor, inténtalo de nuevo.</p>");
            response.getWriter().println("<h2>Iniciar Sesión</h2>");
            response.getWriter().println("<form action=\"inicio\" method=\"post\">");
            response.getWriter().println("Usuario: <input type=\"text\" name=\"usuario\"><br>");
            response.getWriter().println("Contraseña: <input type=\"password\" name=\"contrasena\"><br>");
            response.getWriter().println("<input type=\"submit\" value=\"Iniciar Sesión\">");
            response.getWriter().println("</form>");
        }
    }
}

