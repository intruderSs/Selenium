import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAcivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.youtube.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.close(); 
	}

}
