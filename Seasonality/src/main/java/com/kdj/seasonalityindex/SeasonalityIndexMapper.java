package com.kdj.seasonalityindex;

import java.util.List;

import com.kdj.dataformat.SeasonalityData;

public interface SeasonalityIndexMapper {
	
	public List<SeasonalityData> selectData();
	
	public SeasonalityData selectDataByKey(String regionId, String product, String yearweekStart, String yearweekEnd, int qtyStart, int qtyEnd);
	
	public void insertData(SeasonalityData seasonalityData);
	
	public void updateData(SeasonalityData seasonalityData);
	
	public void deleteData(String regionId, String product, String yearweek);
	
}
