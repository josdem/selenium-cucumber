package com.josdem.selenium.cucumber.steps;

import com.josdem.selenium.cucumber.BaseStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class WebsiteStep extends BaseStep {

  private WebDriver driver;
  private String title;

  @Given("^Website as \"(.*)\"$")
  public void loadingWebsite(String website) {
    driver = getDriver();
    driver.get(website);
  }

  @When("^I get title$")
  public void getTitle() {
    driver.manage().window().maximize();
    title = driver.getTitle();
  }

  @Then("^I validate is \"(.*)\"$")
  public void validateTitle(String name) {
    assertTrue(title.equals(name));
    driver.close();
  }
}
