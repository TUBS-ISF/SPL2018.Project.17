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
public aspect LessOrEqual2Tasks {
	
	        declare precedence: GreaterThan2Tasks; 

			before(): execution(void LawnmowerApp.includeGUIMenu()) {
				
				System.out.println("LessOrEqual2Tasks");
				 
				LawnmowerApp.twoTasksScheduler = new JMenuItem("2 or Less Tasks Planner");
				LawnmowerApp.toolsSubmenuTS.add(LawnmowerApp.twoTasksScheduler);  
		
				LawnmowerApp.tools.add(LawnmowerApp.areaPlanner);
				
			}

}
