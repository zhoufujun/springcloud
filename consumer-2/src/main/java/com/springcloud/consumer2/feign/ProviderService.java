package com.springcloud.consumer2.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springcloud.consumer2.hystric.ProviderServiceHystric;


@FeignClient(value="provider",fallbackFactory=ProviderServiceHystric.class)
public interface ProviderService {
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String test();

}
