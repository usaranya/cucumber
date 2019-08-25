package info.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import info.Base.Baseadact;

public class Pomadact3 extends Baseadact {
	public Pomadact3() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "first_name")
	private WebElement FirstName;
	@FindBy(id = "last_name")
	private WebElement LastName;
	@FindBy(id = "address")
	private WebElement Address;
	@FindBy(id = "cc_num")
	private WebElement CreditcardNum;
	@FindBy(id = "cc_type")
	private WebElement CreditcardType;
	@FindBy(id = "cc_exp_month")
	private WebElement Month;
	@FindBy(id = "cc_exp_year")
	private WebElement Year;
	@FindBy(id = "cc_cvv")
	private WebElement CVVNumber;
	@FindBy(id = "book_now")
	private WebElement BookNow;
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getCreditcardNum() {
		return CreditcardNum;
	}
	public WebElement getCreditcardType() {
		return CreditcardType;
	}
	public WebElement getMonth() {
		return Month;
	}
	public WebElement getYear() {
		return Year;
	}
	public WebElement getCVVNumber() {
		return CVVNumber;
	}
	public WebElement getBookNow() {
		return BookNow;
	}

}
