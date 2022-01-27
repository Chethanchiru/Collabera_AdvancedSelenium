package vTigerMiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage_8 {

	//constructor
	public HomePage_8(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Data members or attributes
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement ContactsLink;

	@FindBy(xpath="//img[@alt=\"Create Contact...\"]")
	private WebElement CreateNewContactLink;

	@FindBy(xpath="//select[@name='salutationtype']")
	private WebElement NameDropDownListBox;

	@FindBy(name="firstname")
	private WebElement FirstNameTextField;

	@FindBy(name="lastname") 
	private WebElement LastNameTextField;

	@FindBy(xpath="//select[@name='leadsource']")
	private WebElement LeadSourceDropDownListBox;

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

	public WebElement getNameDropDownListBox() {
		return NameDropDownListBox;
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getLeadSourceDropDownListBox() {
		return LeadSourceDropDownListBox;
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
	public void homePageApp(String contactFirstName, String contactLastName, WebDriver driver ) {

		ContactsLink.click();

		CreateNewContactLink.click();

		Select nameSelect=new Select(NameDropDownListBox);
		nameSelect.selectByIndex(1);

		FirstNameTextField.sendKeys(contactFirstName);

		LastNameTextField.sendKeys(contactLastName);

		Select LeadSourceSelect=new Select(LeadSourceDropDownListBox);
		LeadSourceSelect.selectByIndex(4);

		SaveButton.click();

		Actions action=new Actions(driver);
			//******************moveToElement(WebElement ele)************************
			action.moveToElement(AdminstratorButton).perform();

		//AdminstratorButton.click();

		SignOutLink.click();

	}

}
