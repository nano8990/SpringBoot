package com.kdj.seasonalityindex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kdj.dataformat.SeasonalityData;

public class SeasonalityIndex implements SeasonalityIndexMapper {
	
	@Autowired
	SeasonalityIndexMapper mapper;

	public List<SeasonalityData> selectData() {
		return mapper.selectData();
	}

	public SeasonalityData selectDataByKey(String regionId, String product, String yearweekStart, String yearweekEnd, int qtyStart, int qtyEnd) {
		return mapper.selectDataByKey(regionId, product, yearweekStart, yearweekEnd, qtyStart, qtyEnd);
	}

	public void insertData(SeasonalityData seasonalityData) {
		mapper.insertData(seasonalityData);
	}

	public void updateData(SeasonalityData seasonalityData) {
		mapper.updateData(seasonalityData);
	}

	public void deleteData(String regionId, String product, String yearweek) {
		mapper.deleteData(regionId, product, yearweek);
	}
	
}
