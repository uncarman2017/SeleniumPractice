package selenium.practice2.base;

import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import com.google.common.io.Files;

/**
 * 浏览器驱动基类
 */
public class DriverBase {
	private WebDriver driver;

	/**
	 *
	 * @param browser :
	 *  chrome/firefox
	 */
	public DriverBase(String browser) {
		this.driver  = new SelectDriver().driverName(browser);
	}
	
	public void stop() {
		System.out.println("浏览器关闭");
		driver.close();
	}
	
	/*
	 * 封装element
	 */
	public WebElement findElement(By by) {
		WebElement element = driver.findElement(by);
		return element;
	}
	
	public void get(String url) {
		driver.get(url);
	}

	/*
	 * 返回
	 */
	public void back() {
		driver.navigate().back();
	}
	
	/*
	 * 模态框切换
	 */
	public void switchToMode() {
		driver.switchTo().activeElement();
	}


	public void takeScreenShot() {
		long date = System.currentTimeMillis();
		String path = String.valueOf(date);
		String curPath = System.getProperty("user.dir");
		path = path +".png";
		String screenPath = curPath + "/" + path;
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(screen, new File(screenPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}System.out.println("截图了");
	}
}
