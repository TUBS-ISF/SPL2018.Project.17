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
public aspect AP {
	
	    declare precedence: RG, LessOrEqual2Tasks, GreaterThan2Tasks; 

		before(): execution(void LawnmowerApp.includeGUIMenu()) {
			
			System.out.println("Area Planner");
			LawnmowerApp.menuBar =  new JMenuBar();
			   
			//Define Tools menu and its respective values or items
			LawnmowerApp.tools = new JMenu("Tools");
			LawnmowerApp.areaPlanner = new JMenuItem("Area Planner");
			
			LawnmowerApp.tools.add(LawnmowerApp.areaPlanner);
		}

}
