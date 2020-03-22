package br.com.bruno.javabrasil;

import java.util.Collection;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.NumberValue;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.function.MonetaryOperators;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class Dinheiro {

	public static void main(String[] args) {
      
		
		
		//Qual moeda estamos trabalhando
		
		
		CurrencyUnit moeda = Monetary.getCurrency("BRL");
		MonetaryAmount valorParcela = Money.of(98.00, moeda);
		
		System.out.println(valorParcela);
		
		MonetaryAmount valorTotal = valorParcela.multiply(12);
		
		System.out.println(valorTotal);
		
		MonetaryAmount desconto = valorTotal.with(MonetaryOperators.percent(10));
		
		NumberValue descontoSemMoeda = desconto.getNumber();
		
		NumericToWordsConverter conversor = new NumericToWordsConverter( new FormatoDeReal());
		
		String valorPorExtenso = conversor.toWords(descontoSemMoeda.doubleValue());
		
		System.out.println(valorPorExtenso);
		
		
		
		
		
	}

}
