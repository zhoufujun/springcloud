package com.soringcloud.consumer.hystric;

import org.springframework.stereotype.Component;

import com.soringcloud.consumer.fegin.ProviderService;

import feign.hystrix.FallbackFactory;

@Component
public class ProviderServiceHystric implements FallbackFactory<ProviderService> {


	@Override
	public ProviderService create(Throwable cause) {
		
		return new ProviderService() {
			
			@Override
			public String test() {
				return "fallback; reason was: " + cause.getMessage();
			}
		};
		
	}

}
