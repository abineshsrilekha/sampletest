package selenium.topics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class hi {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srilekha D\\Pictures\\Selenium\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Timeouts time = driver.manage().timeouts();
		
		time.pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.get("https://stackoverflow.com/questions/24669787/how-to-verify-text-color-in-selenium-webdriver");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
