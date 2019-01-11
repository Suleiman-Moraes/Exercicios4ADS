package exercicio02;

public class Sqrt implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 99; i = i + 2) {
			System.out.println("Thread SQRT == " + Math.sqrt(i));
		}
	}

}
