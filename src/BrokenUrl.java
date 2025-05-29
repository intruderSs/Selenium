import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenUrl {

	public static void main(String[] args) throws IOException, URISyntaxException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> footerLinksList = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		SoftAssert softAssert = new SoftAssert();

		for (WebElement element : footerLinksList) {
			//System.out.println(element.getText() + ": " + element.getDomAttribute("href"));
			if (element.getDomAttribute("href").contains("https")) {
				URI uri = new URI(element.getDomAttribute("href"));
				HttpURLConnection connection = (HttpURLConnection) uri.toURL().openConnection();
				connection.setRequestMethod("HEAD");
				connection.connect();
				softAssert.assertTrue(connection.getResponseCode() < 400, element.getText()+" broke with status code: "+ connection.getResponseCode());
			}
		}
		softAssert.assertAll();

	}

}
