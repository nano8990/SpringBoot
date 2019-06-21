package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.persistence.TimeMapper;

import lombok.extern.java.Log;

@Log
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisExampleApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(MyBatisExampleApplicationTests.class);
	
	@Autowired
	TimeMapper timeMapper;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void myTest() {
		log.info("--------------------------------------------------");
		
		log.info("TIME: " + timeMapper.getTime());
	}
	
	@Test
	public void myTestMapper() {
		log.info("--------------------------------------------------");
		
		log.info("TIME: " + timeMapper.getTimeXML());
	}
}
