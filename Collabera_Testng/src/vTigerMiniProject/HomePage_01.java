package vTigerMiniProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage_01 {
	
	//constructor
			public HomePage_01(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
			//Data members or attributes
			@FindBy(xpath="//a[text()='Contacts']")
			private WebElement ContactsLink;
			
			@FindBy(xpath="//img[@alt=\"Create Contact...\"]")
			private WebElement CreateNewContactLink;
			
			@FindBy(xpath="//input[@accesskey='S' and @class='crmButton small save']")
			private WebElement SaveButton;

			@FindBy(xpath="(//td[@class='small'])[2]")
			private WebElement AdminstratorButton;

			@FindBy(xpath="//a[text()='Sign Out']")
			private WebElement SignOutLink;

			//getters methods
			public WebElement getContactsLink() {
				return ContactsLink;
			}

			public WebElement getCreateNewContactLink() {
				return CreateNewContactLink;
			}

			public WebElement getSaveButton() {
				return SaveButton;
			}
			
			public WebElement getAdminstratorButton() {
				return AdminstratorButton;
			}

			public WebElement getSignOutLink() {
				return SignOutLink;
			}

			
			//action methods or business logics or page action
			public void homePageApp(WebDriver driver) {
				
				ContactsLink.click();
				
				CreateNewContactLink.click();
				
				SaveButton.click();
				
				Alert alertPopup= driver.switchTo().alert();
				System.out.println(alertPopup.getText());
				alertPopup.accept();
				
				AdminstratorButton.click();

				SignOutLink.click();
	
			}
}
