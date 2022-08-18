package com.chainsys.Example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	JdbcTemplate jdbc;
	
	public void insertDetails(User u) {
		String query = "insert into userdetails(userid,name,mailid,password) values(USER_ID.nextval,?,?,?)";
		Object[] val = {u.getUsername(),u.getMailID(),u.getPassword()};
		jdbc.update(query,val);
	}
	
	public void updateDetails(User u) {
		String query = "update userdetails set password = ? where mailid = ?";
		Object[] val = {u.getPassword(),u.getMailID()};
		jdbc.update(query,val);
	}
	
	public void deleteDetails(User u) {
		String query = "delete from userdetails where mailid = ? and password = ?";
		Object[] val = {u.getMailID(),u.getPassword()};
		jdbc.update(query,val);
	}
}
