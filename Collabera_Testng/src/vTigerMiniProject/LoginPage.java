package vTigerMiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {
	
	//Constructor
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		//Data members or properties
		@FindBy(name="user_name")
		private WebElement usernameTextField;
		
		@FindBy(name="user_password")
		private WebElement passwordTextField;
		
		@FindBy(id="submitButton")
		private WebElement loginButton;

		
		//getters methods

		public WebElement getUsernameTextField() {
			return usernameTextField;
		}

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}

		//action methods or business logics or page action
		@Test
		public void LoginToApp( String username, String password ) {
			usernameTextField.sendKeys(username);
			passwordTextField.sendKeys(password);
			loginButton.click();
		}

}
