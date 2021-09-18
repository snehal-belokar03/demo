package com.cjc.service;

import com.cjc.model.Student;

public interface HomeService {
	public void saveData(Student s);
	public Student editData(int rollno);
	public Student loginData(String uname,String pass);
	public void deleteData(Student s);
	public Iterable getAllData();
	public Iterable getSingleData(String uname,String pass);
}
