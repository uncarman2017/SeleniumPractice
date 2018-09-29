package selenium.practice3.test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestCase;
import com.thoughtworks.selenium.Selenium;
//import org.testng.annotations.Test;
import org.junit.Test;


public class RCTest2 extends SeleneseTestCase {

    private Selenium selenium;

    @Override
    public void setUp() throws Exception {
//        selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.google.com");
        setUp("http://www.google.com/", "*chrome");

    }

    @Test
    public void test2(){
        System.out.println("aaaa");
    }

    @Test
    public void test3()  {
//        selenium.open("/");
//        selenium.type("q", "selenium rc");
//        selenium.click("btnG");
//        selenium.waitForPageToLoad("30000");
//        assertTrue(selenium.isTextPresent("Result * for selenium rc"));
        System.out.println("test1");

    }

}
