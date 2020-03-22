package br.com.bruno.javabrasil;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormataDocumentos {

	private static String unformatodor(Formatter documentoOrigem, String documento) {

		return documentoOrigem.unformat(documento);
	}

	public static void main(String[] args) {
		String CPF = "009.736.851-23";
		String CNPJ = "56.125.514/0001-29";
		String Titulo = "712507321090";

		CPFFormatter cpfFormatador = new CPFFormatter();
		String unformat = cpfFormatador.unformat(CPF);
		System.out.println(unformat);

		CNPJFormatter cnpjFormatter = new CNPJFormatter();
		String unformat2 = cnpjFormatter.unformat(CNPJ);

		System.out.println(unformat2);

		TituloEleitoralFormatter tituloEleitoralFormatter = new TituloEleitoralFormatter();
		String tituloFormatado = tituloEleitoralFormatter.format(Titulo);

		System.out.println(tituloFormatado);
		
		String retorna = unformatodor(new CPFFormatter(),"009.736.851-23" );
		
		System.out.println(retorna);
	
	}

}
