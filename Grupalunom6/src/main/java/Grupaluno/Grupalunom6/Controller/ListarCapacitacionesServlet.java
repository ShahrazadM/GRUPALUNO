package Grupaluno.Grupalunom6.Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Grupaluno.Grupalunom6.Model.Capacitaciones;

@WebServlet("/listacapacitaciones")
public class ListarCapacitacionesServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        ArrayList<Capacitaciones> capacitaciones = new ArrayList<>();
        capacitaciones.add(new Capacitaciones(1, 23457886, "24 ", "1  pm", "oficina", "2 hs",2));
        capacitaciones.add(new Capacitaciones(2, 22222222, "18 ", "12 am", "local", "1 hs",5));
        capacitaciones.add(new Capacitaciones(3, 33333333, "20 ", "10 am", "central", "1 hs",2));
        capacitaciones.add(new Capacitaciones(4, 44444444, "23 ", "11 am", "local", "2 hs",8));
        capacitaciones.add(new Capacitaciones(5, 55555555, "12 ", "12 am", "central", "1 hs",0));
        request.setAttribute("capacitaciones", capacitaciones);
        request.getRequestDispatcher("/views/listacapacitaciones.jsp").forward(request, response);
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}