package com.example.user;

import java.util.List;

import com.example.userVO.UserVO;

public interface UserMapper {

	public UserVO selectUserByIdx(int idx);

	public List<UserVO> selectUserList();

	public void insertUser(UserVO userVO);

}
