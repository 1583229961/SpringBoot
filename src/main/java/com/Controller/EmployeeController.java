package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Employee;
import com.Service.EmployeeService;

@Controller
@RequestMapping("/Employee")
public class EmployeeController {
@Autowired
EmployeeService employeeService;

@GetMapping("/login")
public String login1(Employee employee)
{
	
	
	return "Login";
	
}
@ResponseBody
@PostMapping("/login")
public Employee login(@RequestBody Employee employee)
{
	Employee employee1=employeeService.selectEmployee(employee.getId(), employee.getPassword());
	System.out.println("is"+employee1.getId());
	
	return employee1;
	
}
@GetMapping("/home")
public String home(Employee employee)
{
	
	
	return "home";
	
}
}
