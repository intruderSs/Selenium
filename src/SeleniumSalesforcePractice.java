import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumSalesforcePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Object> prefs = new HashMap<String, Object>();
	    
		//add key and value to map as follow to switch off browser notification
		//Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);
		    
		//Create an instance of ChromeOptions 
		ChromeOptions options = new ChromeOptions();
		    
		// set ExperimentalOption - prefs 
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://horizontaldigital-ba-dev-ed.develop.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("ssinha@lwc.com");
		driver.findElement(By.id("password")).sendKeys("Spaarroow&979797");
		driver.findElement(By.id("Login")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        driver.findElement(By.xpath("(//button[@title='App Launcher'])[1]")).click();
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//        driver.findElement(By.xpath("//div/div/one-app-launcher-menu/div/one-app-launcher-search-bar/lightning-input/lightning-primitive-input-simple/div/div/input")).sendKeys("Sales");
//        try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
        driver.findElement(By.xpath("(//button[normalize-space()='View All'])[1]")).click();
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        driver.findElement(By.xpath("//div/div/lightning-accordion/div/slot/lightning-accordion-section/div/section/div/slot/div/one-app-launcher-app-tile[@data-name='Sales']")).click();
        driver.findElement(By.xpath("//nav/div/one-app-nav-bar-item-root[@data-id='Account']")).click();       
        driver.findElement(By.cssSelector("a[title='New']")).click();
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        driver.findElement(By.xpath("(//input[@name='Name'])")).sendKeys("Shahil's Second Account");
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

}
