package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	private static WebDriver driver;

	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"./browserServers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public static WebDriver getDriver() {
		return driver;
	}

}
