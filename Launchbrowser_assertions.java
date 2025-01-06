package Browserautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Launchbrowser_assertions extends Launchbrowser {

	public static void main(String[] args) throws InterruptedException {
		
		String name = "rahul";
		System.setProperty("webdriver.chrome", "/Users/muthuprabha/Documents/chromerdriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Launchbrowser_assertions lb_a = new Launchbrowser_assertions();
		String password = lb_a.getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(), "Hello" +name + ",");
		driver.findElement(By.className("logout-btn")).click();	
		driver.close();

	}
	
	public String getPassword(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("reset-pwd-btn")).click();		
		String pass_txt = driver.findElement(By.className("infoMsg")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] Splitted_arr = pass_txt.split("'");
		String act_password = Splitted_arr[1].split("'")[0];
		return act_password;
		
	}

}
