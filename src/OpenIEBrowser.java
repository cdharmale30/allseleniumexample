import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenIEBrowser {

		 public static void main(String [] args) throws Exception{
             System.setProperty("webdriver.ie.driver","G:\\IEDriver\\IEDriverServer.exe");
             //Initialize InternetExplorerDriver Instance.
             WebDriver driver = new InternetExplorerDriver();
             driver.manage().window().maximize();
             driver.get("https://www.softwaretestingmaterial.com/software-testing-interview-questions-free-ebook/");
             System.out.println("Selenium Webdriver Script in Internet Explorer browser | Software Testing Material");
             driver.close();
      }
}