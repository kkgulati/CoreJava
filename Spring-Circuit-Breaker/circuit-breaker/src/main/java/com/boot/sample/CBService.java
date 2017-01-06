package com.boot.sample;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.retry.annotation.CircuitBreaker;
import org.springframework.retry.annotation.Recover;
import org.springframework.stereotype.Service;

@Service
public class CBService {
	
	    @Recover
	    public int fallback(CBCustomException ex) {
	        return 2;
	    }

	    @CircuitBreaker(include = CBCustomException.class)
	    public String getMessage() throws Exception {
	        System.out.println("calling deriveNumber()");
	        int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
	       
	        if (randomNum > 1) {
	            Thread.sleep(1000);
	            throw new CBCustomException("Circuit Broken");
	        }
	        return "Circuit NOT Broken";
	    }
}
