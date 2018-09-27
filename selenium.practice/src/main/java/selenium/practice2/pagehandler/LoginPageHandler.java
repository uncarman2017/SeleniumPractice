package selenium.practice2.pagehandler;

import selenium.practice2.base.DriverBase;
import selenium.practice2.page.LoginPage;

/**
 * 登录页处理器
 */
public class LoginPageHandler {
    private DriverBase driver;
    private LoginPage loginPage;

    public LoginPageHandler(DriverBase driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    /*
     * 输入用户名
     */
    public void sendName(String username) {
        loginPage.sendkeys(loginPage.getUserElement(), username);
    }

    /*
     * 输入密码
     */
    public void sendPassword(String password) {
        loginPage.sendkeys(loginPage.getPasswordElement(), password);
    }

    /*
     * 点击登录
     */
    public void clickLoginButton() {
        loginPage.click(loginPage.getLoginButton());
    }

    /*
     * 点击自动登录
     */
    public void clickAutoLogin() {
        loginPage.click(loginPage.getAotoLogin());
    }


}
