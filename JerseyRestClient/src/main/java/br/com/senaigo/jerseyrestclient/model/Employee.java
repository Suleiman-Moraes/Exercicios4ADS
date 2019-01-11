package br.com.senaigo.jerseyrestclient.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

	private String empNo;
	private String empName;
	private String position;

	// This default constructor is required if there are other constructors.
	public Employee() {}
	public Employee(String empNo, String empName, String position) {
		this.empNo = empNo;
		this.empName = empName;
		this.position = position;
	}
}