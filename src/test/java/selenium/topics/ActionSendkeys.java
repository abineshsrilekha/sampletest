package selenium.topics;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSendkeys {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srilekha D\\Pictures\\Selenium\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		
		
		Actions acc = new Actions(driver);
		
		acc.sendKeys(username,"Abinesh").build().perform();
		
		String nameEntered = username.getAttribute("value");
		
		System.out.println("nameEntered "+nameEntered);
		
		
		
			
		
	}
}
