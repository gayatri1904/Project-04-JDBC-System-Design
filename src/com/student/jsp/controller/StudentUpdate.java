package com.student.jsp.controller;

import com.student.jsp.dao.StudentDao;
import com.student.jsp.dto.Student;

public class StudentUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.setId(4);
		student1.setName("minni");
		student1.setEmail("miniijadhav6576@gmail.com");

		StudentDao studentDao = new StudentDao();
		Student student = studentDao.updateStudent(student1);
		if (student != null) {
			System.out.println("record updated");
		} else
			System.out.println("recorrd not updated");
	}

}
