package br.com.bruno.javabrasil;


//para validarmos um cpf devemos fazer o seguinte

// EXEMPLO : 862.883.667-57
// Pegamos cada numero e multiplicamos de forma decrescente começando por 10 conforme abaixo
// LOGO 8*10 + 6*9 + 2*8 + 8*7 + 8*6 + 3*5 + 6*4 + 6*3 + 7*2 = 325
// Multiplica essa soma por 10 = 3250
// Dividimos 3250 por 11 = 295
// o resto da divisao arredondada é 5
// logo o primeiro digito verificador 5 está correto
// validar o segundo digito verificador
// 8*11 + 6*10 + 2*9 + 8*8 + 8*7 + 3*6 + 6*5 + 6*4 + 7*3 + 5*2 = 389
// Multiplica essa soma por 10 = 3890
// Dividimos 3890 por 11 = 353
// o resto da divisao arredondada é 7
// Logo os digitos verificadores são o resto da das duas divisões 5 e 7


import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

public class ValidaDocumentos {

	private static void validarDocumentos(Validator<String> validador, String documento) {
		validador.assertValid(documento); // Criada o validador baseado em todos que existem já passando a String
	}

	public static void main(String[] args) {

		String CpfAntigo = "00973685123";
		CPFValidator cpfValidator = new CPFValidator(); // Com a criação do metodo acima estas declarações ficaram
														// obsoletas

		try {
			validarDocumentos(new CPFValidator(), "86288366757");
			System.out.println("CPF é valido!");

		} catch (InvalidStateException e) {
			System.out.println("CPF não é valido!" + e);
		}

		try {
			validarDocumentos(new CNPJValidator(), "56.125.514/0001-29");
			System.out.println("CNPJ VÁLIDO");

		} catch (InvalidStateException e) {
			System.out.println("CNPJ INVALIDO " + e);
			// TODO: handle exception
		}

		try {

			validarDocumentos(new TituloEleitoralValidator(), "71250732109");
			System.out.println("Título VALIDO");

		} catch (Exception e) {
			System.out.println("Título INVALIDO" + e);
		}

	}

}
