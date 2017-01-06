package com.boot.sample;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.retry.annotation.CircuitBreaker;
import org.springframework.retry.annotation.Recover;
import org.springframework.stereotype.Service;


@Service
@EnableCircuitBreaker
public class CircuitBreakerServiceWithSpring {
	
	    @Recover
	    public String onException(CBCustomException ex){
	    	System.out.println("--inside on Exception --");
	    	return "-- Circuit is Broken -- ";
	    }

	   @CircuitBreaker(include = CBCustomException.class,openTimeout=2,resetTimeout=3,maxAttempts=5)
	    public String getMessage() throws Exception {
	        
	        int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
	        System.out.println("call to  getMessage():: "+randomNum);
	        if (randomNum > 1) {
	            Thread.sleep(1000);
	            throw new CBCustomException("Circuit Broken");
	        }
	        return "Circuit NOT Broken";
	    }
}
