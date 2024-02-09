package com.josdem.selenium.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseStep {

  private static WebDriver driver;

  public static WebDriver getDriver() {
    if (driver == null) {
      ChromeOptions options = new ChromeOptions();
      System.setProperty("webdriver.http.factory", "jdk-http-client");
      options.addArguments("--remote-allow-origins=*");
      driver = new ChromeDriver(options);
    }
    return driver;
  }
}
