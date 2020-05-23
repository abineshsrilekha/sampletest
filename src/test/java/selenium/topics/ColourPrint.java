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

public class ColourPrint {
	
	public static void main(String[] args) throws AWTException,IOException 			{
		 
	   
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srilekha D\\Pictures\\Selenium\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://stackoverflow.com/questions/24669787/how-to-verify-text-color-in-selenium-webdriver");
		

WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Stack Overflow')]"));

String colorprint = element.getCssValue("background-color");

System.out.println(colorprint);


driver.quit();
		
		
		
		
		
		
		
		
		
		
	 }

}


