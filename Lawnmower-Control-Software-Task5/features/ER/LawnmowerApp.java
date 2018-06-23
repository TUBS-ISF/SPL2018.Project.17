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
	

}
