/**
 * 
 */

/**
 * @author x
 *
 */


import javax.swing.*;


public aspect Android {
	
	//declare precedence: World, Beautiful; 

	before(): execution(void LawnmowerApp.includeGUIComponents()) {
		System.out.print("Android Operating System");
	    ImageIcon icon = LawnmowerApp.createImageIcon("images/android-image.jpg",
	               "Android Image");
	    
	    LawnmowerApp.appLabel = new JLabel("Android 5.0",
	  	                    JLabel.CENTER);
	    LawnmowerApp.appLabel.setIcon(icon);
	}
	
	
	/*after(): execution(void Hello.print()) {
		System.out.print(" beautiful");
	}*/
}
