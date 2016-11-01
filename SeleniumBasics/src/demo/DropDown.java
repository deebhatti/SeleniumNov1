package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=76c6b2975a38a126a9dd200b1c306aee");
		
		WebElement x = driver.findElement(By.name("country"));
		
		Select country = new Select(x);
		//country.selectByVisibleText("UGANDA");
		//country.selectByIndex(27);
		country.selectByValue("8");
	}

}
