import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys("Shahil Sinha");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("shahilsinha1133@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Password");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dropdownElement = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdownSelect = new Select(dropdownElement);
		dropdownSelect.selectByVisibleText("Male");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("1998-01-27");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());

	}

}
