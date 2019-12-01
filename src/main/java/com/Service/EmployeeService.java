package com.Service;

import java.awt.List;

import org.springframework.stereotype.Service;

import com.Model.Employee;

@Service
public interface EmployeeService {

	public Employee selectEmployee(Integer id,String password);
}
