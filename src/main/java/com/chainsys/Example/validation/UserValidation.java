package com.chainsys.Example.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

	//Validate Name 
	public Boolean checkName(String name) {
		String userPattern = "^(?!.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?!.*[!@#&()–[{}]:;',?/*~$^+=<>]).{4,20}$";
		Pattern pattern = Pattern.compile(userPattern);
		Matcher match = pattern.matcher(name);
		return match.matches();
	}

	//Validate Mail-ID
	public Boolean checkMailID(String mailID) {
		String userPattern = "^[a-zA-Z0-9_+&*-]+(?:\\."+
				"[a-zA-Z0-9_+&*-]+)*@" +
				"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
				"A-Z]{2,7}$";
		Pattern pattern = Pattern.compile(userPattern);
		Matcher match = pattern.matcher(mailID);
		return match.matches();
	}

	//Validate Password 
	public Boolean checkPassword(String password) {
		String userPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{4,20}$";
		Pattern pattern = Pattern.compile(userPattern);
		Matcher match = pattern.matcher(password);
		return match.matches();
	}
}
