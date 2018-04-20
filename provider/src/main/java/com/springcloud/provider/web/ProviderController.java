package com.springcloud.provider.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProviderController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "hello";
	}

}
