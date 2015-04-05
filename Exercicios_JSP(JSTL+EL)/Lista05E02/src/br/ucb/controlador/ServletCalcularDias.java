package br.ucb.controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.modelo.Dias;

@WebServlet("/Calcular.do")
public class ServletCalcularDias extends HttpServlet {
	private static final long serialVersionUID = 1l;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		RequestDispatcher dispatcher;
		Dias calculadoraDias = new Dias();
		long diasVividos = 0;
		
		try {
			diasVividos = calculadoraDias.calcularDias(request.getParameter("dataNascimento"));
		} catch (NumberFormatException e){
			e.getStackTrace();
		}
		
		dispatcher = request.getRequestDispatcher("saida.jsp");
		request.setAttribute("dias", diasVividos);
		dispatcher.forward(request,  response);
		
	}

}
