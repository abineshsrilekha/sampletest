package selenium.topics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeWait {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srilekha D\\Pictures\\Selenium\\chrome\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
		
	Timeouts time = driver.manage().timeouts();
	
	time.pageLoadTimeout(15, TimeUnit.SECONDS);
	
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	
	
	
	String title = driver.getTitle();
	System.out.println(title);
	
	
	driver.quit();
	
	
	
	

}
}