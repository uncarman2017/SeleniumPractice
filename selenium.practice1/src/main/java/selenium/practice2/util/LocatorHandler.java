package selenium.practice2.util;

import org.openqa.selenium.By;

/**
 * 定位器处理器
 */
public class LocatorHandler {
	private static String propFilePath = "E:\\github\\selenium\\SeleniumPractice\\seleniumpractice1\\src\\main\\resources\\element.properties";

	public static By getLocator(String key) {
		PropUtil properties = new PropUtil(propFilePath) ;
		String locator = properties.getProp(key);
		String locatorType = locator.split(">")[0];
		String locatorValue = locator.split(">")[1];
		
		if(locatorType.equals("id")) {
			return By.id(locatorValue);
		}else if (locatorType.equals("name")) {
			return By.name(locatorValue);
		}else if (locatorType.equals("className")) {
			return By.className(locatorValue);
		}else if (locatorType.equals("tagName")) {
			return By.tagName(locatorValue);
		}else {
			return By.xpath(locatorValue);
		}
	}
}
