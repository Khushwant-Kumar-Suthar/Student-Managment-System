package com.StudentsManagementSystem.service;

import com.StudentsManagementSystem.entity.Teacher;
import java.util.*;

public interface TeacherService {

	public List<Teacher> getAllTeacher();

	public Teacher saveTeacher(Teacher teacher);

	public Teacher getById(int id);

	public void deleteById(int id);

}
