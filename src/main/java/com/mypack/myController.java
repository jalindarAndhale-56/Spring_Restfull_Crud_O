package com.mypack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class myController {

	@GetMapping("/INFO")
	@ResponseBody
	public String info()
	{
		return " this is my controller";
	}
}
