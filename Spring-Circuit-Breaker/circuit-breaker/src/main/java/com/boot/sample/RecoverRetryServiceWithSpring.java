package com.boot.sample;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.retry.annotation.EnableRetry;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;


@Service
@EnableRetry
public class RecoverRetryServiceWithSpring {
	
	    @Recover
	    public String uponException(CBCustomException ex){
	    	System.out.println("--inside upon Exception --");
	    	return "-- Circuit Broken -- ";
	    }

	   // @CircuitBreaker(include = CBCustomException.class)
	    @Retryable(include = CBCustomException.class, maxAttempts=10)
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
