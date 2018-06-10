//package src;

import interfaces.IOs;
import interfaces.IFunctions;

public class Web implements IOs, IFunctions {

	@Override
	public String getOperatingSystem() {
		// TODO Auto-generated method stub
		return "Web";
	}
	
	@Override
	public void useFunction() {
		System.out.println("The FUNCTION(OS: WEB) is being deployed...");
	}

}
