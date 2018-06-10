package main;
import java.util.List;
import interfaces.IOs;
import loader.PluginLoader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LawnmowerApp First = new LawnmowerApp();
		
	List<IOs> printList = PluginLoader.load(IOs.class);
		
		for(IOs p : printList) {
			System.out.println("Entered Loop...");
			System.out.println("OS is :"+p.getOperatingSystem());
		}

	}

}
