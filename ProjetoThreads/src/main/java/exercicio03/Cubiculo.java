package exercicio03;

public class Cubiculo {

	private String palavra = "";
	private boolean online = true;
	
	public synchronized void amarzenarPalavra(String nome, String palavra) {
		while (!online) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.palavra = palavra;
		notifyAll();
		System.out.println("Nova Palavra == " + palavra);
		online = !online;
	}

	public synchronized String consumirPalavra(String string) {
		while (online) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		String aux = palavra;
		System.out.println("Palavra consumida == " + palavra + " Pelo == " + string);
		this.palavra = "";
		online = !online;
		notifyAll();
		return aux;
	}

}
