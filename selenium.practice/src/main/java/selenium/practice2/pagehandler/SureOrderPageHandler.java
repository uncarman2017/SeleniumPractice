package selenium.practice2.pagehandler;

import selenium.practice2.base.DriverBase;
import selenium.practice2.page.SureOrderPage;

/**
 * 订单确认页处理器
 */
public class SureOrderPageHandler
{
    private SureOrderPage sureOrderPage;
    public DriverBase driver;
    public SureOrderPageHandler(DriverBase driver) {

        this.driver = driver;
        sureOrderPage = new SureOrderPage(driver);
    }

    /*
     * 点击确认订单按钮
     */
    public void clickSubOrderElement() {
        sureOrderPage.click(sureOrderPage.getSubOrderElement());
    }
}
