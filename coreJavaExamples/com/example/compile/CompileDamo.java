package com.example.compile;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class CompileDamo {

	public static void main(String[] args) {
						
		JavaCompiler compiler=ToolProvider.getSystemJavaCompiler();
		
		compiler.run(null,null,null,"C:\\Documents and Settings\\gchug\\Desktop\\Java202\\Main.java");
		
		System.out.println("Done!");
		
	}
}
