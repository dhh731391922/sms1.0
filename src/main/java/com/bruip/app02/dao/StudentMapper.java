package com.bruip.app02.dao;

import java.util.List;

import com.bruip.app02.bean.Student;

public interface StudentMapper {
	List<Student> findAll();
	Student findById(long id);
	void save(Student student);
	void update(Student student);
	void deleteById(long id);
}
