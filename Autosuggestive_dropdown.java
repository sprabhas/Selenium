package Browserautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Autosuggestive_dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> autosuggest_options = driver.findElements(By.id("//li[@class='ui-menu-item']//a"));
		//System.out.println("HI");
		for(WebElement option : autosuggest_options) {
			//System.out.println("hi in");
			if(option.getText().equalsIgnoreCase("India")){
				//System.out.println("YESS IN");
				option.click();
				break;
				
			}
		}
		
		
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")){
			System.out.println("Is enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}

}
