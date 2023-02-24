package com.josdem.selenium.cucumber.steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertTrue;

public class JosdemStep {

  @Given("^Open josdem website$")
  public void launchWebsite() {
    System.setProperty("webdriver.chrome.driver", "/home/josdem/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://josdem.io");
    driver.manage().window().maximize();
    assertTrue(driver.getTitle().equals("josdem"));
    driver.close();
  }
}
