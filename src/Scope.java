import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("This webpage contains "+ driver.findElements(By.tagName("a")).size()+ " links.");
		
		WebElement footerSection = driver.findElement(By.id("gf-BIG"));
		System.out.println("The footer section of this webpage contains "+footerSection.findElements(By.tagName("a")).size() + " links.");
		
		WebElement firstColumnElement = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("The first column of footer sections contains " +firstColumnElement.findElements(By.tagName("a")).size()+" links.");
		
		for (int i = 1; i < firstColumnElement.findElements(By.tagName("a")).size(); i++) {
	        String clickonLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			firstColumnElement.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
		}
		
		Set<String> childWindows = driver.getWindowHandles();
		Iterator<String> iterator = childWindows.iterator();
		
		while (iterator.hasNext()) {
			driver.switchTo().window(iterator.next());
			System.out.println(driver.getTitle());
		}
		driver.switchTo().defaultContent();
		
	}

}
