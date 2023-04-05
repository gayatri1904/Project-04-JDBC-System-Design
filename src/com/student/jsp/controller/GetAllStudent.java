package com.student.jsp.controller;

import com.student.jsp.dao.StudentDao;

public class GetAllStudent {

	public static void main(String[] args) {
		StudentDao studentDao=new StudentDao();
		studentDao.getAllStudent();

	}

}
