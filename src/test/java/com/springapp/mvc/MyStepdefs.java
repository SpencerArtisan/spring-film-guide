package com.springapp.mvc;

import com.springapp.mvc.BrowserDriver;
import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;

import static org.junit.Assert.*;

public class MyStepdefs {
    @Then("^I see the film \"([^\"]*)\"$")
    public void I_see_the_film(String film) throws Throwable {
        assertTrue("Film not on page", BrowserDriver.pageContains(film));
    }

    @Given("^I am on the home page$")
    public void I_am_on_the_home_page() throws Throwable {
        BrowserDriver.loadPage("http://localhost:8080");
    }

    @Then("^I see the rating ([^\"]*)$")
    public void I_see_the_rating_(String rating) throws Throwable {
        assertTrue("Rating " + rating + " not on page", BrowserDriver.pageContains(rating));
    }

    @When("^I enter the film name \"([^\"]*)\"$")
    public void I_enter_the_film_name(String film) throws Throwable {
        BrowserDriver.setValueByName("title", film);
    }

    @And("^Press \"([^\"]*)\"$")
    public void Press(String buttonLabel) throws Throwable {
        BrowserDriver.click(buttonLabel);
        Thread.sleep(3000);
    }
}
