package selenium.practice2.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDriver {

	private static String chromeDriverPath = "D:\\.m2\\chromedriver_win32\\chromedriver.exe";

	private static String firefoxDriverPath = "D:\\.m2\\geckodriver-v0.22.0-win64\\geckodriver.exe";

	public WebDriver driverName(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			return new ChromeDriver();
		}else {
			System.setProperty("webdriver.firefox.driver", firefoxDriverPath);
			return new FirefoxDriver();
		}
	}
}
