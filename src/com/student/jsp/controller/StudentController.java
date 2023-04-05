package com.student.jsp.controller;

import com.student.jsp.dao.StudentDao;
import com.student.jsp.dto.Student;

public class StudentController {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(6);
		s1.setName("eqwwnmd");
		s1.setEmail("ghfasydghwj@hjgdhj");
		StudentDao studentDao=new StudentDao();
		Student student=studentDao.saveStudent(s1);
		if(student !=null)
		{
			System.out.println(student.getName());
		}
		
	}

}
