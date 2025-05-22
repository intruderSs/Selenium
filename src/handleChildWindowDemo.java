import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleChildWindowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("(//a[contains(text(),'Free Access to')])")).click();
		Set<String> windowSet  = driver.getWindowHandles();
		Iterator<String> iterator  = windowSet.iterator();
		String parentId = iterator.next();
		String childId = iterator.next();
		driver.switchTo().window(childId);
		String userName =  driver.findElement(By.cssSelector(".im-para.red")).getText().split(" ")[4].trim();
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(userName);

	}

}
