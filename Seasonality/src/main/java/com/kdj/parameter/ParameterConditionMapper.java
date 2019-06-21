package com.kdj.parameter;

import java.util.List;

import com.kdj.dataformat.Parameter;

public interface ParameterConditionMapper {
	
	public List<Parameter> selectParameter(char useYn);
	
	public void insertParameter(Parameter parameter);
	
	public void updateParameter(Parameter parameter);
	
	public void deleteParameter(String columnName);
	
}
