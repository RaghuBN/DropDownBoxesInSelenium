package DropDownBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook {
@Test 
public void FBlaunch() throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars\\Chrome\\chromedriver.exe");
	System.setProperty("webdriver.driver.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com");
	WebElement month_Dropdown=driver.findElement(By.id("month"));
	Select month_dd=new Select(month_Dropdown);
//WebElement str=month_dd.getFirstSelectedOption();

    month_dd.selectByIndex(3);
	Thread.sleep(10000);
	month_dd.selectByValue("9");
	Thread.sleep(10000);
	month_dd.selectByVisibleText("Aug");
	Thread.sleep(10000);
	
	
	

}
}
