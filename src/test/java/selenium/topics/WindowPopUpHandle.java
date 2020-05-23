package selenium.topics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		/*WINDOW POPUP________________

		1. need to switch into popup
		2. can use window ID
		3. Set- collections concept- package- java.util
		4. Here we use window handler API*/

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srilekha D\\Pictures\\Selenium\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Good PopUp #3']")).click();
		
		Set<String> allWindowId = driver.getWindowHandles();
		
		Iterator<String> iterator = allWindowId.iterator();
		

		Thread.sleep(5000);
		String parentId = iterator.next();
		System.out.println(parentId);
		
		String childId = iterator.next();
		System.out.println(childId);

		Thread.sleep(5000);
		System.out.println("child title  "+driver.switchTo().window(childId).getTitle());
		
		driver.close();
		
		
		
		
	}
}
