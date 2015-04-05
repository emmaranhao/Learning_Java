package br.ucb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConverter extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		float farenheit  = 0;
		// Handle
		try {
			// Recebendo parametros e já utilizando a formula (far = ((celsius * 9)/5) + 32)
			farenheit = ((Float.parseFloat(request.getParameter("celsius")) * 9)/5) + 32;
		} catch (NumberFormatException e){
			e.getStackTrace();
		}
		// Imprimir
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title>Conversor</title></head>"
				+ "<p/><h1 align="+"center"+">Converter Celsius -> Farenheit</h1><body>"
				+ "<div align="+"center"+"><b>Valor convertido:</b> " + farenheit + " ºF"
				+ "</div></body></html>");
		
	}
}
