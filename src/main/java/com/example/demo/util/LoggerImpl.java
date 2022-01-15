package com.example.demo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerImpl {

	public static Logger getLogger(Class className) {
		return LoggerFactory.getLogger(className);
	}
}
