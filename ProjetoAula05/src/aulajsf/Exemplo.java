package aulajsf;

import javax.faces.event.ActionEvent;

public class Exemplo {
	private int numero1;
	private int numero2;
	private int soma;

	public void somar(ActionEvent evento) {
		soma = numero1 + numero2;
	}
	
	// Getters and Setters
	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	public int getSoma() {
		return soma;
	}
	public void setSoma(int soma) {
		this.soma = soma;
	}
}