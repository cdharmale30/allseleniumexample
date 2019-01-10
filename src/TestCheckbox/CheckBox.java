package TestCheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.ironspider.ca/forms/checkradio.htm");
	
WebElement checkboxe=driver.findElement(By.xpath("//input[@type='checkbox']"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView(true);",checkboxe);


List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
 int size=checkboxes.size();
 
 for (int i = 0; i <size; i++) {
	 
	 //if click on only the only one check box
	/*if( checkboxes.get(i).getAttribute("value").equalsIgnoreCase("Red")){
		checkboxes.get(i).click();
	}*/
	//if click on all check boxes then used ..
	 //checkboxes.get(i).click();
	 
	 
	 //if u want the two checkbox select.....
	String box =checkboxes.get(i).getAttribute("value");
	if (box.equalsIgnoreCase("red")||box.equalsIgnoreCase("blue")) {
		
		checkboxes.get(i).click();
	}	
 }}
}
