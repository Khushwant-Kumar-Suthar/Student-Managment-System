package com.StudentsManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.StudentsManagementSystem.entity.Student;
import com.StudentsManagementSystem.service.StudentService;

@org.springframework.stereotype.Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/home")
	public String home() {
		return "home"; // this is view page so we want to create html file-> home.html
	}

	@GetMapping("/students")
	public String getAllStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students"; // this return view of students data
	}

	@GetMapping("students/new")
	public String createStudentForm(Model model) {
		Student student = new Student(); // to hold the student object
		model.addAttribute("student", student);
		return "create-student";
	}

	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	@GetMapping("/students/update/{id}")
	public String editStudentForm(@PathVariable int id,Model model) {
		model.addAttribute("student",studentService.getById(id));
		return "update_student";
	}
	@PostMapping("/students/update/{id}")
	public String updateStudent(@PathVariable int id, @ModelAttribute("student") Student student) {
		Student existingStudent = studentService.getById(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setCourse(student.getCourse());
		studentService.saveStudent(existingStudent);
		return "redirect:/students";
	}
	@GetMapping("/students/{id}")
	public String deleteById(@PathVariable int id) {
		studentService.deleteById(id);
		return "redirect:/students";
		
	}
	
	
}
