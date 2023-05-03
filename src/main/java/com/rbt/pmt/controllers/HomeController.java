package com.rbt.pmt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rbt.pmt.dao.EmployeeRepository;
import com.rbt.pmt.dao.ProjectRepository;
import com.rbt.pmt.entities.Employee;
import com.rbt.pmt.entities.Project;

//Home Controller
@Controller
public class HomeController {
	
	@Autowired
	ProjectRepository proRepo;
	@Autowired
	EmployeeRepository empRepo;
	@GetMapping("/")
	public String displayName(Model model) {
		List<Project> project=proRepo.findAll();
		model.addAttribute("projects",project);
		List<Employee> employee=empRepo.findAll();
		model.addAttribute("employees",employee);
		return "main/home";
	}
	

}
