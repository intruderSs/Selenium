import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[text()='Practice']/following-sibling::button[1]")).getText());
//		System.out.println(driver.findElement(By.xpath("\"//header/div/button[text()='Practice']/parent::div")).getTagName());
		System.out.println(driver.findElement(By.xpath("//header/div/button[text()='Practice']/parent::div/button[2]")).getText()); 
		driver.close();

	}

}
