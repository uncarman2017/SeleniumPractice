package selenium.practice1.test;

import junit.framework.TestCase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class ActionSeleniumTest extends TestCase {
    private WebDriver driver;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        //设置系统属性
        System.setProperty("webdriver.chrome.driver", "D:\\.m2\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.imooc.com");
//		driver.manage().window().maximize();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void testCheckBox() {
        try {
            WebElement check = driver.findElement(By.id("auto-signin"));
            System.out.println("是否选中" + check.isSelected());
            System.out.println("是否有效" + check.isEnabled());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void testInputBox() {
        driver.get("https://www.imooc.com/user/newlogin");
        driver.findElement(By.name("email")).sendKeys("18291857993");

        driver.findElement(By.name("email")).clear();
        String s = driver.findElement(By.name("email")).getAttribute("placeholder");
        System.out.println(s);
        driver.findElement(By.name("email")).sendKeys("18291857993");
        driver.findElement(By.name("password")).sendKeys("19970505");
        driver.findElement(By.className("moco-btn-lg")).click();
        sleep(2000);
    }

    @Test
    public void testRadioBox() {
        driver.get("https://www.imooc.com/user/setprofile");
        driver.findElement(By.className("pull-right")).click();
        driver.findElement(By.xpath("//*[@id=\"profile\"]/div[4]/div/label[2]/input")).click();
        //定位到三个label的父标签
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"profile\"]/div[4]/div/label//input"));
        System.out.println(elements.size());
        sleep(2000);
        for (WebElement radio : elements) {
            boolean flag = radio.isSelected();
            if (flag == false) {
                radio.click();
                break;
            } else {
                System.out.println(radio + "选中了");
            }
        }
    }

    /**
     * *按钮
     **/
    @Test
    public void testButton() {
        WebElement login = driver.findElement(By.className("moco-btn"));
        System.out.println(login.isEnabled());
        System.out.println(login.getAttribute("value"));
        login.click();
        sleep(2000);
    }


    /**
     * 上传文件
     */
    @Test
    public void testUpHeader() {
        driver.get("https://www.imooc.com/user/setbindsns");
        // 修改头像按钮是不可见的，怎么处理
        sleep(2000);

        String jsString = "document.getElementsByClassName('update-avator')[0].style.bottom='0'";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(jsString);
        sleep(2000);
        driver.findElement(By.className("js-avator-link")).click();
        driver.findElement(By.id("upload")).sendKeys("C:\\Users\\ThinkPad\\Pictures\\yujiawei.jpg");
    }


    @Test
    public void testDownSelectBox() {
        driver.get("https://www.imooc.com/user/setprofile");
        driver.findElement(By.className("pull-right")).click();
        sleep(2000);
        WebElement formElement = driver.findElement(By.id("profile"));
        WebElement job = formElement.findElement(By.id("job"));
        Select downlist = new Select(job);
        downlist.selectByValue("8");
//		downlist.deselectByValue("8");
        //拿到的是select option
        System.out.println(downlist.getAllSelectedOptions());
        System.out.println(downlist.getFirstSelectedOption().getText());
    }

    /**
     * *封装sleep
     **/
    private void sleep(int sleeptime) {
        try {
            Thread.sleep(sleeptime);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
