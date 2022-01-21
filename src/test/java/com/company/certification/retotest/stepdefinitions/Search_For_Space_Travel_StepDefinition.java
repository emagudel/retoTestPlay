package com.company.certification.retotest.stepdefinitions;

import com.company.certification.retotest.exceptions.ExpectedResultErr;
import com.company.certification.retotest.questions.VerifyExpectedResult;
import com.company.certification.retotest.questions.VerifyExpectedResultAlternate;
import com.company.certification.retotest.tasks.ClearFiles;
import com.company.certification.retotest.tasks.CustomizeYourTrip;
import com.company.certification.retotest.tasks.DestinationNext;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static com.company.certification.retotest.exceptions.ExpectedResultErr.EXPECTED_RESULT;
import static com.company.certification.retotest.tasks.LoadData.loadDataTestWithTheFollowing;
import static com.company.certification.retotest.tasks.OpenBrowser.thePageSite;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Search_For_Space_Travel_StepDefinition {

    @Before(order = 1)
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Before(order = 2)
    public void clearFiles() {
        Actor customer = Actor.named("customerName");
        customer.attemptsTo(ClearFiles.inTheAplication());
    }

    @Given("^(.*) visit the test page$")
    public void i_visit_the_test_page(String actorName) {
        theActorCalled(actorName).wasAbleTo(thePageSite());
    }


    @When("^(.*) search in the application for a value with this information of traveler$")
    public void i_search_in_the_application_for_a_value_with_this_information(String actorName, List<Map<String, Object>> information) {
        theActorCalled(actorName).wasAbleTo(loadDataTestWithTheFollowing(information));
        theActorInTheSpotlight().attemptsTo(CustomizeYourTrip.inTheAplication());
        theActorInTheSpotlight().attemptsTo(DestinationNext.inTheAplication());
    }



    @Then("^I verify the information required for the successful case$")
    public void i_verify_the_required_information() {
        theActorInTheSpotlight().should(
                seeThat(VerifyExpectedResult.inAplication())
                        .orComplainWith(ExpectedResultErr.class, EXPECTED_RESULT));
    }

    @Then("^I verify the information required for the alternate case$")
    public void i_verify_the_required_information_alternate() {
        theActorInTheSpotlight().should(
                seeThat(VerifyExpectedResultAlternate.inAplication())
                        .orComplainWith(ExpectedResultErr.class, EXPECTED_RESULT));
    }

}
