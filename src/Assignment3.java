import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String usernameString  = "rahulshettyacademy";
		String pasString = "learning";

		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys(usernameString);
		driver.findElement(By.id("password")).sendKeys(pasString);
		driver.findElement(By.cssSelector("label[class='customradio'] input[value='user']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement element  = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select dropdownSelect = new Select(element);
		dropdownSelect.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()='Add ']")));
        List<WebElement> itemsList = driver.findElements(By.xpath("//button[text()='Add ']"));
        for (WebElement item : itemsList) {
        	item.click();
        }
        driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();

	}

}
