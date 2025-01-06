package Browserautomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Realtime_ex {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		
		 int coun = driver.findElements(By.tagName("a")).size();
		 System.out.println(coun);
		
		 int footerCoun = driver.findElements(By.xpath("//div[@id=\"gf-BIG\"]//a")).size();
	     System.out.println(footerCoun);
		
		 //ANOTHER WAY
		 WebElement footerSection = driver.findElement(By.id("gf-BIG"));
		 int footerCount = footerSection.findElements(By.tagName("a")).size();
		 System.out.println(footerCount);
		 
		 //count a tags under discount coupons
		 int couponsCount = driver.findElements(By.xpath("//div[@id='gf-BIG']//td[1]//a")).size();
		 System.out.println(couponsCount);
		
		 //ANOTHER WAY
		 WebElement fs = footerSection.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		 int discountCouponsCount = fs.findElements(By.tagName("a")).size();
		 System.out.println(discountCouponsCount);
		
		 //check if the links under the discount coupons are working
		 for(int i = 1 ; i < fs.findElements(By.tagName("a")).size() ; i++) {
			 
			 String click = Keys.chord(Keys.COMMAND,Keys.ENTER);
			 fs.findElements(By.tagName("a")).get(i).sendKeys(click);
		 }
			 Set<String> set = driver.getWindowHandles();
			 Iterator<String> iterator = set.iterator();
			 
			 while(iterator.hasNext()) {
				 
				 driver.switchTo().window(iterator.next());
				 System.out.println(driver.getTitle());
			 }
			
		
	}

}
