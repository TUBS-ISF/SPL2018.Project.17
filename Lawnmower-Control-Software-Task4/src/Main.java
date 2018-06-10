import java.util.List;
import interfaces.IFunctions;
import interfaces.IOs;
import loader.PluginLoader;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Application Executing with selected Plugins...");
		
		List<IFunctions> messagePlugins = PluginLoader.load(IFunctions.class);
		List<IOs> osPlugins = PluginLoader.load(IOs.class);
	
		for(IFunctions iFunc : messagePlugins) {
			System.out.println("Loading Function Interfaces...");
			iFunc.useFunction();
		}
		
		for(IOs operatingSystem : osPlugins) {
			System.out.println("Loading Operating Interfaces...");
			operatingSystem.getOperatingSystem();
		}

	}

}
