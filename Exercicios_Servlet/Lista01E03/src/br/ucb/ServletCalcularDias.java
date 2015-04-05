package br.ucb;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCalcularDias extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			calcularDias(request, response); // Fiz um throws lá e dando handle aqui.
		} catch (IOException e){
			e.getStackTrace();
		}
	}

	public void calcularDias(HttpServletRequest request, HttpServletResponse response) throws IOException {	
		Calendar dataFinal = new GregorianCalendar();
		Calendar dataAtual = Calendar.getInstance(); // Data Atual
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			
		try {
			Date nascimento = format.parse(request.getParameter("data")); // Data vinda do request como string e formatada com a ajuda do SampleDate
			dataFinal.setTime(nascimento);
		} catch (java.text.ParseException e){
			e.getStackTrace();
		}
		PrintWriter out = response.getWriter();
		out.println("<html><body><p/><p/><div align="+"center"+"> Total de dias que você viveu: "+(dataAtual.getTimeInMillis() - dataFinal.getTimeInMillis())/ (1000*60*60*24)+ " dias</div></body></html>");
		
	}
}
