package selenium.topics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Srilekha D\\Pictures\\Selenium\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.id("email")).sendKeys("9790766939");

		driver.findElement(By.id("pass")).sendKeys("Abinesh123");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		WebElement element = driver.findElement(By.xpath("//div[@class='_1mf _1mj']"));
		
		element.click();
		
		element.sendKeys("hello");
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}
}
