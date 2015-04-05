package br.ucb.controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.modelo.Mercadoria;
import br.ucb.modelo.Usuario;

@WebServlet("/Calcular.do")
public class ServletCalcular extends HttpServlet {
	private static final long serialVersionUID = 1l;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		RequestDispatcher dispatcher;
		Mercadoria mercadoria;
		Usuario cliente = new Usuario(); // Necessário inicializar pra não ter conflito fora do try
		try {
			mercadoria = new Mercadoria();
			mercadoria.setValor(Float.parseFloat(request.getParameter("valor")));
			cliente = (Usuario) request.getSession().getAttribute("cliente");
			cliente.setMercadoria(mercadoria);
			if (!cliente.getSenha().equals(request.getParameter("password"))){
				cliente.setNome("Sem Nome");
				cliente.setSenha("");
			}
			
			
		} catch (NumberFormatException e){
			e.getStackTrace();
		}
		dispatcher = request.getRequestDispatcher("saida.jsp");
		request.setAttribute("cliente", cliente);
		dispatcher.forward(request, response);
		
	}

}
