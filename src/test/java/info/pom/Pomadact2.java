package info.pom;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import info.Base.Baseadact;

		public class Pomadact2 extends Baseadact {

			public Pomadact2() {
				PageFactory.initElements(driver, this);
			}
			@FindBy(id="radiobutton_0")
			private WebElement radiobutton;
			@FindBy(id="continue")
			private WebElement contin;
			public WebElement getRadiobutton() {
				return radiobutton;
			}
			public WebElement getContin() {
				return contin;
			}	
}
