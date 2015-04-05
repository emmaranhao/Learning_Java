package br.ucb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.model.Pessoa;

public class ServletCalcularmedia extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		float media = 0;
		String msg;
		
		// handle
		try{
			media = (Float.parseFloat(request.getParameter("nota1")) + Float.parseFloat(request.getParameter("nota2")) + Float.parseFloat(request.getParameter("nota3")))/3;
		} catch(NumberFormatException e){
			e.getStackTrace();
		}
		// Catch!
		if (media <= 3){
			msg = "E";
		} else if (media <= 5){
			msg = "D";
		} else if (media <= 7){
			msg = "C";
		} else if (media <= 9){
			msg = "B";
		} else {
			msg = "A";
		}
		// Teste Servlet Context
		String msg2 = getServletContext().getInitParameter("EmailCliente");
		// Teste Listener
		Pessoa aluno = (Pessoa) getServletContext().getAttribute("Pessoa");
		// Fim teste Listener e Context
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<html><body><h2 align="+"center"+">Calcular Média do Aluno</h2><div align="+"center"+">" +
				"Média Total: " + media + " Qualificação: " + msg + "<br/>Email: " + msg2 + " Nome: " + aluno.getNome() + 
				"</div></body></html> ");
		
		
	}

}
