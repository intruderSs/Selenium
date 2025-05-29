import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSearchFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Tomato");
		List<WebElement> searchedItemsList = driver.findElements(By.cssSelector("td:nth-child(1)"));
		
		List<WebElement> filteredItemsList = searchedItemsList.stream().filter(s->s.getText().contains("Tomato")).collect(Collectors.toList());
		
		Assert.assertEquals(searchedItemsList.size(), filteredItemsList.size());

	}

}
