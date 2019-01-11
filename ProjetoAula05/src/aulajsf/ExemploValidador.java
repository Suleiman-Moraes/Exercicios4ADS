package aulajsf;

import javax.faces.event.ActionEvent;

public class ExemploValidador {
	private double salario;
	private double porcentagem;
	private double aumento;

	public void calcularAumento(ActionEvent evento) {
		aumento = salario * porcentagem;
	}

	public void zerarCampos(ActionEvent evento) {
		salario = 0;
		porcentagem = 0;
		aumento = 0;
	}

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getPorcentagem() {
		return porcentagem;
	}
	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}
	public double getAumento() {
		return aumento;
	}
	public void setAumento(double aumento) {
		this.aumento = aumento;
	}
}