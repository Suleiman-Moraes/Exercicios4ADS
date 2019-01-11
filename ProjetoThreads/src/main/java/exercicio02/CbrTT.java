package exercicio02;

public class CbrTT implements Runnable {

	@Override
	public void run() {
		for (int i = 2; i <= 1000; i = i + 2) {
			System.out.println("Thread do brTT == " + Math.cbrt(i) + " rxrx");
		}
	}

}
