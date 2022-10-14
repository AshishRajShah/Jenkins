package com.selenium;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controllers {
	
	@ResponseBody
	@RequestMapping("/")
		public String display() {
			return "Hi, This is akshay now i'm implementing docker ..";
	}


}
