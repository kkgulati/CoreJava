package com.example.desktop;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

	public static void main(String[] args) {
		
		Desktop desktop=Desktop.getDesktop();
		
		if(desktop != null){
			System.out.println("Available");
			
			try {
				
				desktop.mail(new URI("mailto:\\tyagi@indiatimes.com"));
				
				//desktop.print(new File("C:\\Documents and Settings\\gchug\\Desktop\\Java202\\files\\hello.txt"));
				
				//desktop.open(new File("C:\\Documents and Settings\\gchug\\Desktop\\Java202\\files\\hello.txt"));
				//desktop.edit(new File("C:\\Documents and Settings\\gchug\\Desktop\\Java202\\files\\hello.txt"));
				//desktop.open(new File("C:\\Documents and Settings\\gchug\\Desktop\\Java202\\files\\hello.html"));
				
				//desktop.browse(new URI("file:\\C:\\Documents and Settings\\gchug\\Desktop\\Java202\\files\\hello.html"));
				//desktop.browse(new URI("http://google.co.in"));
				
				
				
			} catch (IOException e) {
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}else{
			System.out.println("Not Available");
		}
		
	}
}
