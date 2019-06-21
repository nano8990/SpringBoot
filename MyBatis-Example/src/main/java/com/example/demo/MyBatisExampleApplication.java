package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.persistence.TimeMapper;

import lombok.extern.java.Log;

@Log
@SpringBootApplication
@MapperScan("com.example.user")
public class MyBatisExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBatisExampleApplication.class, args);
	}
	
}
