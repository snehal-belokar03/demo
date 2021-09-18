package com.cjc.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.HomeRepository;
import com.cjc.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {
	@Autowired
	HomeRepository hr;
	@Override
	public void saveData(Student s) {
		hr.save(s);
		
	}
	@Override
	public Student editData(int rollno) {
		// TODO Auto-generated method stub
		Student s=hr.findAllByRollno(rollno);
		return s;
	}
	@Override
	public Student loginData(String uname, String pass) {
		// TODO Auto-generated method stub
		Student s=hr.findAllByUnameAndPass(uname, pass);
		return s;
	}
	@Override
	public void deleteData(Student s) {
		// TODO Auto-generated method stub
		hr.delete(s);
	}
	@Override
	public Iterable getAllData() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}
	@Override
	public Iterable getSingleData(String uname, String pass) {
		// TODO Auto-generated method stub
		
		Iterable<Student> list=hr.findByUnameAndPass(uname, pass);
		return list;	
				
	}
	
	


	

}
