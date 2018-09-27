package selenium.practice2.test;


import junit.framework.TestCase;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.junit.Assert;
import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.remote.server.log.LoggingManager;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.practice2.base.DriverBase;
import selenium.practice2.business.LoginPageManager;
import selenium.practice2.util.LocatorHandler;


public class LoginCaseTest extends CaseBase
{
    private DriverBase driver;
    private LoginPageManager loginPageManager;

    private static Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    public LoginCaseTest() {
        logger.info("call InitDriver");
        this.driver = InitDriver("chrome");
        loginPageManager = new LoginPageManager(driver);

    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testGetLogHome() {
        driver.get("https://www.imooc.com");
        driver.findElement(By.id("js-signin-btn")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test(dependsOnMethods = "testGetLogHome")
//    @Test
    public void testLogin() {
		loginPageManager.login("18291857993", "19970505");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /*
     * 下单流程4-8
     */
    @Test(dependsOnMethods={"testLogin"})
    public void testBuyCourse() {
        driver.get("https://coding.imooc.com/class/228.html");
        String courseDetil = driver.findElement(By.className("path")).findElement(By.tagName("span")).getText();
        driver.findElement(By.id("buy-trigger")).click();
        driver.findElement(By.linkText("提交订单")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String orderText = driver.findElement(By.className("order")).getText();
        if(orderText != null) {
            String orderString = driver.findElement(By.className("item")).findElement(By.className("left")).findElement(By.tagName("dt")).getText();
            Assert.assertEquals(orderString, courseDetil,"我们不一样");
        }
    }

    /*
     * 下单流程4-9
     */
    @Test(dependsOnMethods={"testLogin"})
    public void testDownOrder(){
        driver.get("http://coding.imooc.com/class/74.html");
        String currentText = this.buyCourseNow();
        System.out.println("当前的课程信息"+currentText);
        this.sureOrder();
        this.getOrder();
        String orderCourseText = this.getOrderCourse();
        System.out.println("支付页面的课程信息"+orderCourseText);
        if(currentText.equals(orderCourseText)){
            System.out.println("下单成功");
        }
    }

    /*
     * 获取课程信息4-8
     */
    public String getCourseText(WebElement element) {
        return element.getText();
    }

    /*
     * 获取element
     */
    public WebElement getElement(By by) {
        return driver.findElement(by);
    }

    /*
     * 通过父节点获取子节点
     */
    public WebElement getElement(WebElement element, By by) {
        return element.findElement(by);
    }

    /*
     * 立即购买，然后返回课程信息
     */
    public String buyCourseNow() {
        WebElement element = this.getElement(locatorHandler.getLocator("courseInfo"));
        WebElement elementNode = this.getElement(element, locatorHandler.getLocator("courseInfoText"));
        String currentText = this.getCourseText(elementNode);
        this.getElement(locatorHandler.getLocator("buynow")).click();
        return currentText;
    }

    /*
     * 点击确定订单
     */
    public void sureOrder() {
        this.getElement(locatorHandler.getLocator("sureOrder")).click();
    }

    /*
     * 获取订单号
     */
    public String getOrder() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String orderText = this.getCourseText(this.getElement(locatorHandler.getLocator("order")));
        return orderText;
    }

    /*
     *获取支付中心商品信息
     */
    public String getOrderCourse() {
        WebElement element = this.getElement(locatorHandler.getLocator("orderCourse"));
        WebElement elementNode = this.getElement(element, locatorHandler.getLocator("orderCourseNode"));
        return this.getCourseText(elementNode);
    }




}
