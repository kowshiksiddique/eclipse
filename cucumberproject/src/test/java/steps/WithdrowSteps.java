package steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberproject.cucumberproject.Bank;


public class WithdrowSteps {
	Bank bank;
	@Given("^I have \"([^\"]*)\" amount in a account\\.$")
	public void i_have_amount_in_a_account(String init) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		int value=Integer.parseInt(init);
		bank=new Bank(value);
	}

	@When("^I withdrow \"([^\"]*)\" amount in  existis account\\.$")
	public void i_withdrow_amount_in_existis_account(String witd) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		int value=Integer.parseInt(witd);
		bank.withdrow(value);
	}

	@Then("^I except \"([^\"]*)\" amount will have in the account\\.$")
	public void i_except_amount_will_have_in_the_account(String exp) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		int expectedAmount=Integer.parseInt(exp);
		int actualAmount = bank.getBalance();
		Assert.assertEquals(expectedAmount, actualAmount);
	}
}
