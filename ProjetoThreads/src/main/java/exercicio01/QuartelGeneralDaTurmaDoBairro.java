package exercicio01;

public class QuartelGeneralDaTurmaDoBairro{
	
	public synchronized void portaoDoQuartel(String membro, Long time) {
		System.out.println();
		System.out.println(membro + " Está usando o portão Principal do Quartel General da Turma do Bairro por: ");
		System.out.println((time/1000.0) + " Segundos.");
//		try {
//			System.out.print("Portão " + portao + " do Quartel General da Turma do Bairro Aberto por: ");
//			System.out.println((time/1000) + " Segundos.");
//			Thread.sleep(time);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
