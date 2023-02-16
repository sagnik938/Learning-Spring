package com.spring.orm.dao;

import java.util.List;

import javax.sound.midi.Soundbank;
import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.Model.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public int insert(Student student) {
		Integer r = (Integer)this.hibernateTemplate.save(student);
		return(r);
	}
	
	@Transactional
	public void modify(Student student) {
		this.hibernateTemplate.update(student);
		System.out.println("Updated");
	}
	
	@Transactional
	public void delete(Student student) {
		this.hibernateTemplate.delete(student);
		System.out.println("Deleted");
	}

	public Student getById(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
		return( student );
		
	}
	
	public List<Student> getAllById() {
		List<Student> student = this.hibernateTemplate.loadAll(Student.class);
		return( student );
		
	}
	
}
