import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * 
 */

/**
 * @author x
 *
 */
public aspect TS {
	
	        declare precedence: LessOrEqual2Tasks, GreaterThan2Tasks; 

			before(): execution(void LawnmowerApp.includeGUIMenu()) {
				
				System.out.println("TS");
				LawnmowerApp.toolsSubmenuTS = new JMenu("Task Scheduler"); 
				
				LawnmowerApp.tools.add(LawnmowerApp.areaPlanner);
				
				LawnmowerApp.tools.add(toolsSubmenuTS);
			}

}
