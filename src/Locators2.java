import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.AddHasCasting;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nameString = "Shahil Sinha";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		String passwordString =  getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(nameString);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(passwordString);
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//System.out.println("Tagname "+driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello "+nameString+",");
        driver.findElement(By.xpath("//button[text()=\"Log Out\"]")).click();
        driver.close();
	}
	
	public static String getPassword (WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[text()=\"Reset Login\"]")).click();
		String passwordTextString = driver.findElement(By.tagName("p")).getText();
		String[] passwordArrayString = passwordTextString.split("'");
		return passwordArrayString[1].split("'")[0];
	}

}
