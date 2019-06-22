package com.kdj.dataformat;

public class Parameter {
	
	public String columnName;
	public String selectCondition;
	public char useYn;
	
	public Parameter() {
		
	}
	
	public Parameter(String columnName, String selectCondition, char useYn) {
		this.columnName = columnName;
		this.selectCondition = selectCondition;
		this.useYn = useYn;
	}
	
	public String getColumnName() {
		return this.columnName;
	}
	
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	
	public String getSelectCondition() {
		return this.selectCondition;
	}
	
	public void setSelectCondition(String selectCondition) {
		this.selectCondition = selectCondition;
	}
	
	public char getUseYn() {
		return this.useYn;
	}
	
	public void setUseYn(char useYn) {
		this.useYn = useYn;
	}
	
}
