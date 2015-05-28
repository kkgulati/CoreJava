package com.example.script;

import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class EngineFactoryDemo {
	
	public static void main(String[] args) {
		
		ScriptEngineManager scriptEngineManager=new ScriptEngineManager();
		
		List<ScriptEngineFactory> factories=scriptEngineManager.getEngineFactories();
		
		System.out.println(factories.size());
		
		for(ScriptEngineFactory factory : factories){
			System.out.println(factory);
			System.out.println(factory.getEngineName());
			System.out.println(factory.getEngineVersion());
			System.out.println(factory.getLanguageName());
			System.out.println(factory.getLanguageVersion());
			
			List<String> names=factory.getNames();
			System.out.println(names);
			
			ScriptEngine engine=factory.getScriptEngine();
			try {
				engine.eval("print('I am javascript engine!')");

			} catch (ScriptException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
	}

}
