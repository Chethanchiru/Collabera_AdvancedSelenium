package vTigerMiniProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage_37 {

	//constructor
		public HomePage_37(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		//Data members or attributes
		@FindBy(name="firstname")
		private WebElement FirstNameTextField; 

		@FindBy(name="lastname") 
		private WebElement LastNameTextField;

		@FindBy(xpath="//a[text()='Contacts']")
		private WebElement ContactsLink;

		@FindBy(xpath="//a[text()='Create Mail Merge templates ']")
		private WebElement CreateMailMergeLink;

		@FindBy(name="target_module") 
		private WebElement ModuleDropDownList;

		@FindBy(xpath="//input[@title='Save']")
		private WebElement SaveButton;

		@FindBy(xpath="(//td[@class='small'])[2]")
		private WebElement AdminstratorButton;

		@FindBy(xpath="//a[text()='Sign Out']")
		private WebElement SignOutLink;

		//getters methods

		public WebElement getFirstNameTextField() {
			return FirstNameTextField;
		}

		public WebElement getLastNameTextField() {
			return LastNameTextField;
		}

		public WebElement getContactsLink() {
			return ContactsLink;
		}

		public WebElement getCreateMailMergeLink() {
			return CreateMailMergeLink;
		}

		public WebElement getModuleDropDownList() {
			return ModuleDropDownList;
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
		public void homePageApp( WebDriver driver ) {

			ContactsLink.click();

			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false);", CreateMailMergeLink);

			CreateMailMergeLink.click();
			
			Select moduleSelect=new Select(ModuleDropDownList);
			moduleSelect.selectByVisibleText("Contacts");

			SaveButton.click();
			
			Alert alertPopup= driver.switchTo().alert();
			System.out.println(alertPopup.getText());
			alertPopup.accept();

			Actions action=new Actions(driver);
			action.moveToElement(AdminstratorButton).perform();

			SignOutLink.click();

		}
}
