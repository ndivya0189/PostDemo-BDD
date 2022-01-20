package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostDemo {
	

	@Given("User selects the post request providing the endpoint url")
	public void user_selects_the_post_request_providing_the_endpoint_url() {
	    System.out.println("select post request");
	}

	@When("user adds the record")
	public void user_adds_the_record() {
		System.out.println( "adds the record");
	    
	}
	
	@And("user click on send")
	public void user_click_on_send() {
	    System.out.println("click on send");
	}
	
	@Then("user receives the success message")
	public void user_receives_the_success_message() {
	   System.out.println("receives success message");
	}
	
	@When("user adds the previously deleted record")
	public void user_adds_the_previously_deleted_record() {
	    
	System.out.println("adds the previously deleted record");
	}
	
	@And("click on send")
	public void send()
	{
		System.out.println("click on send");
	}
	
    @Then("user receives the Ok status")
	public void user_receives_the_ok_status() {
	    System.out.println("receive sok status");
	}

    @Given("User select post request providing the endpoint url")
    public void endpoint_url()
    {
    	System.out.println("provide the url");
    }
    
	@When("user add record with the provided programid ")
	public void programid() {
	    System.out.println("user add the record");
	
	    }

	@Given("User select post method to add request")
	public void User_select_post_method_to_add_request() {
	    System.out.println("add request");
	}

	@When("user add a record with the existing programid")
	public void existing_programid() {
	   System.out.println("add a record with existing program id");
	}
	@When("user add a record with alphanumeric programid")
	public void user_add_a_record_with_alphanumeric_programid() {
	    System.out.println("add record with alpha numeric program id");
	}
	
	@And("send the request")
    public void send_the_request()
	{
		System.out.println("send request");
	}
	@Then("user receives the bad request message")
	public void user_receives_the_bad_request_message () {
	    System.out.println("user receives the bad request message");
	}

	@When("user add the record with program name as integer")
	public void user_add_the_record_with_program_name_as_integer() {
	    System.out.println("add record");
	}
     
    @Given("User add the request to select post method")
    public void User_add_the_request_to_select_post_method()
    {
    System.out.println("add request to select post");
    }
    
	@When("user add the record with programid as null")
	public void user_add_the_record_with_programid_as_null() {
	    System.out.println("add the record");
	}

	@When("user add the record with programid as hugenumber")
	public void user_add_the_record_with_programid_as_hugenumber() {
	    System.out.println("add the record");
	}
	@And("Request is sent")
	public void requeste_sent() {
		System.out.println("request sent");
	}

	@When("user add the record in the online field as string")
	public void user_add_the_record_in_the_online_field_as_string() {
	  System.out.println("add the record for online field");
	}

	@When("user do not enter the programn name")
	public void user_do_not_enter_the_programnname() {
	   System.out.println("enter the program name");
	}
	@Then(" user receives internal server error")
	public void internal_server_error()
	{
		
	System.out.println("recieves internal error message");
	}
	@Given("User navigate to the add request to select post method")
	public void navigate_to()
	{
		System.out.println("navigate to add request");
	}
	@When ("user add a record with program description as blank")
	public void record_with_program()
	{
	System.out.println("add record");	
	}
	
	@When("user add a record with the online field  left blank")
	public void add_a_record_with_the_online_field_left_blank() {
	   System.out.println("add record");
	}


	@Then("user receives success message")
	public void user_receives_success_message() {
	   System.out.println("user receives success message");
	}

	
	@When("user add a record with the online field entered with numbers")
	public void user_add_a_record_with_the_online_field_entered_with_numbers() {
	    System.out.println("add a record");
	}
	@Then("user receives the error message")
	public void user_receives_the_error_message() {
	  System.out.println("receives error message");
	}

	@Given("User navigate to add request to select post method")
	public void user_navigate_to_add_request_to_select_post_method() {
		System.out.println("User navigate to add request to select post method");
	}

	@When("user add record with the provided programid")
	public void user_add_record_with_the_provided_programid() {
		System.out.println("user add record with the provided programid");
	}

	@Then("success message is displayed")
	public void success_message_is_displayed() {
		System.out.println("success message is displayed");
	}

	@When("request is sent")
	public void request_is_sent() {
		System.out.println("user receives internal server error");
	}

	@Then("user receives internal server error")
	public void user_receives_internal_server_error() {
		System.out.println("user receives internal server error");
	}

	@Then("user receives bad request message")
	public void user_receives_bad_request_message() {
		System.out.println("user receives bad request message");
	}
}
