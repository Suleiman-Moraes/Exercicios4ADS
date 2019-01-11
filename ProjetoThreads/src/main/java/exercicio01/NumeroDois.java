package exercicio01;

public class NumeroDois implements Runnable {

	private QuartelGeneralDaTurmaDoBairro knd;
	private String membro;
	private Long time;
	private boolean ataqueDaMulecadaDaRuaDeBaixo = false;

	public NumeroDois(QuartelGeneralDaTurmaDoBairro knd, String membro, Long time) {
		this.knd = knd;
		this.membro = membro;
		this.time = time;
	}

	public void altorizarEntradaDoQaurtel(String membro, Long time) {
		knd.portaoDoQuartel(membro, time);
		try {
			Thread.sleep(time);
			this.ataqueDaMulecadaDaRuaDeBaixo = true;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Membro: \"" + membro + "\" Estagio: " + i);
			altorizarEntradaDoQaurtel(membro, time);
		}
	}

	public void setAtaqueDaMulecadaDaRuaDeBaixo(boolean ataqueDaMulecadaDaRuaDeBaixo) {
		this.ataqueDaMulecadaDaRuaDeBaixo = ataqueDaMulecadaDaRuaDeBaixo;
	}
}
