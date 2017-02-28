package com.mli.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
    @Autowired
    private JdbcTemplate jdbcTemplate;
	
	public void deleteUserByName(String name){
		String deleteStatement = "DELETE FROM USERS WHERE NAME=?";
		jdbcTemplate.update(deleteStatement, name);		
	}

}
