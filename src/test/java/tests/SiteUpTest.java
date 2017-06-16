package test.java.tests;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import test.java.base.Base;
import test.java.pages.SiteUpPage;
import test.java.util.Log;

public class SiteUpTest extends Base {

	@BeforeClass
	public void setUp() throws Exception {
		launchUrl();
	}

	@Test(priority = 1)
	public void siteUp() throws Exception {
		DOMConfigurator.configure("src/test/resources/log4j.xml");
		Log.startTestCase("Is Site Up Test Started");
		SiteUpPage sitePage=new SiteUpPage(driver);
		boolean isSiteUp = sitePage.SitePageUp();
		Assert.assertTrue(isSiteUp, "Site is up");
		getScreenShot("SiteUpTest", "siteup");
	}

		
	@AfterClass
	public void teardown() throws InterruptedException {

		driver.close();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
	}
}
