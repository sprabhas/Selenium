package Browserautomation;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Workingwith_calender {
	public static void main(String[] args) {
		String year = "2027";
		String month = "6";
		String date = "29";
		String[] expectedList = {month,date,year};
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//WebDriverWait expWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.cssSelector("div.react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector("button.react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector("button.react-calendar__navigation__label")).click();
		
		int yearCount = driver.findElements(By.cssSelector("button.react-calendar__tile.react-calendar__decade-view__years__year")).size();
		//expWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.react-calendar__tile.react-calendar__year-view__months__month abbr")));
		
		//String tmonth = driver.findElements(By.cssSelector("button.react-calendar__tile.react-calendar__decade-view__years__year")).
		
		//System.out.println(yearCount);
		for(int i = 1;i < yearCount ; i ++ ) {
			if(driver.findElements(By.cssSelector("button.react-calendar__tile.react-calendar__decade-view__years__year")).get(i).getText().equals(year)) {
				driver.findElements(By.cssSelector("button.react-calendar__tile.react-calendar__decade-view__years__year")).get(i).click();
				break;
			}
		}

		 driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		 driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		 
		 driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).getText();
		 
		List<WebElement> list = driver.findElements(By.cssSelector("input.react-date-picker__inputGroup__input"));
		for(int i = 0 ; i < list.size() ; i ++) {
			System.out.println(list.get(i).getAttribute("value"));
			Assert.assertEquals(list.get(i).getAttribute("value"), expectedList[i]);
			
		}
		
	}

}
