package selenium.practice2.test;


import junit.framework.TestCase;
import selenium.practice2.base.DriverBase;
import selenium.practice2.util.LocatorHandler;

public class CaseBase extends TestCase
{
	protected LocatorHandler locatorHandler = new LocatorHandler();

	public DriverBase InitDriver(String browser) {
		return new DriverBase(browser);
	}
}
