package com.Service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.Employeemapper;
import com.Model.Employee;
import com.Service.EmployeeService;



@Service
public class EmployeeServiceImp implements EmployeeService{
	@Autowired
	Employeemapper employeemapper;
	
	public Employee selectEmployee(Integer id,String password) {
		Employee employee=employeemapper.selectEmployee(id, password);
		return employee;
	}
}
