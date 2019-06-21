package com.kdj.parameter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kdj.dataformat.Parameter;

public class ParameterCondition implements ParameterConditionMapper {

	@Autowired
	ParameterConditionMapper mapper;

	public List<Parameter> selectParameter(char useYn) {
		return mapper.selectParameter(useYn);
	}

	public void insertParameter(Parameter parameter) {
		mapper.insertParameter(parameter);
	}

	public void updateParameter(Parameter parameter) {
		mapper.updateParameter(parameter);
	}

	public void deleteParameter(String columnName) {
		mapper.deleteParameter(columnName);
	}

}
