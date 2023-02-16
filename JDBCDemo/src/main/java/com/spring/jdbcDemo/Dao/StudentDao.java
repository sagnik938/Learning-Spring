package com.spring.jdbcDemo.Dao;

import java.util.List;

import com.spring.jdbcDemo.model.Student;

public interface StudentDao {
	
	public int insert(Student student);
	public int modify(Student student);
	public int delete(int id);
	public Student getStudent(int id);
	public List<Student> getAllStudent();
}
