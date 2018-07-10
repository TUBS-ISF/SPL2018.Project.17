

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.Toolkit;

import javafx.scene.text.Font;

import javax.swing.*;
import java.awt.*;
//import properties.PropertyManager;

public class LawnmowerApp extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JLabel appLabel;
	public static JMenuBar menuBar; 
	public static JMenu tools, reportGenerator, toolsSubmenuTS;     
	public static JMenuItem areaPlanner, twoTasksScheduler, moreTasksScheduler;  // For tools menu
	public static JMenuItem basicReport, expertReport;    // For reportGenerator Menu
	
   
	public static void main(String[] args) {
		new LawnmowerApp().AddFeatures();
	}
	
	public void AddFeatures() 
	{
		this.includeGUIComponents();
		this.includeGUIMenu();
		this.initializeWindow();
	}
	 
	public LawnmowerApp() {
		//Generate Window Title
		super("LawnMower Control App");
	}
	
	
	  
	
	private void includeGUIComponents() {	
		Container c = getContentPane(); //establish the container
		c.setLayout( new FlowLayout());
		//this.add(new JLabel(new ImageIcon("android-image.jpg")));
		
	   
		 
		 
	    
		 
		 //appLabel.setBackground(Color.BLACK);
		/*ImageIcon icon = createImageIcon("images/chrome-logo.jpg",
	               "Google Chrome Browser");
		
		 LawnmowerApp.appLabel = new JLabel("No operating System Selected",
                   JLabel.CENTER);*/
		 appLabel.setForeground(Color.BLACK);
		 //appLabel.setFont("Batang", BOLD, 55));
		 appLabel.setSize(new Dimension(150,150));
		 appLabel.setVerticalTextPosition(JLabel.BOTTOM);
		 appLabel.setHorizontalTextPosition(JLabel.CENTER);
		 c.add(appLabel);	
		 
	}
	
	private void includeGUIMenu() {		
	   
	   
	  
	   //In AP -Feature 
	   menuBar =  new JMenuBar();
	   //Define Tools menu and its respective values or items
	   tools = new JMenu("Tools");
	   //areaPlanner = new JMenuItem("Area Planner");
	   /* */
	  
	  /* if (PropertyManager.getProperty("ASW")) {
		   tools.add(areaPlanner);
	   
	   if (PropertyManager.getProperty("AP")) {
		   tools.add(areaPlanner);
	    }
	    
	   if (PropertyManager.getProperty("TS")) {
		   toolsSubmenuTS = new JMenu("Task Scheduler"); 
		   
		   if (PropertyManager.getProperty("LessOrEqual2Tasks")) {
			   twoTasksScheduler = new JMenuItem("2 Tasks Planner");
			   toolsSubmenuTS.add(twoTasksScheduler);   
		    }
		   
		   if (PropertyManager.getProperty("GreaterThan2Tasks")) {
			   moreTasksScheduler = new JMenuItem("More Tasks Planner");
			   toolsSubmenuTS.add(moreTasksScheduler);
		    }
		   
		   tools.add(toolsSubmenuTS);  
		  
	    }
	   
	   menuBar.add(tools);
	   }*/
		
		//tools.add(toolsSubmenuTS);  
		menuBar.add(tools);

/*	   if (PropertyManager.getProperty("RG")) {
		   //Define tools for reports menu
		   reportGenerator = new JMenu("Reports");
		   
		   if (PropertyManager.getProperty("BR")) {
			   basicReport = new JMenuItem("Basic Report");
			   reportGenerator.add(basicReport);
			   
			   //Event Listener
			   basicReport.addActionListener(new java.awt.event.ActionListener() {
		           public void actionPerformed(java.awt.event.ActionEvent evt) {
		               ReportWindow basicReportWindow = new ReportWindow("Basic Report");
		           }
		       });
			   
		    }
		   
		   
		   if (PropertyManager.getProperty("ER")) {
			   reportGenerator.addSeparator();
			   expertReport = new JMenuItem("Expert Report");
			   reportGenerator.add(expertReport);
			   
			   //Event Listener
			   expertReport.addActionListener(new java.awt.event.ActionListener() {
		           public void actionPerformed(java.awt.event.ActionEvent evt) {
		               ReportWindow expertReportWindow = new ReportWindow("Expert Report");
		           }
		       });
			   
		    }   
		   
		   menuBar.add(reportGenerator);
		  }*/
	  
	   
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
