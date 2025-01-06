package Browserautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class General_assignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		String checkboxOpt = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		
		//System.out.println(checkboxOpt);
		//dropdown-class-example
		WebElement selDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropDown = new Select(selDropdown);
		
		dropDown.selectByVisibleText(checkboxOpt);
		//name
		driver.findElement(By.id("name")).sendKeys(checkboxOpt);
		driver.findElement(By.id("alertbtn")).click();
		
		//String alertMsg = driver.switchTo().alert().getText().split(" ")[1].split(",")[0];
		String alertMsg = driver.switchTo().alert().getText();
			
		//if(alertMsg.equals(checkboxOpt)) {
		//	driver.switchTo().alert().accept();
		//}
		
		if(alertMsg.contains(checkboxOpt)) {
			System.out.println("SUCCESS");
		}
		else {
			System.out.println("FAILURE");
		}
		
	}

}
