package selenium.practice2.page;



import org.openqa.selenium.WebElement;
import selenium.practice2.base.DriverBase;
import selenium.practice2.util.LocatorHandler;

/**
 * 登录页访问类
 */
public class LoginPage extends BasePage{
	public LoginPage(DriverBase driver){
		super(driver);
	}
	
	/*
	 * 获取用户名输入框
	 */
	public WebElement getUserElement() {
		return element(LocatorHandler.getLocator("name"));
	}
	
	/*
	 * 获取密码输入框
	 */
	public WebElement getPasswordElement() {
		return element(LocatorHandler.getLocator("userpass"));
	}
	
	/*
	 * 获取登录按钮
	 */
	public WebElement getLoginButton() {
		return element(LocatorHandler.getLocator("loginButton"));
	}
	
	/*
	 * 获取自动登录
	 */
	public WebElement getAotoLogin() {
		return element(LocatorHandler.getLocator("Autologin"));
	}
}
