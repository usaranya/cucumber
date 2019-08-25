package info.stepdef;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import info.Base.Baseadact;
import info.pom.Pomadact;
import info.pom.Pomadact1;
import info.pom.Pomadact2;
import info.pom.Pomadact3;

public class Adactstep extends Baseadact {
	public static WebDriver driver;
	Pomadact p;
	Pomadact1 p1;
	Pomadact2 p2;
	Pomadact3 p3;
	
	@Given("^user launches Adactin url$")
	public void user_launches_adactin_url() throws Throwable {
		driver = getDriver();
		loadUrl("https://adactin.com/HotelApp/");
	}

	@When("^user enter username and password in user text field$")
	public void user_enter_username_and_password_in_user_text_field() throws Throwable {
		p = new Pomadact();
		type(p.getUsername(), "saranyapandi");
		type(p.getPassword(), "sara230");
	}

	@Then("^user click login button$")
	public void user_click_login_button() throws Throwable {
		btnClk(p.getBtn());
	}

	@When("^user select \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" from dropdown$")
	public void user_select_somethingsomethingsomethingsomethingsomethingsomething_from_dropdown(String location,
			String hotels, String roomtype, String numberofrooms, String adultsperroom, String childrenperroom)
			throws Throwable {
		p1 = new Pomadact1();
		type(p1.getLocation(), location);
		type(p1.getHotels(), hotels);
		type(p1.getRoom_type(), roomtype);
		type(p1.getRoom_nos(), numberofrooms);
		type(p1.getAdult_room(), adultsperroom);
		type(p1.getChild_room(), childrenperroom);
	}
	@Then("^user click search button$")
    public void user_click_search_button() throws Throwable {
		btnClk(p1.getSubmit());
	}
	@Then("^user click select button on next page$")
    public void user_click_select_button_on_next_page() throws Throwable {
		p2=new Pomadact2();
        btnClk(p2.getRadiobutton());
    }
	@Then("^click continue button to proceed further$")
    public void click_continue_button_to_proceed_further() throws Throwable {
    	btnClk(p2.getContin()); 
    }	
    @Then("^user enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" in required field$")
    public void user_enter_somethingsomethingsomethingsomethingsomethingsomethingsomethingsomething_in_required_field(String FirstName, String LastName, String Address, String Creditcardnum, String Creditcardtype, String Month, String Year, String CVVNumber,String OrderNo) throws Throwable {
      p3=new Pomadact3();  
      type(p3.getFirstName(),FirstName);
      type(p3.getLastName(),LastName);
      type(p3.getAddress(),Address);
      type(p3.getCreditcardNum(),Creditcardnum);
      type(p3.getCreditcardType(),Creditcardtype);
      type(p3.getMonth(),Month);
      type(p3.getYear(),Year);
      type(p3.getCVVNumber(),CVVNumber);
    }
    @Then("^user click BookNow button$")
    public void user_click_booknow_button() throws Throwable {
    	btnClk(p3.getBookNow());
    }	
}