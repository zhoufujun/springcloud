package com.soringcloud.consumer.fegin;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.soringcloud.consumer.hystric.ProviderServiceHystric;

@FeignClient(value="provider",fallbackFactory=ProviderServiceHystric.class)
public interface ProviderService {
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String test();

}
