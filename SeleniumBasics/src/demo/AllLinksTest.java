package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.jboss.netty.util.internal.SystemPropertyUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinksTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links on the page= " + links.size());

		String[] linkTexts = new String[links.size()];
		int i = 0;

		// extract text from the links
		for (WebElement e : links) {
			linkTexts[i] = e.getText();
			i++;
		}

		// test each link
		for (String t : linkTexts) {
			driver.findElement(By.linkText(t)).click();
			if (driver.getTitle().equals("Under Construction: Mercury Tours")) {
				System.out.println(t + " is not working");
			}

			else {
				System.out.println(t + " is working");
			}
			
			driver.navigate().back();

		}

		

		driver.quit();

	}

}
