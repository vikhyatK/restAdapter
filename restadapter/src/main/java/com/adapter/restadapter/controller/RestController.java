package com.adapter.restadapter.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adapter.restadapter.service.IntermediateService;

@CrossOrigin
@org.springframework.web.bind.annotation.RestController
@RequestMapping
public class RestController {

	private static final Logger lOGGER = LogManager.getLogger(RestController.class);
	
	@Autowired
	IntermediateService intermediateService;

	@PostMapping(path = "/postData")
	public String postData(@RequestBody String data) {
		try {
			lOGGER.info(">>Request received, Data:  "+data);
			intermediateService.DataHandler(data);
			lOGGER.info("<<Processing success");
			return "success";
		} catch (Exception e) {
			lOGGER.error(this.getClass().getName(),e);
			return null;
		}
		
	}

}
