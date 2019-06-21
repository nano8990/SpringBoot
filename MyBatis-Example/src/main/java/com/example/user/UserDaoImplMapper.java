package com.example.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.userVO.UserVO;

public class UserDaoImplMapper implements UserMapper {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<UserVO> selectUserList() {
		List<UserVO> userInfo = userMapper.selectUserList();
		System.out.println(userInfo);
		return userInfo;
	}

	@Override
	public UserVO selectUserByIdx(int idx) {
		UserVO user = userMapper.selectUserByIdx(idx);
		System.out.println(user);
		return user;
	}

	@Override
	public void insertUser(UserVO user) {
		userMapper.insertUser(user);
	}
}
