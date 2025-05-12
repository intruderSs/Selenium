import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5")) {
			//System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")) {
			//System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		driver.findElement(By.id("Div1")).getDomAttribute("style");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//driver.findElement(By.xpath("//a[@value='DEL']")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']")).click();
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();

	}

}
