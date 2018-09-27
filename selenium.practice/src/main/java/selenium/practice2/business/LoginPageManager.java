package selenium.practice2.business;

import selenium.practice2.base.DriverBase;
import selenium.practice2.pagehandler.LoginPageHandler;

/**
 * 登录页处理业务类
 */
public class LoginPageManager {
    public LoginPageHandler loginPageHandler;

    public LoginPageManager(DriverBase driver) {
        // TODO Auto-generated constructor stub
        loginPageHandler = new LoginPageHandler(driver);
    }

    public void login(String userName, String password) {
        if (loginPageHandler.getLoginPage().isDispaly(loginPageHandler.getLoginPage().getUserElement())) {
            loginPageHandler.sendName(userName);
            loginPageHandler.sendPassword(password);
            loginPageHandler.clickAutoLogin();
            loginPageHandler.clickLoginButton();
        }else {
            System.out.println("登录页面不存在");
        }
    }
}
