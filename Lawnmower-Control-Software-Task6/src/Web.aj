/**
 * 
 */

/**
 * @author x
 *
 */
import javax.swing.*;

public aspect Web {
	
	//declare precedence: World, Beautiful; 

	before(): execution(void LawnmowerApp.includeGUIComponents()) {
		
		System.out.print("Web Browser");
	    ImageIcon icon = LawnmowerApp.createImageIcon("images/chrome-logo.jpg",
	               "Google Chrome Browser");
	    
	    LawnmowerApp.appLabel = new JLabel("Web Browser",
	  	                    JLabel.CENTER);
	    LawnmowerApp.appLabel.setIcon(icon);
	}
	
	
	/*after(): execution(void Hello.print()) {
		System.out.print(" beautiful");
	}*/
}
