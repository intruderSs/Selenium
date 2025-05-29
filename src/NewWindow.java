import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		///Switching Window
		
		driver.switchTo().newWindow(WindowType.TAB);     ///We can also use WINDOW instead of tab if we want to open the second link in another window
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String parentIdString = iterator.next();
		String childIdString = iterator.next();
		driver.switchTo().window(childIdString);
		driver.get("https://rahulshettyacademy.com/");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[contains(text(),'All-Access')]")));
		
		String nameString = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
		
		driver.switchTo().window(parentIdString);
		
		WebElement namElement = driver.findElement(By.cssSelector("[name='name']"));
		
		namElement.sendKeys(nameString);
		
		//?Screenshot
		
	//	File file = namElement.getScreenshotAs(OutputType.FILE);
	//	Files.copy(file, new File("d:\\partial_screenshot.png"));
		
		
		///get the height and width of web element
		System.out.println("Height of the editbox is "+namElement.getRect().getDimension().getHeight()+" px");
		System.out.println("Width of the editbox is "+namElement.getRect().getDimension().getWidth()+" px");

	}

}
