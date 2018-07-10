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
public aspect GreaterThan2Tasks {
	
	        //declare precedence: GreaterThan2Tasks; 

			before(): execution(void LawnmowerApp.includeGUIMenu()) {
				
				System.out.println("GreaterThan2Tasks");
				
				LawnmowerApp.moreTasksScheduler = new JMenuItem("More than 2 Tasks Planner");
				LawnmowerApp.toolsSubmenuTS.add(LawnmowerApp.moreTasksScheduler);
				
				
				LawnmowerApp.tools.add(LawnmowerApp.areaPlanner);
			}

}
