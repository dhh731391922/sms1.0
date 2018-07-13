package com.bruip.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruip.app02.bean.Student;
import com.bruip.app02.service.IStudentService;
import com.bruip.app02.utills.MsgResponse;


@RestController
@RequestMapping("/test")
public class StudentController {
	@Autowired
	private IStudentService studentService;
	@GetMapping("findAll")
	public MsgResponse finfAll(){
		
		try {
			List<Student> list = studentService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
		
	}
	@GetMapping("findById")
	public MsgResponse findById(long id){
		
		try {
			Student student = studentService.findById(id);
			return MsgResponse.success("查询成功", student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
	@GetMapping("deleteStudentById")
	public MsgResponse deleteStudentById(long id){
		try {
			studentService.detelete(id);
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("updateStudent")
	public String updateStudent(Student student){
		try {
			studentService.update(student);
			return "修改成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return e.getMessage();
		}
	}
	@PostMapping("saveStudent")
	public void saveStudent(Student student){
		try {
			studentService.save(student);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
	

