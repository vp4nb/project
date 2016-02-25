package com.bellinfo.exam.HtmlControl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HtmlController {

	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String home(Model model){
		return "home";
	}
	
	@RequestMapping(value="/aboutus",method=RequestMethod.GET)
	public String aboutus(Model model){
		return "aboutus";
	}
	
	@RequestMapping(value="/contactus",method=RequestMethod.GET)
	public String contactus(Model model){
		return "contactus";
	}
}
