package selenium.practice2.business;

import selenium.practice2.base.DriverBase;
import selenium.practice2.pagehandler.CoursePageHandler;

/**
 * 课程页处理业务类
 */
public class CoursePageManager
{
    public DriverBase driver;
    public CoursePageHandler coursePageHandler;

    public CoursePageManager(DriverBase driver) {
        this.driver = driver;
        coursePageHandler = new CoursePageHandler(driver);
    }

    /*
     * 添加购物车
     */
    public void addCart() {
        int beforeNum = 0;
        int afterNum = 0;
        String aftercourseNum;
        String courseNum = coursePageHandler.getShopCartNum();
        try {
            beforeNum = Integer.valueOf(courseNum);
        }catch (Exception e) {
            // TODO: handle exception
            beforeNum = 0;
        }
        coursePageHandler.clickAddCart();

        try {
            driver.switchToMode();
        }catch (Exception e) {
            // TODO: handle exception
        }

        coursePageHandler.clickBuyNow();
        aftercourseNum = coursePageHandler.getShopCartNum();
        try {
            afterNum = Integer.valueOf(aftercourseNum);
        }catch (Exception e) {
            // TODO: handle exception
            afterNum = beforeNum;
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (afterNum == beforeNum + 1) {
            System.out.println("添加购物车成功");
            coursePageHandler.clickAddCart();
        }else if (afterNum>0) {
            coursePageHandler.clickAddCart();
        }
    }

    /*
     * 点击立即购买
     */
    public void buyNow() {
        // TODO Auto-generated method stub
        coursePageHandler.clickBuyNow();
    }
}
