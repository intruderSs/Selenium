import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] itemsNeededArray = { "Cucumber", "Tomato" };

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		addItems(driver, itemsNeededArray);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.cssSelector("div[class='cart-preview active'] button[type='button']")).click();
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());

	}

	public static void addItems(WebDriver driver, String[] itemsNeededArray) {
		List<WebElement> productList = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < productList.size(); i++) {
			String[] name = productList.get(i).getText().split("-");
			String frmattedProductName = name[0].trim();
			List itemsNeededArrayList = Arrays.asList(itemsNeededArray);
			if (itemsNeededArrayList.contains(frmattedProductName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (itemsNeededArrayList.size() == j) {
					break;
				}
			}
		}
		
	}

}
