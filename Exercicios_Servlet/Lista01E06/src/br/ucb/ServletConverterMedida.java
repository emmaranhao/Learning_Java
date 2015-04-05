package br.ucb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConverterMedida extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		converterMedida(request, response);
		
	}
	
	public void converterMedida(HttpServletRequest request, HttpServletResponse response) throws IOException {
		boolean eMilhas = Boolean.parseBoolean(request.getParameter("tipo"));
		double valor = 0;
		String msg = "";
		// Handle e realizando os calculos
		try{
			if (eMilhas) {
				valor = (Double.parseDouble(request.getParameter("valor")) * 1610); // 1mi = 1.61km -> 1610m
				msg = "Milhas";
			} else {
				valor = (Double.parseDouble(request.getParameter("valor")) / 3.28); // 1m - 3.28ft
				msg = "Pés";
			}
		} catch (NumberFormatException e){
			e.getStackTrace();
		}
		// Print
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<html><body><h2 align="+"center"+">Converter "+ msg +" para Metros</h2>"
				+ "<div align="+"center"+">"
				+ request.getParameter("valor") + " " + msg + " -> " + valor + " Metros"
				+ "</body></html>");
		
	}
}
