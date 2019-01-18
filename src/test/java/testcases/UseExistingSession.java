package testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UseExistingSession {

	WebDriver driver;
	By byEmail = By.xpath("//input[@type='email']");
	By byNumber = By.xpath("//input[@type='number']");
	
	@Test
	public void fillForm()
	{

		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("debuggerAddress", "localhost:9014");

		driver = new ChromeDriver(chromeOptions);
		driver.findElement(byEmail).click();
		driver.findElement(byEmail).sendKeys("aarahman@tekion.com");
		
		driver = new ChromeDriver(chromeOptions);
		driver.findElement(byNumber).click();
		driver.findElement(byNumber).sendKeys("123456789");
		

	}

}
