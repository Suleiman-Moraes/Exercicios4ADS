package exercicio03;

public class TheExecutor {
	public static void main(String[] args) {
		Cubiculo cblol = new Cubiculo();
		
		Consmidor consmidor = new Consmidor(cblol);
		Produtor produtor = new Produtor(cblol);
		
		new Thread(consmidor).start();
		new Thread(produtor).start();
	}
}
