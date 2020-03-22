package br.com.bruno.javabrasil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Data {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();

		System.out.println(hoje);

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/YYYY");

		System.out.println(hoje.format(formatador));

		LocalDateTime agora = LocalDateTime.now();

		DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

		System.out.println(agora.format(formatadorHora));
		
		DateTimeFormatter formatadorCurto = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		
		System.out.println(agora.format(formatadorCurto));

	}

}
