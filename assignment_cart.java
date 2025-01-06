package Browserautomation;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment_cart {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();		
		WebDriverWait expWait = new WebDriverWait(driver, Duration.ofSeconds(3));
		int j = 0;
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		String[] selectedPhone = {"iphone","Nokia"};
		List selectedPhoneArrLists = Arrays.asList(selectedPhone);
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[value='user']")).click();
		expWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement dd = driver.findElement(By.cssSelector("select.form-control"));
		Select dropDown = new Select(dd);
		dropDown.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		
		expWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4.card-title a")));
		List<WebElement> phoneList = driver.findElements(By.cssSelector("h4.card-title a"));
		//System.out.println(phoneList);
		for(int i = 0; i < phoneList.size() ; i++) {
			
			String[] phoneName = phoneList.get(i).getText().split(" ");
			String formattedPhoneName = phoneName[0].trim();
			
			//System.out.println(formattedPhoneName);
			if(selectedPhoneArrLists.contains(formattedPhoneName)) {
				j++;
				driver.findElements(By.cssSelector("button.btn.btn-info")).get(i).click();
				if(j==selectedPhone.length) {
					break;
				}
			}
		}
		driver.findElement(By.cssSelector("li.nav-item.active a")).click();
		driver.findElement(By.cssSelector("button.btn.btn-success")).click();
		
		
		
	}

}
