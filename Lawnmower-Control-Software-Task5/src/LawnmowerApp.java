import java.awt.Color; 
import java.awt.Container; 
import java.awt.Dimension; 
import java.awt.FlowLayout; 
import java.awt.Point; 
import java.awt.Toolkit; 

import javafx.scene.text.Font; 


import javax.swing.*; 
import java.awt.*; 


public   class  LawnmowerApp  extends JFrame {
	

	/**
	 * 
	 */
	
	protected static final long serialVersionUID  = 1L;

	
	protected JLabel appLabel  ;

	
	
	 
	 
public LawnmowerApp() {
	super("LawnMower Control App");
	this.buildGUI();
}

	

 private void  buildGUI__wrappee__Base  () {
	
	
	initializeWindow();
	//put the label in the container
	//includeGUIComponents(OStitle, imageLink);
	//includeGUIMenu();
	
	//this.add(c);	
}

	
	
	
	 private void  buildGUI__wrappee__Web  () {
		includeGUIComponents("Web", "images/chrome-logo.jpg");
		buildGUI__wrappee__Base();
	}

	
	
	
	 private void  buildGUI__wrappee__AP  () {
		includeGUIMenu();
		buildGUI__wrappee__Web();
	}

	
	
	
	 private void  buildGUI__wrappee__2Task  () {
		includeGUIMenu();
		buildGUI__wrappee__AP();
	}

	
	
	
	 private void  buildGUI__wrappee__BR  () {
		includeGUIMenu();
		buildGUI__wrappee__2Task();
	}

	
	
	
	protected void buildGUI () {
		includeGUIMenu();
		buildGUI__wrappee__BR();
	}

	
		
	
	protected void includeGUIMenu  () {		
		   JMenuBar menuBar; 
		   JMenu tools, reportGenerator, toolsSubmenuTS;     
		   JMenuItem areaPlanner, twoTasksScheduler, moreTasksScheduler;  // For tools menu
		   JMenuItem basicReport, expertReport;    // For reportGenerator Menu
		   menuBar =  new JMenuBar();
		   //Define Tools menu and its respective values or items
		   tools = new JMenu("Tools");
		   
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
