import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		List<WebElement> listItemsList =  driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//li[@class='ui-menu-item']/div[text()='India']"))).click().build().perform();
		
		Assert.assertEquals(driver.findElement(By.xpath("//li[@class='ui-menu-item']/div[text()='India']")).getText(), driver.findElement(By.id("autocomplete")).getText());
	}

}
