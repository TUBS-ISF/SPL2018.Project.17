import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.Toolkit;

import javafx.scene.text.Font;


import javax.swing.*;
import java.awt.*;


public class LawnmowerApp extends JFrame{

	protected static final long serialVersionUID = 1L;
	protected JLabel appLabel;
	
	 
	 
public LawnmowerApp() {
	super("LawnMower Control App");
	this.buildGUI();
}

protected void buildGUI () {
	
	
	initializeWindow();
	//put the label in the container
	//includeGUIComponents(OStitle, imageLink);
	//includeGUIMenu();
	
	//this.add(c);	
}
	
	
	
protected void includeGUIMenu() {		
	   System.out.print("Mother MenuBar function Called");
	}
	
	//To be called Last
	protected void initializeWindow() {
		final int width = 412;
	    final int height = 732;
	        
		Point position = getPosition(width,height); 
	    this.setBounds(position.x, position.y, width, height);
		this.setSize(width, height);
		this.setEnabled(true);
		this.setVisible(true);
	}
   
	
	protected Point getPosition(int frameWidth, int frameHeight)
	  {
	  	Toolkit toolkit = Toolkit.getDefaultToolkit();
	  	Dimension dimensions = toolkit.getScreenSize();
	  	int x = (dimensions.width - frameWidth)/2;
	  	int y = (dimensions.height - frameHeight)/2;
	  	return (new Point(x,y));
	  }


	protected static ImageIcon createImageIcon(String path, String description) {
			java.net.URL imgURL = LawnmowerApp.class.getResource(path);
			if (imgURL != null) {
				   ImageIcon icon = new ImageIcon(imgURL, description);
		           Image img = icon.getImage() ;  
				   Image newimg = img.getScaledInstance( 300, 350,  java.awt.Image.SCALE_SMOOTH ) ;  
			return new ImageIcon( newimg );
			} else {
			System.err.println("Couldn't find file: " + path);
			return null;
			}
}

}
