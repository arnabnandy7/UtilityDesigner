package com.arnab.utility.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonValidator {
	public static void main(String[] args) {
		String string = "{\"metadata\":{\"requestUUID\": \"35454545454544\",\"channel\": \"SIDDHI\",\"epochMilis\": \"124648746647\",\"requestVersion\": \"1.0\"},\"data\": {\"userId\": \"1244\",\"deviceId\": \"\",\"cardNO\": \"\"}}";
		System.out.println(jsonChecker(string));
	}

	public static String jsonChecker(String jsonStr) {
		int count = 0;
		final String regex = "[{}:,.\t\"A-Za-z0-9_ ]";
		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		final Matcher matcher = pattern.matcher(jsonStr);
		
		while (matcher.find()) {
			count++;
		}
		if (count != jsonStr.length()) {
			return "Invalid";
		} else {
			return "Valid";
		}
	}

}
