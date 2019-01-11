package exercicio03;

import java.util.Random;

public class Produtor implements Runnable{

	Cubiculo cub;
	
	public Produtor(Cubiculo cub) {
		this.cub = cub;
	}

	public void gerarPalavra() {
		Random gerador = new Random();
		String palavra = "";
		for (int i = 0; i < 5; i++) {
			char aux = (char) (gerador.nextInt(26) + 65);
			palavra += aux; 
//			palavra += Character.forDigit((gerador.nextInt(26) + 65), 10);
		}
		cub.amarzenarPalavra("Produtor", palavra);
		System.out.println("Palavra gerada == \"" + palavra + "\"");
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			gerarPalavra();
		}
	}
	
}
