package com.chainsys.Example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.Example.model.User;
import com.chainsys.Example.model.UserDao;
import com.chainsys.Example.validation.UserValidation;

@Controller
public class UserController {

	@Autowired
	UserDao obj;
	
	@Autowired
	User u;

	@GetMapping("/login")
	public String createUser(@RequestParam("name") String name,@RequestParam("mailid") String mailID,@RequestParam("password") String password) {
		System.out.println("Started");
		UserValidation val = new UserValidation();
		int check =0;
		//Check Name
		if(val.checkName(name)) {
			u.setUsername(name);
			check++;
		}
		else
			System.out.println("Invalid Name");

		//Check Mail-ID
		if(val.checkMailID(mailID)) {
			u.setMailID(mailID);
			check++;
		}
		else
			System.out.println("Invalid Mail-ID");

		//Check Password
		if(val.checkPassword(password)) {
			u.setPassword(password);
			check++;
		}
		else
			System.out.println("Invalid Password");


		if(check==3) {
			obj.insertDetails(u);
			return "success.html";
		}
		else {
			System.out.println("Invalid Input");
			return "index.jsp";
		}
	}

	@GetMapping("/update")
	public String updateUser(@RequestParam("email") String mailID,@RequestParam("newpassword") String newPassword) {
		u.setMailID(mailID);
		u.setPassword(newPassword);
		try {
			obj.updateDetails(u);
			return "success.html";
		}
		catch(Exception e) {
			e.printStackTrace();
			return "index.jsp";
		}
	}

	@GetMapping("/delete")
	public String deleteUser(@RequestParam("emailid") String mailID,@RequestParam("psw") String Password) {
		u.setMailID(mailID);
		u.setPassword(Password);
		try {
			obj.deleteDetails(u);
			return "success.html";
		}
		catch(Exception e) {
			e.printStackTrace();
			return "index.jsp";
		}
	}
}
