import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.NoSuchDriverException;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEndTicketBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    try {
	    	Thread.sleep(1000);
	    } catch (InterruptedException e) {
	    	e.printStackTrace();
	    }
	    driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']")).click();
	    try {
	    	Thread.sleep(1000);
	    } catch (InterruptedException e) {
	    	e.printStackTrace();
	    }
	    driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	    try {
	    	Thread.sleep(1000);
	    } catch (InterruptedException e) {
	    	e.printStackTrace();
	    }
	    driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
	    if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5")) {
	    	Assert.assertTrue(true);
	    } else {
	    	Assert.assertTrue(false);
	    }
	    driver.findElement(By.id("divpaxinfo")).click();
	    try {
	    	Thread.sleep(1000);
	    } catch (InterruptedException e) {
	    	e.printStackTrace();
	    }
	    for (int i = 1; i < 3; i++) {
	    	driver.findElement(By.id("hrefIncAdt")).click();
	    }
        for (int c = 0; c < 2; c++) {
        	driver.findElement(By.id("hrefIncChd")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult, 2 Child");
        try {
	    	Thread.sleep(1000);
	    } catch (InterruptedException e) {
	    	e.printStackTrace();
	    }
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
        WebElement staticDropdownDriver = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdownSelect = new Select(staticDropdownDriver);
        dropdownSelect.selectByVisibleText("INR");
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        driver.close();
	}

}
