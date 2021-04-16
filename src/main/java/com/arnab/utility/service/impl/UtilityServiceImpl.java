package com.arnab.utility.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.arnab.utility.model.CompressorDummyData;
import com.arnab.utility.service.UtilityService;

@Transactional
@Service
public class UtilityServiceImpl implements UtilityService {

	@Override
	public List<CompressorDummyData> getCompressData() {
		List<CompressorDummyData> comList = new ArrayList<>();
		for (Integer i = 0; i < 100000; i++) {
			CompressorDummyData comData = new CompressorDummyData("Sample", "Sample", i, LocalDateTime.now());
			comList.add(comData);
		}
		return comList;
	}

}
