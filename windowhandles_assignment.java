package Browserautomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles_assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		 driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		 driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		 
		 Set<String> set = driver.getWindowHandles();
		 Iterator<String> iterator = set.iterator();
		 String parent = iterator.next();
		 String child = iterator.next();
		 driver.switchTo().window(child);
		 System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
		 driver.switchTo().window(parent);
		 System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
		 
		
		
		

	}

}
