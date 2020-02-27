package com.it.common.api;

import java.util.HashMap;
import java.util.Map;

import com.it.constants.BaseApiConstants;

/**
 * 通用baseapi 父类
 * @author zhoujianfeng
 *
 */
public class BaseApiService {
	
	/**
	 * 自定义返回失败
	 * @param msg
	 * @return
	 */
	public Map<String, Object> setResultError(String msg){
		return setResult(BaseApiConstants.HTTP_500_CODE, msg, null);
	}
	
	/**
	 * 自定义返回成功
	 * @param msg
	 * @return
	 */
	public Map<String, Object> setResultSuccess(){
		return setResult(BaseApiConstants.HTTP_200_CODE, BaseApiConstants.HTTP_SUCCESS_NAME, null);
	}
	
	/**
	 * 自定义返回成功
	 * @param msg
	 * @return
	 */
	public Map<String, Object> setResultSuccessData(Object data){
		return setResult(BaseApiConstants.HTTP_200_CODE, BaseApiConstants.HTTP_SUCCESS_NAME, null);
	}
	
	/**
	 * 自定义返回成功
	 * @param msg
	 * @return
	 */
	public Map<String, Object> setResultSuccess(String msg){
		return setResult(BaseApiConstants.HTTP_200_CODE, msg, null);
	}
	
	public Map<String, Object> setResult(Integer code,String msg, Object data){
		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put(BaseApiConstants.HTTP_CODE_NAME, 200);
		result.put(BaseApiConstants.HTTP_200_NAME, "success");
		if(data != null) {
			result.put(BaseApiConstants.HTTP_CODE_NAME, data);
		}
		return result;
	}
}
