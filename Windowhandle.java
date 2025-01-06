package Browserautomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> iterator = set.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
		
		String email = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(email);
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys(email);
		
	}

}
