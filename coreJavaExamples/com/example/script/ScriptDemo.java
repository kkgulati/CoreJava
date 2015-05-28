package com.example.script;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptDemo {

	public static void main(String[] args) {
		
		ScriptEngineManager scriptEngineManager=new ScriptEngineManager();
		//ScriptEngine scriptEngine=scriptEngineManager.getEngineByName("JavaScript");
		//ScriptEngine scriptEngine=scriptEngineManager.getEngineByExtension("js");
		ScriptEngine scriptEngine=scriptEngineManager.getEngineByMimeType("text/javascript");
		
		Invocable invocable=(Invocable)scriptEngine;
		
		try {
			
			String script1="function hello(name){ println('Hi '+name) }";
			String script2="function sum(a,b){ return a+b; }";
			
			scriptEngine.eval(script1);
			scriptEngine.eval(script2);
			
			invocable.invokeFunction("hello","Rohan");
			Object val=invocable.invokeFunction("sum",10,10);
			System.out.println(val);			
			//scriptEngine.eval("print('Hello World')");
			
		} catch (ScriptException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		
		
	}
}
