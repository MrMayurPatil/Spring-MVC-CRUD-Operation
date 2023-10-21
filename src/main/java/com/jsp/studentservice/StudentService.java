package com.jsp.studentservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.student.Student;
import com.jsp.studentdao.StudentDao;

@Component
public class StudentService {
	@Autowired
	private StudentDao studentDao;
	

	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}
	
	public List<Student> getAllStudent() {
		return studentDao.getAllStudent();
	}
	
	public boolean deleteStudentById(int id) {
		return studentDao.deleteStudentById(id);
	}

	public Student updatedStudent(int id ,Student student) {
		Student student2  = studentDao.getStudentById(id);
		student2.setName(student.getName());
		student2.setEmail(student.getEmail());
		return studentDao.updatedStudent(student2);
	}
	
}
