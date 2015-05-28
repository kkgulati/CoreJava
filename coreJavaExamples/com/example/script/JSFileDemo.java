package com.example.script;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSFileDemo {

	public static void main(String[] args) {
		
		ScriptEngineManager scriptEngineManager=new ScriptEngineManager();
		ScriptEngine scriptEngine=scriptEngineManager.getEngineByName("JavaScript");
		
		Invocable invocable=(Invocable)scriptEngine;
		
		try {
			Reader reader=new FileReader("C:\\Documents and Settings\\gchug\\Desktop\\Java202\\workspace\\java6\\src\\com\\example\\script\\main.js");
			scriptEngine.eval(reader);
			
			Object val=invocable.invokeFunction("doWork");
			System.out.printf("Result is %s%n",val);
			
			
		} catch (ScriptException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} 
		
		
	}
}
