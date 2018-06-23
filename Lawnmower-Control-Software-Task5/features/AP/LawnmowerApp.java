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
		includeGUIMenu();
		original();
	}
		
	
	protected void includeGUIMenu() {		
		   JMenuBar menuBar; 
		   JMenu tools, reportGenerator, toolsSubmenuTS;     
		   JMenuItem areaPlanner, twoTasksScheduler, moreTasksScheduler;  // For tools menu
		   JMenuItem basicReport, expertReport;    // For reportGenerator Menu
		   menuBar =  new JMenuBar();
		   //Define Tools menu and its respective values or items
		   tools = new JMenu("Tools");
		   areaPlanner = new JMenuItem("Area Planner");
		  
		   /*if[ASW]*/	
			   tools.add(areaPlanner);
			   
			   /*if[AP]*/	
			   tools.add(areaPlanner);
		     /*end[AP]*/	
		    
		   
		   menuBar.add(tools);
		
		   /*end[ASW]*/	
		  
			   
		   //ADD ALL

		   this.setJMenuBar(menuBar);
		   
		   //c.add(menuBar);
		   
		   //adding all listeners to the buttons (MenuItems)	   
		   
		   
		}
	

}
