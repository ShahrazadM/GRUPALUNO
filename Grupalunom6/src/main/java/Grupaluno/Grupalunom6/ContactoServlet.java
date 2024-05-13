package Grupaluno.Grupalunom6;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/contacto")
public class ContactoServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lógica para manejar solicitudes GET relacionadas con el formulario de contacto
        request.getRequestDispatcher("/views/contacto.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lógica para manejar solicitudes POST relacionadas con el formulario de contacto
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        String asunto = request.getParameter("asunto");
        String mensaje = request.getParameter("mensaje");

        // Aquí puedes agregar la lógica para procesar el formulario enviado por el usuario
        // Por ejemplo, enviar un correo electrónico al administrador del sitio con la información del formulario

        // Respondemos al usuario indicando que el formulario fue recibido
        response.setContentType("text/html");
        response.getWriter().println("<h1>Formulario Recibido</h1>");
        response.getWriter().println("<p>Gracias por contactarnos, " + nombre + ".</p>");
    }
}

