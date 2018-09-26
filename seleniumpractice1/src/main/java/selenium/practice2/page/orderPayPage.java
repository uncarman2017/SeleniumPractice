package selenium.practice2.page;


import org.openqa.selenium.WebElement;
import selenium.practice2.base.DriverBase;
import selenium.practice2.util.LocatorHandler;

public class orderPayPage extends BasePage{
	public orderPayPage(DriverBase driver) {
		super(driver);
	}
	
	/*
	 * 获取订单号element
	 */
	public WebElement getOrderNumElement() {
		return element(LocatorHandler.getLocator("order"));
	}
	
	/*
	 * 返回课程名称element
	 */
	public WebElement getOrderCourseNameElement() {
		return nodeElement(LocatorHandler.getLocator("orderCourse"),LocatorHandler.getLocator("orderCourseNode"));
	}
	
	/*
	 * 返回支付包element
	 */
	public WebElement getAliPayElement() {
		return element(LocatorHandler.getLocator("alipay"));
	}
	
	/*
	 * 点击立即支付element
	 */
	public WebElement getOrderPayElement() {
		return element(LocatorHandler.getLocator("orderpay"));
	}
}
