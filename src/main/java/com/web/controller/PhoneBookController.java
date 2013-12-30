package com.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/pb")
public class PhoneBookController {

	final Logger logger = LoggerFactory.getLogger(PhoneBookController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public String contactList(){
		logger.info("In contactList");
		return "pb/contactList";
	}
}
