package aulajsf;

import java.util.Date;

import javax.faces.event.ActionEvent;

public class ExemploConversor {
	private Date data1;
	private Date data2;
	private long diferenca;

	public void calcularDiferenca(ActionEvent evento) {
		long d = data2.getTime() - data1.getTime();
		diferenca = d / (1000 * 60 * 60 * 24);
	}

	public Date getData1() {
		return data1;
	}
	public void setData1(Date data1) {
		this.data1 = data1;
	}
	public Date getData2() {
		return data2;
	}
	public void setData2(Date data2) {
		this.data2 = data2;
	}
	public long getDiferenca() {
		return diferenca;
	}
}