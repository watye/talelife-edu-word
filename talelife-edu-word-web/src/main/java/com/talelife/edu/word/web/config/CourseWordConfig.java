package com.talelife.edu.word.web.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class CourseWordConfig {
	private static final Map<Long,List<String>> words = new HashMap<>();
	static{
		words.put(1L, Arrays.asList(
				"deposit","source","improve","work","content","concise","business","present","disport","heart",
				"display","rarely","emotion","any","have","kind","show","pageant","secondly","review"
				));
	}
	private CourseWordConfig() {
	}
	public static List<String> getWords(Long courseId) {
		return words.get(courseId);
	}
	
}
