package br.com.alura.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.screenmatch.modelo.DadosSerie;
import br.com.alura.screenmatch.servico.ConsumApi;
import br.com.alura.screenmatch.servico.ConverterDados;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumApi = new ConsumApi();
		var json = consumApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		//System.out.println(json);
		
		// json = consumApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		// System.out.println(json);

		ConverterDados conversor = new ConverterDados();
		DadosSerie dados = conversor.obterDados(json,DadosSerie.class);
		System.out.println(dados);
	}

}
