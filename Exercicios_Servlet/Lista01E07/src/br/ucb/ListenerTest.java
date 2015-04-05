package br.ucb;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import br.ucb.model.Pessoa;

public class ListenerTest implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
		
	}
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		ServletContext sc = arg0.getServletContext();
		String str = sc.getInitParameter("Pessoa");
		
		Pessoa pessoa = new Pessoa(str);
		sc.setAttribute("Pessoa", pessoa);
	
	}
	

}
