import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.NoSuchDriverException;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumofValues = 0;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("window.scrollBy(0, 500)");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		jsExecutor.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
		List<WebElement> valuesList  =  driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		for (WebElement element : valuesList) {
			sumofValues += Integer.parseInt(element.getText());
		}
        System.out.println("Sum of values present in the table is: "+sumofValues);
        String sumofActualElement = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
        Assert.assertEquals(Integer.parseInt(sumofActualElement), sumofValues);
	}

}
