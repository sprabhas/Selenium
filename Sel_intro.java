package Browserautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_intro {

	public static void main(String[] args) {
		
		
		//invoking browser
		System.setProperty("webdriver.chrome", "/Users/muthuprabha/Documents/chromerdriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		

	}

}
