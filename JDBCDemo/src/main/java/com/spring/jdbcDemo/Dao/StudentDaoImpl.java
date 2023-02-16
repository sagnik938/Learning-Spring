package com.spring.jdbcDemo.Dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbcDemo.model.Student;

public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		//insert query
		String query = "insert into student (id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}


	public int modify(Student student) {
		//update query
		String query = "update student set name=? , city=? where id=?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return(r);
	}
	
	public int delete(int id) {
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query,id);
		return(r);
	}


	public Student getStudent(int id) {
		//select one row
		String query = "select * from student where id = ?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper , id);
		return student;
	}


	public List<Student> getAllStudent() {
		String query = "select * from student";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		List<Student> ls = this.jdbcTemplate.query(query, rowMapper);
		return ls;
	}
		
}
