package com.learning.cucumberBDD.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://example.com/login");
    }
	@When("the user enters a valid username and password")
	public void the_user_enters_a_valid_username_and_password() {
	        // Code to enter username and password
	}
    @When("clicks the login button")
    public void clicks_the_login_button() {
            // Code to click the login button
    }

    @Then("the user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {
            // Code to verify redirection to dashboard
            driver.quit();
    }
}

