package selenium.practice2.business;

import selenium.practice2.base.DriverBase;
import selenium.practice2.pagehandler.OrderPayPageHandler;

/**
 * 订单支付页处理业务类
 */
public class OrderPayPageManager
{
    public DriverBase driver;
    public OrderPayPageHandler orderPayPageHandler;
    public OrderPayPageManager(DriverBase driver) {
        this.driver = driver;
        orderPayPageHandler = new OrderPayPageHandler(driver);
    }
    /*
     * 根据课程订单判断跳转到支付页面
     */
    public void orderPayPro() {
        String orderName = orderPayPageHandler.getOrderName();
        String courseName = orderPayPageHandler.getOrderCourseName();
        if (orderName!=null && courseName!=null) {
            orderPayPageHandler.clickAlipay();
            orderPayPageHandler.clickPayElement();
        }
    }
}
