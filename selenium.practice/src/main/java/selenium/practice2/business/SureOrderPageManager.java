package selenium.practice2.business;

import selenium.practice2.base.DriverBase;
import selenium.practice2.pagehandler.SureOrderPageHandler;

/**
 * 订单确认页处理业务类
 */
public class SureOrderPageManager
{
    public SureOrderPageHandler sureOrderPageHandler;
    public DriverBase driver;
    public SureOrderPageManager(DriverBase driver) {
        this.driver = driver;
        sureOrderPageHandler = new SureOrderPageHandler(driver);
    }

    /*
     * 确认订单按钮
     */
    public void sureOrder() {
        sureOrderPageHandler.clickSubOrderElement();
    }

}
