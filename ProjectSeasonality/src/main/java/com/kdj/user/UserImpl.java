package com.kdj.user;

import org.springframework.beans.factory.annotation.Autowired;

import com.kdj.dataformat.User;

public class UserImpl implements UserMapper {

	@Autowired
	UserMapper mapper;
	
	public User selectUserByKey(int keyNumber) {
		return mapper.selectUserByKey(keyNumber);
	}

}
