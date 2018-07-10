import javax.swing.ImageIcon;
import javax.swing.JLabel;

public aspect iOS {

//declare precedence: World, Beautiful; 
	
before(): execution(void LawnmowerApp.includeGUIComponents()) {
		
	System.out.print("iOS");
	ImageIcon icon = LawnmowerApp.createImageIcon("images/apple-image.png",
             "Apple iOS Logo");
	LawnmowerApp.appLabel = new JLabel("Apple iOS",
	                    icon,
	                    JLabel.CENTER);
	}
	

}