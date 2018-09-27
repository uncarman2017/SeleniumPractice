package selenium.practice2.page;


import org.openqa.selenium.WebElement;
import selenium.practice2.base.DriverBase;
import selenium.practice2.util.LocatorHandler;

/**
 * 课程访问页面
 */
public class CoursePage extends BasePage {
    public CoursePage(DriverBase driver) {
        // TODO Auto-generated constructor stub
        super(driver);
    }

    /*
     * 获取立即购买按钮element
     */
    public WebElement getBuyTriggerElement() {
        return element(LocatorHandler.getLocator("buynow"));
    }

    /*
     * 获取添加购物车element
     */
    public WebElement getAddCartElement() {
        return element(LocatorHandler.getLocator("addCart"));
    }

    /*
     * 获取右上角购物车element
     */
    public WebElement getShopCartElement() {
        return element(LocatorHandler.getLocator("shopCart"));
    }

    /*
     * 获取购物车数量element
     */
    public WebElement getShopCartNumElement() {
        return element(LocatorHandler.getLocator("cartNum"));
    }

    /*
     * 获取课程详情的课程名称
     */
    public WebElement getCourseNameElement() {
        return nodeElement(LocatorHandler.getLocator("courseInfo"), LocatorHandler.getLocator("courseInfoText"));
    }

    /*
     * 获取课程详情的课程名称
     */
    public WebElement getGoPayElement() {
        return nodeElement(LocatorHandler.getLocator("shopgopay"), LocatorHandler.getLocator("shopgopayNode"));
    }

    /*
     * 获取课程详情的课程名称
     */
    public WebElement getReadyBuy() {
        return nodeElement(LocatorHandler.getLocator("readybuySure"), LocatorHandler.getLocator("readybuySureNode"));
    }

}
