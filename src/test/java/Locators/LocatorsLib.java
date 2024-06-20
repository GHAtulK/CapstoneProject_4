package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorsLib {

	@FindBy(linkText = "A/B Testing")
	private WebElement abTestLink;

	public void abTestLinkBtn() {
		abTestLink.click();
	}

	@FindBy(xpath = "//h3[contains(text(),'A/B Test Variation 1')]")
	private WebElement abText;

	public WebElement getabText() {
		return abText;
	}

	@FindBy(linkText = "Dropdown")
	private WebElement dropdownLink;

	public void dropdownLinkBtn() {
		dropdownLink.click();
	}

	@FindBy(xpath = "//select[@id='dropdown']")
	private WebElement dropdownElement;

	public WebElement getdropdownElements() {
		return dropdownElement;
	}

	@FindBy(linkText = "Frames")
	private WebElement framesLink;

	public void framesLinkBtn() {
		framesLink.click();
	}

	@FindBy(linkText = "Nested Frames")
	private WebElement nestedframesLink;

	public WebElement getNestedFramesLink() {
		return nestedframesLink;
	}

	@FindBy(linkText = "iFrame")
	private WebElement iframesLink;

	public WebElement getiFramesLink() {
		return iframesLink;
	}

	public LocatorsLib(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
