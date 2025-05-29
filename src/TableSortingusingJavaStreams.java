import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TableSortingusingJavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		WebElement staticDropdownElement = driver.findElement(By.id("page-menu"));
		Select select = new Select(staticDropdownElement);
		select.selectByValue("20");
		
		
		/////Old way of doing this stuff
		
//		ArrayList<String> unsortedList = new ArrayList<String>();
//		ArrayList<String> sortedList = new ArrayList<String>();
//		
//		for (WebElement element : driver.findElements(By.cssSelector("td:nth-child(1)"))) {
//			unsortedList.add(element.getText());
//		}
//		
//		System.out.println(unsortedList.size());
//		
//		driver.findElement(By.cssSelector("th:nth-child(1)")).click();
//		
//		for (WebElement element : driver.findElements(By.cssSelector("td:nth-child(1)"))) {
//			sortedList.add(element.getText());
//		}
//		
//		Assert.assertEquals(unsortedList, sortedList);
		
		
		/////Doing this using java streams
		///
	    List<String> unorderedList = driver.findElements(By.cssSelector("td:nth-child(1)")).stream().map(s->s.getText()).collect(Collectors.toList());
	    
	    List<String> sortedList = unorderedList.stream().sorted().collect(Collectors.toList());
	    
	    driver.findElement(By.cssSelector("th:nth-child(1)")).click();
	    
	    List<String> listAfterClicking = driver.findElements(By.cssSelector("td:nth-child(1)")).stream().map(s->s.getText()).collect(Collectors.toList());
	    
	    Assert.assertTrue(listAfterClicking.equals(sortedList));

	}

}
