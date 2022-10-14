package com.saucedemo.test.Stepdefinitions;

import com.saucedemo.com.interactions.OpenBrowser;
import com.saucedemo.com.ui.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepLogin {

    @Managed
    private WebDriver driver;

    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Diego").can(BrowseTheWeb.with(driver));

    }

    @Given("^i am training in saucedemo$")
    public void iAmTrainingInSaucedemo() {
        theActorInTheSpotlight().attemptsTo(OpenBrowser.on(HomePage.urlhome));

    }

    @When("^login is don$")
    public void loginIsDon() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^you must allow access to the page$")
    public void youMustAllowAccessToThePage() {
        // Write code here that turns the phrase above into concrete actions

    }
}
