package com.student.jsp.controller;

import com.student.jsp.dao.StudentDao;

public class StudentDelete {

	public static void main(String[] args) {
		StudentDao studentDao=new StudentDao()	;
		boolean flag=studentDao.deleteStudentById(1);
if(flag==true)
{
	System.out.println("record deletd");
}
else {
	System.out.println("record not deleted");
}
	}

}
