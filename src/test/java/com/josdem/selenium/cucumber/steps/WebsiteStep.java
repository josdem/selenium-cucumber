package com.josdem.selenium.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.testng.Assert.assertTrue;

public class WebsiteStep {

  private WebDriver driver;
  private String title;

  public WebsiteStep() {
    System.setProperty("webdriver.http.factory", "jdk-http-client");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver(options);
  }

  @Given("^Website as \"(.*)\"$")
  public void loadingWebsite(String website) {
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
