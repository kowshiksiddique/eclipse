package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberproject.cucumberproject.Bank;
import junit.framework.Assert;

public class DepositsSteps {
Bank bank;
	@Given("^I have \"([^\"]*)\" amount in my account\\.$")
	public void i_have_amount_in_my_account(String init) throws Throwable {
	int value=Integer.parseInt(init);
		bank=new Bank(value);
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@When("^I deposit \"([^\"]*)\" amount in my existis account\\.$")
	public void i_deposit_amount_in_my_existis_account(String depo) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		int value=Integer.parseInt(depo);
		bank.depost(value);

	}

	@Then("^I except \"([^\"]*)\" amount will have in my account\\.$")
	public void i_except_amount_will_have_in_my_account(String exp) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		int expectedAmount=Integer.parseInt(exp);
		int actualAmount = bank.getBalance();
		Assert.assertEquals(expectedAmount, actualAmount);
		
	}



}
