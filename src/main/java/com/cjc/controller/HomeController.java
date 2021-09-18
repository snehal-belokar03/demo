package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Student;
import com.cjc.service.HomeService;

@Controller
public class HomeController {

	@Autowired
	HomeService hs;

	@RequestMapping("/")
	public String firstPage() {
		return "index";
	}

	@RequestMapping("/reg")
	public String prelogin() {
		return "register";
	}

	@RequestMapping("/register")
	public String registerData(@ModelAttribute("stu") Student s, Model m) {

		/*System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getAddr());
		System.out.println(s.getMobileno());*/
		m.addAttribute("stu", s);
		hs.saveData(s);
		return "index";
	}

	@RequestMapping("/log")
	public String login(@RequestParam("uname") String uname, @RequestParam("pass") String pass, Model m) {
		Student stu = hs.loginData(uname, pass);
		if (uname.equals("admin")&&pass.equals("admin")) {
			Iterable<Student> list = hs.getAllData();
			m.addAttribute("data", list);
			return "success";
		} else {
			Iterable<Student> list = hs.getSingleData(uname, pass);
			m.addAttribute("data", list);
			return "success";
		}
	}

	@RequestMapping("/delete")
	public String delete(@ModelAttribute("stu") Student s, Model m) {
		hs.deleteData(s);
		Iterable<Student> list = hs.getAllData();
		m.addAttribute("data", list);
		return "success";
	}
	@RequestMapping("/edit")
	public String edit(@RequestParam("rollno") int rollno, Model m) {
		Student s=hs.editData(rollno);
		
		m.addAttribute("stu",s );
		return "edit";
	}

	@RequestMapping("/update")
	public String update(@ModelAttribute("stu")Student s,Model m) {
		hs.saveData(s);
		Iterable<Student> list = hs.getAllData();
		m.addAttribute("data", list);
		return "success";
	}
}
