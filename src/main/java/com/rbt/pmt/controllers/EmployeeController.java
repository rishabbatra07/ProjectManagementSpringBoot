package com.rbt.pmt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rbt.pmt.dao.EmployeeRepository;
import com.rbt.pmt.entities.Employee;
import com.rbt.pmt.entities.Project;



@Controller
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	EmployeeRepository empRepo;
	@GetMapping
	public String displayEmployees(Model model) {
		List<Employee> employees= empRepo.findAll();
		model.addAttribute("employees",employees);
		return "employees/list-employee";
		
	}
	@RequestMapping("/new")
	public String displayEmployeeForm(Model model) {
		Employee aEmployee= new Employee();
		model.addAttribute("employee",aEmployee);
		return "/employees/new-employee";
	}
	@PostMapping("/save")
	public String createProject(Employee employee,Model model) {
		empRepo.save(employee);
		return "redirect:/employees/new";
	}
}
