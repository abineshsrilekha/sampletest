package selenium.topics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetScriptTimeout {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srilekha D\\Pictures\\Selenium\\chrome\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	
	Timeouts time = driver.manage().timeouts();
	
	time.setScriptTimeout(10, TimeUnit.SECONDS);
	
	
	
	driver.get("https://www.facebook.com/");
	
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
	String title = driver.getTitle();
	System.out.println(title);
	
	
	driver.quit();
	
	
	
	

}
}