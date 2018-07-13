package com.bruip.app02.service.immpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruip.app02.bean.Student;
import com.bruip.app02.dao.StudentMapper;
import com.bruip.app02.service.IStudentService;

@Service
public class StudentService implements IStudentService{
	@Autowired	
	private StudentMapper studentMapper;
	@Override
	public List<Student> findAll() throws Exception {
		// TODO Auto-generated method stub
		List<Student> list=studentMapper.findAll();
		return list;
	}
	@Override
	public Student findById(long id) throws Exception {
		// TODO Auto-generated method stub
		Student student=studentMapper.findById(id);
		return student;
	}
	@Override
	public void save(Student student) throws Exception {
		// TODO Auto-generated method stub
		studentMapper.save(student);
	}
	@Override
	public void update(Student student) throws Exception {
		// TODO Auto-generated method stub
		studentMapper.update(student);
	}
	@Override
	public void detelete(long id) throws Exception {
		Student student=studentMapper.findById(id);
		if(student!=null){
			studentMapper.deleteById(id);
			
		}else{
			throw new Exception("要删除的学生不存在");
		}
	}
	
}
