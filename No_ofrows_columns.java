package Browserautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_ofrows_columns {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int rowCount = driver.findElements(By.cssSelector("table[name='courses'] tr")).size();
		int colCount = driver.findElements(By.cssSelector("table[name='courses'] tr th")).size();
		
		String secondRowContent = driver.findElement(By.cssSelector("table[name='courses'] tr:nth-child(3)")).getText();
		
		System.out.println("Row count : " +rowCount );
		System.out.println("Col count : " +colCount );
		System.out.println("Secong row content : " +secondRowContent );
		
		driver.findElement(By.id("autocomplete")).sendKeys("amer");
		
		int cityCount = driver.findElements(By.cssSelector("div.ui-menu-item-wrapper")).size();
		for (int i = 0 ; i < cityCount ; i ++) {
			
			if(driver.findElement(By.cssSelector("div.ui-menu-item-wrapper")).getText().equals("American Samoa")){
				driver.findElement(By.cssSelector("div.ui-menu-item-wrapper")).click();
				
			}
		}
	}

}
