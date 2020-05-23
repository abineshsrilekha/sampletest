package selenium.topics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSendKeys {
	
	public static void main(String[] args) throws AWTException,IOException 			{
		 
	   
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srilekha D\\Pictures\\Selenium\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement username = driver.findElement(By.id("email"));
		
		js.executeScript("arguments[0].setAttribute('value','Srilekha')", username);
		
		
		Object usertext = js.executeScript("return arguments[0].getAttribute('value')", username);
		
		String s = (String)usertext;
		
		
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
	 }

}


