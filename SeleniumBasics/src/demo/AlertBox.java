package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();  //Equivalent to clicking on 'Yes' or 'Ok'
		//driver.switchTo().alert().dismiss(); //Equivalent to clicking on 'No' or 'Cancel'
	}

}
