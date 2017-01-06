package com.boot.sample;

public class CBCustomException  extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	CBCustomException() {
	       super();
	       
	   }
	
	public  CBCustomException(String exMsg) {
		super(exMsg);
		//just log the exception and let Spring re-try work
		//System.out.println("Exception: "+exMsg);
		//throw new RuntimeException(exMsg);
        
   }

}
