package Browserautomation;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amzon_interview {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		WebDriverWait expWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] selectedVeggies = {"Cucumber","Carrot","Brocolli","Beetroot"};
		
		addItems(driver,selectedVeggies);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		expWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
				
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		expWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}
	

	public static void addItems(WebDriver driver ,String[] selectedVeggies) {
		int j = 0;
		List convertedArrList = Arrays.asList(selectedVeggies);
		List<WebElement> veggiesList = driver.findElements(By.cssSelector("h4.product-name"));
		//System.out.println(veggiesList);
		for(int i = 0 ;i < veggiesList.size(); i++) {
			
			String[] name = veggiesList.get(i).getText().split("-");
			String formattedName = name[0].trim();
			//System.out.println(formattedName);
			if(convertedArrList.contains(formattedName)){
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==selectedVeggies.length) {
					break;
				}
						
			}
			
		}
	}

}
