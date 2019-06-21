package com.kdj.dataformat;

public class SeasonalityData {
	
	public String regionId;
	public String product;
	public String yearweek;
	public int qty;
	
	public SeasonalityData() {
		
	}
	
	public SeasonalityData(String regionId, String product, String yearweek, int qty) {
		this.regionId = regionId;
		this.product = product;
		this.yearweek = yearweek;
		this.qty = qty;
	}
	
	public String getRegionId() {
		return this.regionId;
	}
	
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	
	public String getProduct() {
		return this.product;
	}
	
	public void setProduct(String product) {
		this.product = product;
	}
	
	public String getYearweek() {
		return this.yearweek;
	}
	
	public void setYearweek(String yearweek) {
		this.yearweek = yearweek;
	}
	
	public int getQty() {
		return this.qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		StringBuffer resultSb = new StringBuffer();
		resultSb.append("<tr>");
		
		resultSb.append("<td>");
		resultSb.append(this.regionId);
		resultSb.append("</td>");
		
		resultSb.append("<td>");
		resultSb.append(this.product);
		resultSb.append("</td>");
		
		resultSb.append("<td>");
		resultSb.append(this.yearweek);
		resultSb.append("</td>");
		
		resultSb.append("<td>");
		resultSb.append(this.qty);
		resultSb.append("</td>");
		
		resultSb.append("</tr>");
		return resultSb.toString();
	}
	
}
