package br.ucb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletIMC extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response){
		// Recebendo os parametros
		float altura = Float.parseFloat(request.getParameter("altura"));
		float peso = Float.parseFloat(request.getParameter("peso"));	
		// Chamar método e atribuir a mensagem ao atributo msg
		String msg = calcularIMC(altura, peso);
		// Printar
		try {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			out.println("<html><body><div align="+"center"+">"+msg+"</div></body></html>");
		} catch (IOException e){
			e.getStackTrace();
		}
		
	}
	
	public String calcularIMC(float altura, float peso){
		double pesoIdeal = ((altura - 1.10)*100);
		if (peso > pesoIdeal){
			return "Acima do PESO IDEAL ("+pesoIdeal+")!";  // Sem formatar, vai informar o peso ideal com todas as casas decimais...
		} else if (peso < pesoIdeal){
			return "Abaixo do PESO IDEAL ("+pesoIdeal+")!";
		}
		return "Você está em seu PESO IDEAL!";
	}
}
