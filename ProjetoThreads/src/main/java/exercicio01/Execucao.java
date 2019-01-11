package exercicio01;

public class Execucao {

	public static void main(String[] args) {
		QuartelGeneralDaTurmaDoBairro knd = new QuartelGeneralDaTurmaDoBairro();
		
		NumeroDois[] vet = new NumeroDois[3];
		vet[0] = new NumeroDois(knd, "O Número " + 1, new Long(500));
		vet[1] = new NumeroDois(knd, "A Número " + 477, new Long(1000));
		vet[2] = new NumeroDois(knd, "O Número " + 834, new Long(2000));
		
		for (int i = 0; i < vet.length; i++) {
			new Thread(vet[i]);
		}
		for (int i = 0; i < vet.length; i++) {
			new Thread(vet[i]).start();
		}
		
	}

}
