package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyErrorMessage {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password");
		
		driver.findElement(By.id("u_0_l")).click();
		
		String expectedMessage = "The password that you've entered is incorrect. Forgotten password?";
		
		String actualMessage = driver.findElement(By.xpath("//*[@id='js_0']/dv/div/div")).getText();
		
		if (expectedMessage.equals(actualMessage)){
			System.out.println("Test Case Passed");
		}
		
		else {
			System.out.println("Test Case Failed");
		}	
		
		
		driver.close();
	}

}
