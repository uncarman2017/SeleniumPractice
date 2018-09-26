package selenium.practice2.test;

import junit.framework.TestCase;
import org.junit.Test;
import selenium.practice2.base.DriverBase;

public class DriverBaseTest extends TestCase
{
    private DriverBase driverBase = new DriverBase("chrome");

    @Override
    public void setUp() throws Exception {

    }

    @Test
    public void testBack(){
        driverBase.back();
    }

    @Test
    public void testStop(){
        driverBase.stop();
    }
}
