package selenium.practice2.pagehandler;

import org.openqa.selenium.WebElement;
import selenium.practice2.base.DriverBase;
import selenium.practice2.page.CoursePage;

/**
 * 课程页处理器
 */
public class CoursePageHandler
{
    public DriverBase driver;
    public CoursePage coursePage;
    public CoursePageHandler(DriverBase driver) {
        this.driver = driver;
        coursePage = new CoursePage(driver);
    }

    /*
     * 点击立即购买按钮
     */
    public void clickBuyNow() {
        coursePage.click(coursePage.getBuyTriggerElement());
    }

    /*
     * 点击添加购物车按钮
     */
    public void clickAddCart() {
        coursePage.click(coursePage.getAddCartElement());
    }

    /*
     * 点击右上角购物车
     */
    public void clickShopCart() {
        coursePage.click(coursePage.getShopCartElement());
    }

    /*
     * 获取购物车数量
     */
    public String getShopCartNum() {
        WebElement element = coursePage.getShopCartNumElement();
        return coursePage.getText(element);
    }

    /*
     * 获取课程名称
     */
    public String getCourseName() {
        WebElement element = coursePage.getCourseNameElement();
        return coursePage.getText(element);
    }

    /*
     * 去结算
     */
    public void clickGoPay() {
        coursePage.click(coursePage.getGoPayElement());
    }

    /*
     * 点击弹窗的确定按钮
     */
    public void clickReadyBuy() {
        coursePage.click(coursePage.getReadyBuy());
    }

}
