import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public aspect BR {
	
	declare precedence: ER; 

	before(): execution(void LawnmowerApp.includeGUIMenu()) 
	{
		
		System.out.println("Basic Report");
		LawnmowerApp.menuBar =  new JMenuBar();
		LawnmowerApp.reportGenerator = new JMenu("Reports");
		LawnmowerApp.basicReport = new JMenuItem("Basic Report");
		LawnmowerApp.reportGenerator.add(LawnmowerApp.basicReport);
		
	   //Event Listener
		LawnmowerApp.basicReport.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               ReportWindow basicReportWindow = new ReportWindow("Basic Report");
           }
       });
		
		LawnmowerApp.menuBar.add(LawnmowerApp.reportGenerator);
	}

}