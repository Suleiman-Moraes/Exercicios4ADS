package br.com.senaigo.springrestanddatajpawithspringboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senaigo.springrestanddatajpawithspringboot.entidade.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}