package com.it.api.service.impl;

import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

import com.it.api.service.DemoApiService;
import com.it.common.api.BaseApiService;
import com.it.common.redis.BaseRedisService;

@RestController
public class DemoApiServiceImpl extends BaseApiService implements DemoApiService{

	private BaseRedisService baseRedisService;
	
	@Override
	public Map<String, Object> demo() {
		return setResultSuccess();
	}

	@Override
	public Map<String, Object> setKey(String key, String value) {
		baseRedisService.setString(key, value);
		return setResultSuccess();
	}

	@Override
	public Map<String, Object> getKey(String key) {
		String value = baseRedisService.get(key);
		return setResultSuccessData(value);
		
	}

}
