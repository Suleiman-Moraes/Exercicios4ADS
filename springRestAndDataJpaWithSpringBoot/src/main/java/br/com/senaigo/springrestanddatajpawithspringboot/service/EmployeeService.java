package br.com.senaigo.springrestanddatajpawithspringboot.service;
import java.util.List;

import br.com.senaigo.springrestanddatajpawithspringboot.entidade.Employee;

/**
 * @author JavaSolutionsGuide
 *
 */
public interface EmployeeService {
 public List<Employee> retrieveEmployees();
 
 public Employee getEmployee(Long employeeId);
 
 public void saveEmployee(Employee employee);
 
 public void deleteEmployee(Long employeeId);
 
 public void updateEmployee(Employee employee);
}