package com.bruip.app02.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bruip.app02.bean.Student;


@Service
public interface IStudentService {
	List<Student> findAll() throws Exception;
	Student findById(long id)throws Exception;
	void save(Student student)throws Exception;
	void update(Student student)throws Exception;
	void detelete(long id)throws Exception;
}
