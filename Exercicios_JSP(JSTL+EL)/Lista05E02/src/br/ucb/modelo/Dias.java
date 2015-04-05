package br.ucb.modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Dias implements Serializable {
	private static final long serialVersionUID = 1l;
	private Calendar dataFinal;
	
	public Calendar getDataFinal() {
		return dataFinal;
	}

	public Long calcularDias(String dataString){
		Calendar dataAtual = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		dataFinal = new GregorianCalendar();
		try {
			Date nascimento = format.parse(dataString); 
			dataFinal.setTime(nascimento);
		} catch (java.text.ParseException e){
			e.getStackTrace();
		}
		return (dataAtual.getTimeInMillis() - dataFinal.getTimeInMillis())/ (1000*60*60*24);
	}
		

}
