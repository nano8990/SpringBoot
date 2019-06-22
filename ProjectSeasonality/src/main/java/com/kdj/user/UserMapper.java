package com.kdj.user;

import com.kdj.dataformat.User;

public interface UserMapper {
	
	public User selectUserByKey(int keyNumber);
}
