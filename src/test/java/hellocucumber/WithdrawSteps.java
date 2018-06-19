package hellocucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Account;

import static org.junit.Assert.assertEquals;

// Testers still write me...

public class WithdrawSteps {

    private Account account;
    private boolean result;

    @Given("^I have an account$")
    public void iHaveAnAccount() throws Throwable {
        account = new Account();
    }

    @Given("^I have (\\d+) USD in my account$")
    public void iHaveUSDInMyAccount(int initialAmount) throws Throwable {
        account.setBalance(initialAmount);
    }

    @When("^I withdraw (\\d+) USD$")
    public void iWithdrawUSD(int withdrawAmount) throws Throwable {
        result = account.withdraw(withdrawAmount);
    }

    @Then("^I get told \"([^\"]*)\"$")
    public void iGetTold(String supposedMessage) throws Throwable {
        String message = result ? "Okay!" : "No!";
        assertEquals(message, supposedMessage);
    }

    @And("^My account has (\\d+) USD$")
    public void myAccountHasUSD(int remaining) throws Throwable {
        // change to Pending status here by
//        throw new PendingException();

        // change to Failed status here by
//         assertEquals(account.getBalance(), remaining * 2);

        // Success status currently
        assertEquals(account.getBalance(), remaining);
    }
}
