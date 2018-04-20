package com.soringcloud.consumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soringcloud.consumer.fegin.ProviderService;

@Controller
@RequestMapping("/consumer")
public class ConsumerController {

	@Autowired
	private ProviderService providerService;
	
	@RequestMapping("/test")
	@ResponseBody
	public String name() {
		return providerService.test();
	}
}
