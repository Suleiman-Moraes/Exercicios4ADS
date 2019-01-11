package br.com.senaigo.hellospringboot.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	private Long id;
	private String empName;
	private String position;

	public Employee() {}
	public Employee(Long id, String empName, String position) {
		super();
		this.id = id;
		this.empName = empName;
		this.position = position;
	}
	public Employee(String empName, String position) {
		this.empName = empName;
		this.position = position;
	}
}