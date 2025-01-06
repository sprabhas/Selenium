package Browserautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_parent_sibling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome", "/Users/muthuprabha/Documents/chromerdriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElement(By.xpath("//header/div/button/following-sibling::button[2]")).getText());
		////header/div/button[1]/following-sibling::button[2]/parent::div/parent::header/a
		
		

	}

}
