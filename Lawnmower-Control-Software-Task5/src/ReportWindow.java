import java.awt.Container; 
import java.awt.Dimension; 
import java.awt.FlowLayout; 
import java.awt.Point; 
import java.awt.Toolkit; 

import javax.swing.ImageIcon; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JTextArea; 

public  class  ReportWindow  extends JFrame {
	
  
	private JTextArea jTextArea1;

	
	private JLabel jLabel;

	
	
	//jTextArea1.(String text, int rows, int columns);
	
	public ReportWindow(String reportType) { super(reportType);
		initializeGUI(reportType);
		initializeWindow();	
	}

	
	

public JLabel getAppLabel() {
	return jLabel;
}

	

public JTextArea getTextArea() {
	return jTextArea1;
}

	
	
public void initializeGUI(String reportType) {
	Container c = getContentPane(); //establish the container
	c.setLayout( new FlowLayout());
	
   if (reportType == "Expert Report") {
	   reportType += ": Your lawn is doomed";
   } else if (reportType == "Basic Report") {
	   reportType += ": Everything is fine with your Lawn";
   }
   
	jTextArea1 = new JTextArea(reportType, 10, 20);
	c.add(jTextArea1);
}

	 
	
	//To be called Last
private void initializeWindow() {
	final int width = 350;
    final int height = 550;
        
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


}
