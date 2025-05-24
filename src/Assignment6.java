import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String option = driver.findElement(By.id("checkBoxOption2")).getDomAttribute("value");
		driver.findElement(By.id("checkBoxOption2")).click();
		WebElement staticDropdownElement = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticDropdownElement);
		dropdown.selectByValue(option);
		
		driver.findElement(By.id("name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
	    String alertText = driver.switchTo().alert().getText();	    
	    Assert.assertEquals(option, alertText.split(" ")[1].split(",")[0]);
	    driver.switchTo().alert().accept();

	}

}
