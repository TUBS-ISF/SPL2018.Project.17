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

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private JLabel appLabel;
	
	
	protected void buildGUI () {
		includeGUIComponents("Android", "images/android-image.jpg");
		original();
	}
		
	protected void includeGUIComponents(String OStitle, String imageLink) 
	{	
		Container c = getContentPane(); //establish the container
		c.setLayout( new FlowLayout());



 	   //System.out.print("Android Operating System");
 	   ImageIcon icon = createImageIcon(imageLink,
 	    			OStitle+" Image");
 	   appLabel = new JLabel(OStitle,
 	  	                    icon,
 	  	                    JLabel.CENTER);
	
	    
	
		 //appLabel.setBackground(Color.BLACK);
		 appLabel.setForeground(Color.BLACK);
		 //appLabel.setFont("Batang", BOLD, 55));
		 appLabel.setSize(new Dimension(150,150));
		 appLabel.setVerticalTextPosition(JLabel.BOTTOM);
		 appLabel.setHorizontalTextPosition(JLabel.CENTER); 
		c.add(appLabel);	
		 
}


}
