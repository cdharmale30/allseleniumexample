import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicXPathTest {

	public static void main(String[] args) {
	WebDriver driver =new FirefoxDriver();
		
		//** For Open The Url
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fwww.google.co.in%2F&hl=en&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		//** For Maximize Browser
		driver.manage().window().maximize();
		driver.findElement(By.id(".//*[@name='identifier']")).sendKeys("chetanrdharmale");
		
	}

}
