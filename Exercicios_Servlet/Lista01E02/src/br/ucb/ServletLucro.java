package br.ucb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLucro extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		double valor = 0;
		// Handle
		try {
			// Já inserindo 30% no total da compra
			valor = (Double.parseDouble(request.getParameter("valor"))*0.3 + Double.parseDouble(request.getParameter("valor"))); 
		} catch (NumberFormatException e){
			e.getStackTrace();
		}
		// Imprimir
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<html><head><title>Preço</title></head>"
				+ "<div align="+"center"+"><p/>Valor calculado propondo o lucro de 30%: " + valor 
				+ "</div></html>");
		
	}

}
