package com.StudentsManagementSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentsManagementSystem.entity.Student;
import com.StudentsManagementSystem.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	// by this it gave me all method of jpa repository
    @Autowired
	private com.StudentsManagementSystem.repository.StudentRepository StudentRepo;
	
	@Override
	public List<Student> getAllStudents() {
		
		return StudentRepo.findAll(); // this gave me list of student
	}

	@Override
	public Student saveStudent(Student student) {
		
		return StudentRepo.save(student);
	}

	@Override
	public Student getById(int id) {
		
		return StudentRepo.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		StudentRepo.deleteById(id);
		
	}
      
}
