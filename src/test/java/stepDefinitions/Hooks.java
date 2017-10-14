package stepDefinitions;

import core.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void setUp() {

		BaseClass.openBrowser();

	}

	@After
	public void tearDown() {

		if (!BaseClass.getDriver().equals(null)) {
			BaseClass.getDriver().quit();
		}
	}

}
