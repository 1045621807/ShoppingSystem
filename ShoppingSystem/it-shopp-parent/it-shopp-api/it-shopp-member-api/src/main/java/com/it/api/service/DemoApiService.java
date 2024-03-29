package com.it.api.service;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/demo")
public interface DemoApiService {

	@GetMapping("/demo")
	public Map<String, Object> demo();
	
	@GetMapping("/setKey")
	public Map<String,Object> setKey(String key, String value);
	
	@GetMapping("/getKey")
	public Map<String, Object> getKey(String key);
	
}
