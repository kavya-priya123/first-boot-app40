package ai.jobiak.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TestController {
	@RequestMapping(path="/test",method=RequestMethod.GET)
	public String test(@RequestParam(name="loc",defaultValue="Boston",required=false)String loc,Model model)
	{
		//Logger logger = LoggerFactory.getLogger(TestController.class);
		model.addAttribute("company","Jobiak");
		model.addAttribute("headoffice",loc);
		model.addAttribute("hqregions","GreaterBostonArea,East Coast,New England");
		model.addAttribute("caddress","Ram Nagar, Visakhapatnam, Andhra Pradesh 530002");
		return "success";
	}
}
