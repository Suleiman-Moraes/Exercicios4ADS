package exercicio03;

public class Consmidor implements Runnable{
	Cubiculo cub;
	
	public Consmidor(Cubiculo cub) {
		this.cub = cub;
	}

	public void consumirPalavra() {
		String palavra = "";
		try {
			palavra = cub.consumirPalavra("Consumidor");
			System.out.println("Palavra consumida == \"" + palavra + "\"");
		} catch (Exception e) {
			palavra = "";
		}
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			consumirPalavra();
		}
	}
}
