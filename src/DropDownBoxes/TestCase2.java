`package DropDownBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase2 {
@Test
public void Test() {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars\\Chrome\\chromedriver.exe");
	System.setProperty("webdriver.driver.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com");
	driver.manage().window().maximize();
	WebElement month_Dropdown=driver.findElement(By.id("month"));
	Select month_dd=new Select(month_Dropdown);
	//String Item=month_Dropdown.getText();
	//System.out.println(Item);
	List<WebElement> month_list=month_dd.getOptions();
	int total_month=month_list.size();
	System.out.println("Total months count in List : "+total_month);
	for(WebElement ele:month_list) {
		String month_name=ele.getText();
		System.out.println("Months Names are :"+month_name);
		
	}
	driver.quit();
}
}
