package com.example.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.user.UserMapper;
import com.example.userVO.UserVO;

import lombok.extern.java.Log;

@Log
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisExampleApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(MyBatisExampleApplicationTests.class);
	
	@Autowired
	UserMapper userMapper;
	
	UserVO userVO;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void myTest() {
		log.info("--------------------------------------------------" + userMapper);
		System.out.println(userMapper.selectUserList());
		
		UserVO userVO = new UserVO("DongJoon", "Hi");
		System.out.println(userVO);
		userMapper.insertUser(userVO);
		
		String resultString = new String();
		List<UserVO> userInfo = userMapper.selectUserList();
		for (int i = 0; i < userInfo.size(); i++) {
			resultString += userInfo.get(i).toString();
		}
		log.info(resultString);
		
	}
	
	@Test
	public void myTestMapper() {
		log.info("--------------------------------------------------");
	}
}
