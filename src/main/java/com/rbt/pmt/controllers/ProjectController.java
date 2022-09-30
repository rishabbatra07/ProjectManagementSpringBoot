package com.rbt.pmt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbt.pmt.dao.ProjectRepository;
import com.rbt.pmt.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	@Autowired
	ProjectRepository proRepo;
	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		Project aProject= new Project();
		model.addAttribute("project",aProject);
		return "projects/new-project";
	}
	
	@PostMapping("/save")
	public String createProject(Project project,Model model) {
		proRepo.save(project);
		return "redirect:/projects/new";
	}
	
}
