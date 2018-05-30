package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import javafx.scene.text.Font;

import javax.swing.*;
import java.awt.*;

public class LawnmowerApp extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel appLabel;
	
	 
	 
	public LawnmowerApp() {
		super("LawnMower Control App");
		
		//put the label in the container
		includeGUIComponents();
		includeGUIMenu();
		initializeWindow();
		//this.add(c);	
	}
	
	
	  
	
	private void includeGUIComponents() {	
		Container c = getContentPane(); //establish the container
		c.setLayout( new FlowLayout());
		
		 //Set and Prepare properties of the first Textfield
	 
		/*if[Android]*/
 	    	System.out.print("Android Operating System");
 	    	ImageIcon icon = createImageIcon("images/bettermobile.jpg",
 	               "Android Image");
 	    	appLabel = new JLabel("Android",
 	  	                    icon,
 	  	                    JLabel.CENTER);
	   /*end[Android]*/
	    
	/*if[iOS]*/
	 	    System.out.print("iOS");
	 	    
	 	   ImageIcon icon = createImageIcon("images/apple-image.png",
 	               "Apple iOS Logo");
 	        appLabel = new JLabel("Apple iOS",
 	  	                    icon,
 	  	                    JLabel.CENTER);
     /*end[iOS]*/ 
		 
		 
         /*if[Web]*/	 
	 	    System.out.print("Web Browser");
	 	    
	 	   ImageIcon icon = createImageIcon("images/chrome-logo.jpg",
 	               "Google Chrome Browser");
 	        appLabel = new JLabel("Web Browser",
 	  	                    icon,
 	  	                    JLabel.CENTER);  
		  /*end[Web]*/   
		 
		 //appLabel.setBackground(Color.BLACK);
		 appLabel.setForeground(Color.BLACK);
		 //appLabel.setFont("Batang", BOLD, 55));
		 appLabel.setSize(new Dimension(150,150));
		 appLabel.setVerticalTextPosition(JLabel.BOTTOM);
		 appLabel.setHorizontalTextPosition(JLabel.CENTER);
		 c.add(appLabel);	
		 
	}
	
	private void includeGUIMenu() {		
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
	    
	   /*if[TS]*/	
		   toolsSubmenuTS = new JMenu("Task Scheduler"); 
		   
		   /*if[2Task]*/	
			   twoTasksScheduler = new JMenuItem("2 Tasks Planner");
			   toolsSubmenuTS.add(twoTasksScheduler);   
		   /*end[2Task]*/	
		   
		   /*if[>2Task]*/	
			   moreTasksScheduler = new JMenuItem("More Tasks Planner");
			   toolsSubmenuTS.add(moreTasksScheduler);
		   /*end[>2Task]*/	
		   
		   tools.add(toolsSubmenuTS);  
		  
	   /*end[TS]*/	
	   
	   menuBar.add(tools);
	
	   
	   /*end[ASW]*/	
	   
	   
	   
	   /*if[RG]*/	
		   //Define tools for reports menu
		   reportGenerator = new JMenu("Reports");
		   
		   /*if[BR]*/	
			   basicReport = new JMenuItem("Basic Report");
			   reportGenerator.add(basicReport);
			   
			   //Event Listener
			   basicReport.addActionListener(new java.awt.event.ActionListener() {
		           public void actionPerformed(java.awt.event.ActionEvent evt) {
		               ReportWindow basicReportWindow = new ReportWindow("Basic Report");
		           }
		       });
			   
		   /*end[BR]*/	
			   
		   
		  /*if[ER]*/	 
			   reportGenerator.addSeparator();
			   expertReport = new JMenuItem("Expert Report");
			   reportGenerator.add(expertReport);
			   
			   //Event Listener
			   expertReport.addActionListener(new java.awt.event.ActionListener() {
		           public void actionPerformed(java.awt.event.ActionEvent evt) {
		               ReportWindow expertReportWindow = new ReportWindow("Expert Report");
		           }
		       });
			   
		   /*end[ER]*/	
		   
		   menuBar.add(reportGenerator);
	   /*end[RG]*/	
	   
		   
	   //ADD ALL
	   
	  
	   this.setJMenuBar(menuBar);
	   
	   //c.add(menuBar);
	   
	   //adding all listeners to the buttons (MenuItems)
	   
	   
	   
	  
	   
	   
	   
	   
	   
	   
	}
	
	//To be called Last
	private void initializeWindow() {
		final int width = 412;
	    final int height = 732;
	        
		Point position = getPosition(width,height); 
	    this.setBounds(position.x, position.y, width, height);
		this.setSize(width, height);
		this.setEnabled(true);
		this.setVisible(true);
	}
   
	
	public Point getPosition(int frameWidth, int frameHeight)
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
