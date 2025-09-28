package com.StudentsManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentsManagementSystem.entity.Teacher;
@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Integer>{

}
