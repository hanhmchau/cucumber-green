package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Calculator;
import org.junit.Assert;

public class AbsoluteSteps {

    private Calculator calculator;
    private int result;

    @Given("^I have a calculator$")
    public void iHaveACalculator() throws Throwable {
        calculator = new Calculator();
    }

    @When("^I want to get the absolute value of (-?\\d+)$")
    public void iWantToGetTheAbsoluteValueOf(int number) throws Throwable {
        result = calculator.absolute(number);
    }

    @Then("^I get (\\d+)$")
    public void iGet(int expected) throws Throwable {
        Assert.assertEquals(expected, result);
    }
}
