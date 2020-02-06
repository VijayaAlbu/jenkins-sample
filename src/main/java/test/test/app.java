package test.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class app {
	WebDriver driver;
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\vijaya\\Intellipaat\\DevOps\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("Hello facebook");
	}

}
