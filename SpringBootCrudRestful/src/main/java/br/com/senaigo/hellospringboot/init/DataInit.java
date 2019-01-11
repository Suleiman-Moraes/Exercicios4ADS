package br.com.senaigo.hellospringboot.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.com.senaigo.hellospringboot.dao.EmployeeDAO;
import br.com.senaigo.hellospringboot.model.Employee;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DataInit implements ApplicationRunner {

	private EmployeeDAO employeeDAO;

	private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

	@Autowired
	public DataInit(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		long count = employeeDAO.count();

		if (count == 0) {
			Employee a = new Employee("Valfenda", "Elfos");
			Employee b = new Employee("brTT", "ADC");
			Employee c = new Employee("João da Pampa", "Freteiro");

			employeeDAO.save(a);
			employeeDAO.save(b);
			employeeDAO.save(c);
		}
	}
}