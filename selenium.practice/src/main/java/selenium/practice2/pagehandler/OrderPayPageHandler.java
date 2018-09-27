package selenium.practice2.pagehandler;

import selenium.practice2.base.DriverBase;
import selenium.practice2.page.OrderPayPage;

/**
 * 订单支付页处理器
 */
public class OrderPayPageHandler {
    private DriverBase driver;
    public OrderPayPage orderPayPage;

    public OrderPayPageHandler(DriverBase driver) {
        this.driver = driver;
        orderPayPage = new OrderPayPage(driver);
    }
    /*
     * 获取订单文字
     */
    public String getOrderName() {
        return orderPayPage.getText(orderPayPage.getOrderNumElement());
    }
    /*
     * 获取课程名称
     */
    public String getOrderCourseName() {
        return orderPayPage.getText(orderPayPage.getOrderCourseNameElement());
    }
    /*
     * 点击支付包支付
     */
    public void clickAlipay() {
        orderPayPage.click(orderPayPage.getAliPayElement());
    }
    /*
     * 点击立即支付
     */
    public void clickPayElement() {
        orderPayPage.click(orderPayPage.getOrderPayElement());
    }
}

