package br.com.bruno.javabrasil;

import java.math.BigDecimal;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class NumeroExtenso {

	public static void main(String[] args) {
  
		
	NumericToWordsConverter conversor = new	NumericToWordsConverter(new InteiroSemFormato());
	BigDecimal valor = new BigDecimal("89");
	String valorPorExtenso = conversor.toWords(valor.doubleValue());
	System.out.println(valorPorExtenso);
	
	
	NumericToWordsConverter conversorReal = new	NumericToWordsConverter(new FormatoDeReal());
	BigDecimal valorReal = new BigDecimal("89.90");
	String valorPorExtensoReal = conversorReal.toWords(valorReal.doubleValue());
	System.out.println(valorPorExtensoReal);
	}

}
