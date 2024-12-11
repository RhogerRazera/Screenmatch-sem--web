package br.com.alura.screenmatchultimo;

import br.com.alura.screenmatchultimo.model.DadosSerie;
import br.com.alura.screenmatchultimo.service.ConsumoApi;
import br.com.alura.screenmatchultimo.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchultimoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchultimoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados( "http://www.omdbapi.com/?i=tt3896198&apikey=bb3bc67b");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

	}
}
