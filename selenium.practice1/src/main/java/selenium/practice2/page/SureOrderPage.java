package selenium.practice2.page;


import org.openqa.selenium.WebElement;
import selenium.practice2.base.DriverBase;
import selenium.practice2.util.LocatorHandler;

public class SureOrderPage extends BasePage{
	public SureOrderPage(DriverBase driver) {
		super(driver);
	}
	
	/*
	 * 获取提交订单按钮
	 */
	public WebElement getSubOrderElement() {
		return element(LocatorHandler.getLocator("sureOrder"));
	}
}
