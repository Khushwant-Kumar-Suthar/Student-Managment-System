package com.StudentsManagementSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentsManagementSystem.entity.Teacher;
import com.StudentsManagementSystem.service.TeacherService;
@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	 private com.StudentsManagementSystem.repository.TeacherRepo teacherRepo;
	@Override
	public List<Teacher> getAllTeacher() {
		
		return teacherRepo.findAll();
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		
		return teacherRepo.save(teacher);
	}

	@Override
	public Teacher getById(int id) {
		return teacherRepo.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		teacherRepo.deleteById(id);
	}

}
