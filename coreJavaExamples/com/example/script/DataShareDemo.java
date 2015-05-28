package com.example.script;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class DataShareDemo {

	public static void main(String[] args) {
		
		ScriptEngineManager scriptEngineManager=new ScriptEngineManager();
		ScriptEngine scriptEngine=scriptEngineManager.getEngineByName("JavaScript");
		
		String options[]={"File","Edit","Help"};
		
		scriptEngine.put("MENUOPTIONS", options);
		scriptEngine.put("GEN", new IDGenerator());
		
		Invocable invocable=(Invocable)scriptEngine;
		
		try {
			
			String script1="function generateMenu1(){ for(var i=0;i<MENUOPTIONS.length;i++){ var op=MENUOPTIONS[i]; print(op+'|') } }";
			String script2="function generateMenu2(MENU){ for(var i=0;i<MENU.length;i++){ var op1=MENU[i]; print(op1+'|') } }";
			String script3="function useId(){ println(GEN.generate())  }";
			
			
			scriptEngine.eval(script1);
			scriptEngine.eval(script2);
			scriptEngine.eval(script3);
			
			invocable.invokeFunction("generateMenu1");
			invocable.invokeFunction("generateMenu2",options);
			invocable.invokeFunction("useId");
			
		} catch (ScriptException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		
		
	}
}
