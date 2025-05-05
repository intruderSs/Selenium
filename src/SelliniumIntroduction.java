import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelliniumIntroduction {

	public static void main(String[] args) {
		
	//System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\shahi\\Desktop\\chrome-win64.zip\"");
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.linkedin.com/in/shahil-sinha-2596011a4/");	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	//driver.close();
	
	
	WebDriver driver2 = new EdgeDriver();
	driver2.get("https://www.linkedin.com/in/shahil-sinha-2596011a4/");	
	System.out.println(driver2.getTitle());
	System.out.println(driver2.getCurrentUrl());
	//driver2.close();
	
	WebDriver driver3 = new FirefoxDriver();
	driver3.get("https://www.linkedin.com/in/shahil-sinha-2596011a4/");	
	System.out.println(driver3.getTitle());
	System.out.println(driver3.getCurrentUrl());
	//driver3.close();
	
	}

}
