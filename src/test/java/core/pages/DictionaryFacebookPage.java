package core.pages;


import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class DictionaryFacebookPage extends PageObject{
	
	@FindBy(xpath="//input[@type='text' and @name='email']")
    private WebElementFacade emailField;

    @FindBy(xpath="//input[@type='password' and @name='pass']")
    private WebElementFacade passField;
    
    @FindBy(xpath="//span[text()='Publicar en Facebook']")
    private WebElementFacade postButton;
  
    
    public void writeYourEmail(String email) {
    	emailField.type(email);
    }
    
    public void writeYourPassword(String pass) {
    	passField.type(pass.concat("\n"));
    }

    public void postOnFacebook() {
    	postButton.click();
    }
}
