package com.spring.theCode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class codeControllers {
	
	@GetMapping("/")
	public String index(@ModelAttribute("errors") String errors) {
		if(errors == null) {
			errors = "";
		}
		
		return "index";
	}
	
	@PostMapping("/code")
	public String process(@RequestBody String body, RedirectAttributes redirectAttributes) {	
		String secretCode = "bushido";
		String userCode = (body.substring(body.indexOf("=") + 1)).trim();
		
		if(secretCode.equals(userCode)) {
			return "codePg";
		}else {		
			redirectAttributes.addFlashAttribute("errors", "You must train harder!");
			return "redirect:/";
		}
		
	}
}
