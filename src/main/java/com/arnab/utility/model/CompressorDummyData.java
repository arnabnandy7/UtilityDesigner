package com.arnab.utility.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompressorDummyData implements Serializable {
	
	private static final long serialVersionUID = -4243305561786967073L;

	@JsonProperty("data_1")
	String data1;
	
	@JsonProperty("data_2")
	String data2;
	
	@JsonProperty("data_3")
	Integer data3;
	
	@JsonProperty("data_4")
	LocalDateTime data4;
}
