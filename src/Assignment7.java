import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		
		jsExecutor.executeScript("window.scrollBy(0, 600)");
		
		List<WebElement> tableRowsList = driver.findElements(By.cssSelector(".table-display tr"));
		
		System.out.println("The total number of rows present in web table is: " + tableRowsList.size());
		
		List<WebElement> tableColumnsList = driver.findElements(By.cssSelector(".table-display tr:nth-child(3) td"));
		
		System.out.println("The total number of columns present in web table is: " + tableColumnsList.size());
		
		for (WebElement element : tableColumnsList) {
			System.out.println(element.getText());
		}

	}

}
