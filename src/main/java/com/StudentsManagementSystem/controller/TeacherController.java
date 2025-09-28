package com.StudentsManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.StudentsManagementSystem.entity.Teacher;
import com.StudentsManagementSystem.service.TeacherService;
@org.springframework.stereotype.Controller
public class TeacherController {
	@Autowired
	private TeacherService teacherService;
	
    @GetMapping("/teachers")
	public String getAllTeacher(Model model) {
		model.addAttribute("teachers", teacherService.getAllTeacher());
		return "teachers"; // this return view of teacher data
	}

	@GetMapping("teachers/new")
	public String createTeacherForm(Model model) {
		Teacher teacher = new Teacher(); // to hold the student object
		model.addAttribute("teacher", teacher);
		return "create-teacher";
	}

	@PostMapping("/teachers")
	public String saveTeacher(@ModelAttribute("teacher") Teacher teacher) {
		teacherService.saveTeacher(teacher);
		return "redirect:/teachers";
	}
	@GetMapping("/teachers/update/{id}")
	public String editTeacherForm(@PathVariable int id,Model model) {
		model.addAttribute("teacher",teacherService.getById(id));
		return "update-teacher";
	}
	@PostMapping("/teachers/update/{id}")
	public String updateTeacher(@PathVariable int id, @ModelAttribute("teacher") Teacher teacher) {
		Teacher existingTeacher = teacherService.getById(id);
		existingTeacher.setFullName(teacher.getFullName());
		existingTeacher.setEmail(teacher.getEmail());
		existingTeacher.setGender(teacher.getGender());
		existingTeacher.setDepartment(teacher.getDepartment());
		existingTeacher.setDesignation(teacher.getDesignation());
		existingTeacher.setContactNumber(teacher.getContactNumber());
		existingTeacher.setClass_assigned(teacher.getClass_assigned());
		existingTeacher.setSubject_assigned(teacher.getSubject_assigned());
		teacherService.saveTeacher(existingTeacher);
		return "redirect:/teachers";
	}
	@GetMapping("/teachers/{id}")
	public String deleteById(@PathVariable int id) {
		teacherService.deleteById(id);
		return "redirect:/teachers";
		
	}
	
	
}
