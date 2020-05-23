package selenium.topics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotClass {
	
	public static void main(String[] args) throws AWTException,IOException 			{
		 
	   
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srilekha D\\Pictures\\Selenium\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Abinesh");
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		File desc = new File("C:\\Users\\Srilekha D\\Pictures\\Selenium\\screenshot\\abi.png");
		
		FileUtils.copyFile(src, desc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 }

}


