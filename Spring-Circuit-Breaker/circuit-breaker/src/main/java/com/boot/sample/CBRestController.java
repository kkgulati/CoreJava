package com.boot.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CBRestController {
	
	@Autowired
	private CBService cbService;
	
	@Autowired
	private RecoverRetryServiceWithSpring retry;
	
	@Autowired
	private CircuitBreakerServiceWithSpring cb;
	
    @GetMapping("/cb")
	public String getMessage() throws Exception{
    	return cbService.getMessage();
	}
    
    @GetMapping("/re")
	public String getRetryMessage() throws Exception{
    	return retry.getMessage();
	}
    
    @GetMapping("/cbr")
   	public String getCBMessage() throws Exception{
       	return cb.getMessage();
   	}
   	
	
	
	

}
