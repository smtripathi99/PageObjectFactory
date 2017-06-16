package test.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import test.java.base.PageObject;

public class SiteUpPage extends PageObject {

	public SiteUpPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(className="heading")
	private WebElement heading;

	public boolean SitePageUp() {

		try {
			return waitForElementToAppear(driver,heading).isDisplayed();
		} catch (Exception e) {

			System.out.println(e.getMessage());

		}
		return false;
	}	
}
