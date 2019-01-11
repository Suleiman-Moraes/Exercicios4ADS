package br.com.senaigo.hellospringboot.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.senaigo.hellospringboot.model.Employee;

@Repository
public interface EmployeeDAO extends CrudRepository<Employee, Long>{
	public List<Employee> findByFullNameLike(String name);
	 
    public List<Employee> findByDateOfBirthGreaterThan(Date date);
}