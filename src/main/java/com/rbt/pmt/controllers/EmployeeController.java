package com.rbt.pmt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rbt.pmt.dao.EmployeeRepository;
import com.rbt.pmt.entities.Employee;
import com.rbt.pmt.entities.Project;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeRepository empRepo;
	@RequestMapping("/new")
	public String displayEmployeeForm(Model model) {
		Employee aEmployee= new Employee();
		model.addAttribute("employee",aEmployee);
		return "/employees/new-employee";
	}
	@PostMapping("/save")
	public String createProject(Employee employee,Model model) {
		empRepo.save(employee);
		return "redirect:/employee/new";
	}

}
