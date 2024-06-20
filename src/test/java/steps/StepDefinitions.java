package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import Locators.LocatorsLib;
import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends BaseClass {

	LocatorsLib loc = new LocatorsLib(driver);

	@Given("User is on the home page - Scenario one")
	public void user_is_on_the_home_page_scenario_one() {
		Reporter.log("Scenario 1");

	}

	@When("User verifies the title of the page")
	public void user_verifies_the_title_of_the_page() {
		Reporter.log("User is on the homepage");
	}

	@Then("Title should be {string}")
	public void title_should_be(String expectedText) {
		String actualText = driver.getTitle();
		Reporter.log("The actual title is " + actualText);
		Reporter.log("The expected title is " + expectedText);
		Assert.assertNotEquals(actualText, expectedText, "The actual and expected page title are equal");
	}

	@Given("User is on the home page - Scenario two")
	public void user_is_on_the_home_page_scenario_two() {
		Reporter.log("Scenario 2");
	}

	@When("User Clicks on AB Testing link")
	public void user_clicks_on_a_b_testing_link() {
		loc.abTestLinkBtn();
	}

	@Then("Text on the page should be {string}")
	public void text_on_the_page_should_be(String expectedText) {
		String actualText = loc.getabText().getText();
		Reporter.log("The actual displayed text is " + actualText);
		Reporter.log("The actual displayed text is " + expectedText);
		Assert.assertEquals(actualText, expectedText, "The actual and expected text are equal");

	}

	@Given("User is on the home page - Scenario three")
	public void user_is_on_the_home_page_scenario_three() {
		Reporter.log("Scenario 3");
	}

	@When("User clicks on dropdown link and selects Option1")
	public void user_clicks_on_dropdown_link_and_selects_option1() {
		loc.abTestLinkBtn();
		driver.navigate().back();
		loc.dropdownLinkBtn();

	}

	@Then("Option1 should be selected")
	public void option1_should_be_selected() {
		Select dropdownOptions = new Select(loc.getdropdownElements());
		dropdownOptions.selectByVisibleText("Option1");
		WebElement selectedOption = dropdownOptions.getFirstSelectedOption();
		String selectedText = selectedOption.getText();
		String expectedText = "Option 1";
		Assert.assertEquals(selectedText, expectedText, "Selected option is as expected");

	}

	@Given("User is on the home page - Scenario four")
	public void user_is_on_the_home_page_scenario_four() {
		Reporter.log("Scenario 4");
	}

	@When("User clicks on Frames link")
	public void user_clicks_on_frames_link() {
		loc.abTestLinkBtn();
		driver.navigate().back();
		loc.framesLinkBtn();
	}

	@Then("Nested Frames and iFrame links should be present")
	public void nested_frames_and_i_frame_links_should_be_present() {
		Assert.assertTrue(loc.getNestedFramesLink().isDisplayed());
		Assert.assertTrue(loc.getiFramesLink().isDisplayed());

	}

}
