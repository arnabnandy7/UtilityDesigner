package com.arnab.utility.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arnab.utility.model.CompressorDummyData;
import com.arnab.utility.service.UtilityService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/utility")
public class UtilityDesignerController {

	@Autowired
	UtilityService utilityService;

	@GetMapping("/health")
	public ResponseEntity<?> getHealth() {
		log.info("Compression");
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/compressData")
	public ResponseEntity<List<CompressorDummyData>> getCompressedData() {
		log.info("Compression");
		return new ResponseEntity<>(utilityService.getCompressData(), HttpStatus.OK);
	}
}
