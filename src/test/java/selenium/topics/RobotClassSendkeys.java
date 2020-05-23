package selenium.topics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RobotClassSendkeys {
	
	public static void main(String[] args) throws AWTException,IOException 			{
		 
	   // Runtime.getRuntime().exec("Notepad");
	    
	    
	    
	    
	    Runtime.getRuntime().exec("Notepad");
	 
	    Robot robot = new Robot();
	    
		robot.keyPress(KeyEvent.VK_Q);
	    robot.keyRelease(KeyEvent.VK_Q);
	 
	 
	    robot.keyPress(KeyEvent.VK_U);
	    robot.keyRelease(KeyEvent.VK_U);
	 
	    robot.keyPress(KeyEvent.VK_O);
	    robot.keyRelease(KeyEvent.VK_O);
	 
	    robot.keyPress(KeyEvent.VK_R);
	    robot.keyRelease(KeyEvent.VK_R);
	 
	    robot.keyPress(KeyEvent.VK_A);
	    robot.keyRelease(KeyEvent.VK_A);
	 }

}


