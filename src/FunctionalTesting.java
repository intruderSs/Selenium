import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] namesStrings = {"Cucumber", "Brocolli"};
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> productList = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i = 0; i < productList.size(); i++) {
			if (productList.get(i).getText().contains("Cucumber")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}

	}

}
