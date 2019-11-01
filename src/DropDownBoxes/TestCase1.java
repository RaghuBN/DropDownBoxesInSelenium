package DropDownBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase1 {
	@Test
	public void Test() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars\\Chrome\\chromedriver.exe");
	System.setProperty("webdriver.driver.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com");
	WebElement month_Dropdown=driver.findElement(By.id("month"));
	Select month_dd= new Select(month_Dropdown);
	WebElement option = month_dd.getFirstSelectedOption();
	  String monthindex = option.getText();
	  System.out.println(monthindex);
	 month_dd.selectByIndex(12);
	 WebElement option1 = month_dd.getFirstSelectedOption();
	  String monthindex1 = option1.getText();
	  System.out.println(monthindex1);
	 Thread.sleep(10000);
	 
	  
}
}