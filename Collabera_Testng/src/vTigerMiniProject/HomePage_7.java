package vTigerMiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage_7 {
	
	//constructor
	public HomePage_7(WebDriver driver) {
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
	
	//action methods or business logics or page action
	public void homePageApp(String contactFirstName , String contactLastName) {
		
		ContactsLink.click();
		
		CreateNewContactLink.click();
		
		Select nameSelect=new Select(NameDropDownListBox);
		nameSelect.selectByIndex(1);
		
		FirstNameTextField.sendKeys(contactFirstName);
		
		LastNameTextField.sendKeys(contactLastName);
		
		
	}


}
