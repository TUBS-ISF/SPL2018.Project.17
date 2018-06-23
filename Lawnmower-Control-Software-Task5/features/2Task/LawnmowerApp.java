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
		   
		  
			  
		   /*if[ASW]  	
			   tools.add(areaPlanner);
			   tools.add(areaPlanner);
			   areaPlanner = new JMenuItem("Area Planner");
			   */
			  
		    
		   /*if[TS]*/	
			   toolsSubmenuTS = new JMenu("Task Scheduler"); 
			   
			   /*if[2Task]*/	
				   twoTasksScheduler = new JMenuItem("2 Tasks Planner");
				   toolsSubmenuTS.add(twoTasksScheduler);   
			   /*end[2Task]*/	
			   
			   tools.add(toolsSubmenuTS);  
			  
		   /*end[TS]*/	
		   
		   menuBar.add(tools);
		
		   
		   /*end[ASW]*/	
	       System.out.println("I tried to execute");
		   
			   
		   //ADD ALL
		   
		   this.setJMenuBar(menuBar);
		      
		}
	

}
