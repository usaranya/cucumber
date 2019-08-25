package info.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.Base.Baseadact;

public class Pomadact extends Baseadact {

	public Pomadact() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement btn;
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getBtn() {
		return btn;
	}	
}


		
		