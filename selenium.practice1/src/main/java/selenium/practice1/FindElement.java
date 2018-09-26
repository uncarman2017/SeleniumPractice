package selenium.practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * 元素定位试验
 * 使用WebDriver接口的findElement方法
 */
public class FindElement {

	public static void main(String[] args) {
		//设置系统属性
		System.setProperty ( "webdriver.chrome.driver" , "D:\\.m2\\chromedriver_win32\\chromedriver.exe" );

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.imooc.com/user/newlogin");
		driver.findElement(By.name("email")).sendKeys("18291857993");
		driver.findElement(By.name("password")).sendKeys("19970505");
		driver.findElement(By.id("auto-signin")).click();
		driver.findElement(By.className("moco-btn")).click();
		driver.manage().window().maximize();
		driver.findElement(By.className("search-input")).click();
		driver.findElement(By.className("search-input")).sendKeys("自动测试");
		WebElement element = driver.findElement(By.className("nav-item"));
		List<WebElement> elements = element.findElements(By.tagName("li"));
		elements.get(3).click();
		
	}

}
