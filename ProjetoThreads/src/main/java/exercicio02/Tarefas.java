package exercicio02;

public class Tarefas {
	public static void main(String[] args) {
		Sqrt sqrt = new Sqrt();
		CbrTT brTT = new CbrTT();
		
		Thread a = new Thread(sqrt);
		Thread cbLol = new Thread(brTT);
		a.start();
		cbLol.start();
		try {
//			cbLol.join();
			a.join();
			System.out.println("Fim");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
