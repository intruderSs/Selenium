import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		List<String> priceList;

		do {
			List<WebElement> rows = driver.findElements(By.cssSelector("td:nth-child(1)"));
			priceList = rows.stream().filter(s -> s.getText().contains("Almond")).map(s -> getVeggiesPrice(s))
					.collect(Collectors.toList());
			if (priceList.size() < 1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		} while (priceList.size() < 1);

		priceList.forEach(s -> System.out.println(s));

	}

	private static String getVeggiesPrice(WebElement s) {
		String priceString = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceString;
	}

}
