package com.example.persistence;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Mapper
public interface TimeMapper {

	@Select("select now()")
	public String getTime();
	
	public String getTimeXML();
}
