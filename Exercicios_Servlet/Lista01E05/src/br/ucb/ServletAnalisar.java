package br.ucb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletAnalisar extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		float notaFinal = 0;
		int presenca = 0, qtdAulas = 0;
		try{
			notaFinal = Float.parseFloat(request.getParameter("notaFinal"));
			presenca = Integer.parseInt(request.getParameter("presenca"));
			qtdAulas = Integer.parseInt(request.getParameter("qtdAulas"));
		} catch (NumberFormatException e){
			e.getStackTrace();
		}
		// Check
		String msg = analisarAluno(notaFinal, presenca, qtdAulas);
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<html><body><h2 align="+"center"+">Analisar Situação Do Aluno</h2><div align="+"center"+">"
				+ msg +"<p/> Nota: " + notaFinal + " | Quantidade de Presenças: " + presenca + "("+ (presenca * 100)/qtdAulas 
				+ "%)</div></body></html>");
		
	}

	public String analisarAluno(float notaFinal, int presenca, int qtdAulas){
		if ((notaFinal >= 6.0) && (presenca >= qtdAulas*.75))
			return "Aprovado!";
		return "Reprovado!";
		
	}
}
