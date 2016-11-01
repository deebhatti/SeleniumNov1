package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {
	public static void main(String[] args) {
		WebDriver driver2 = new FirefoxDriver();
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver2.get("http://www.dice.com/");
		
		driver2.findElement(By.name("q")).sendKeys("Selenium");
		

		driver2.findElement(By.cssSelector("input#search-field-location")).clear();
		

		driver2.findElement(By.cssSelector("input#search-field-location"))
		.sendKeys("Dallas, Texas");
		driver2.findElement(By.xpath
				("//*[@id='search-form']/fieldset/div[4]/div/div[1]/button")).click();
		//driver2.close();
	}

}
