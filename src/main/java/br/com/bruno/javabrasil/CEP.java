package br.com.bruno.javabrasil;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

public class CEP {

	public static void main(String[] args) {

		String CEP = "74303020";
//
//		URL url = new URL("https://viacep.com.br/ws/" + CEP + "/json/");
//		HttpsURLConnection conexao = (HttpsURLConnection) url.openConnection();
//		conexao.setRequestMethod("GET");
//		conexao.getInputStream(); // Podemos fazer assim, ou via MAVEN por uma api que importei dentro do porn.xml
//
//		System.out.println(url);
//
//		conexao.disconnect();

		ViaCEPClient cliente = new ViaCEPClient();

		try {

			ViaCEPEndereco endereco = cliente.getEndereco("74303020");
			System.out.println(endereco.getBairro());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
