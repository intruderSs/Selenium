import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameInputBox = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameInputBox)).getText());
		
		WebElement dateofBirthLabel = driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateofBirthLabel)).click();
		
		WebElement checkboxLabel = driver.findElement(By.cssSelector("label[for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(checkboxLabel)).click();
		
		WebElement radioButton = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radioButton)).getText());
		

	}

}
