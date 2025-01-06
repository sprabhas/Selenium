package Browserautomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class assignment_formsubmit {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("Muthuprabha");
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='email']")).sendKeys("sprabhashankar2429@gmail.com");
		driver.findElement(By.xpath("//div[@class='form-group']//input[@type='password']")).sendKeys("prabha123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dd = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(dd);
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='bday']")).sendKeys("29/06/1999");
		
		//submit
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
	}

}
