package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalInfo {
	
	@FindBy(id="lblPolicyHolderName")
	public WebElement text_PolicyHolderName;

	@FindBy(id="lblPolicyNumberValue")
	public WebElement text_PolicyNumber;
	
	@FindBy(id="lblEffectiveUntilValue")
	public WebElement text_PolicyExpirationDate;
	
	@FindBy(xpath="//*[@name='emailForm']//button")
	public WebElement btn_Email;
	
	@FindBy(id="txtUserName")
	public WebElement textbox_NewEmail;
	
	@FindBy(id="txtPassword")
	public WebElement textbox_CurrentPassword;
	
	@FindBy(xpath="//*[@id='btnSaveUserEmail']/span")
	public WebElement btn_SaveEmail;
	
	@FindBy(id="btnCancelEmailUsername")
	public WebElement btn_CancelUpdateEmail;
	
	@FindBy(xpath="//*[@name='mailingInfoForm']//button")
	public WebElement btn_MailingAddress;
	
	@FindBy(id="txtApt")
	public WebElement textbox_Apt;
	
	@FindBy(id="txtCity")
	public WebElement textbox_City;
	
	@FindBy(xpath ="//mat-select[contains(@id,'state')]")
	public WebElement dropdown__State;
	
	public String stateselect = "//mat-option//span[contains(text(),'{0}')]";
	
	@FindBy(id="txtPostalCode")
	public WebElement textbox_PostalCode;
	
	public String btn_ParkVehicleAtAddress = "//*[@id='mailingIsBoth-{0}']/ancestor::div/label";
	//{0} -> true or false
	
	public String btn_VehicleAtMailAdd = "//*[@id='mailingIsGaragedLocation-{0}']/ancestor::div/label";
	//{0} -> true or false	
		
	
	@FindBy(xpath = "//mat-select[contains(@id,'yearSelected')]")
	public WebElement dropdown_YearMovedToResidence;
	
	public String yearselect = "//mat-option//span[contains(text(),'{0}')]";
	
	@FindBy(xpath="//mat-select[contains(@id,'monthSelected')]")
	public WebElement dropdown_MonthMovedToResidence;
	
	public String monthselect = "//mat-option//span[contains(text(),'{0}')]";
	
	@FindBy(xpath="//mat-select[contains(@id,'dropdownResidencyStatus')]")
	public WebElement dropdown_ResidencyStatus;
	
	public String ResidencyStatusSelect = "//mat-option//span[contains(text(),'{0}')]"
;	
	@FindBy(id="btnContinueMailAddress")
	public WebElement btn_ContinueMailAdd;
	
	@FindBy(id="btnCancelmailInfo")
	public WebElement btn_CancelUpdateMailAdd;
	
	@FindBy(xpath="//*[@name='garagingForm']//button")
	public WebElement btn_GaragingAddress;
	
	public String btn_IsThisMailingAddress = "//input[@id='garagingIsBoth-{0}']/../label";
		
	public String btn_VehicleAtGaragAdd = "//input[@id='garagingIsGaragedLocation-{0}']/../label";
		
	@FindBy(id="btnContinueGaragingAddress")
	public WebElement btn_ContinueGaragAddress;
	
	@FindBy(id="btnCancelGaragingAddress")
	public WebElement btn_CancelUpdateGaragAdd;	
	
	@FindBy(xpath="//*[@name='homePhoneForm']//button")
	public WebElement btn_HomePhone;
	
	@FindBy(id="txtPhoneNumber-homePhone")
	public WebElement textbox_NewHomePhone;
	
	@FindBy(xpath="//*[@id='btnSaveHomePhoneNumber']/span")
	public WebElement btn_SaveHomePhone;
	
	@FindBy(id="btnCancelHomePhoneNumber")
	public WebElement btn_CancelUpdateHomePhone;
	
	@FindBy(xpath="//*[@name='workPhoneForm']//button")
	public WebElement btn_WorkPhone;
	
	@FindBy(id="txtPhoneNumber-workPhone")
	public WebElement textbox_NewWorkPhone;
	
	@FindBy(xpath="//*[@id='btnSaveWorkPhone']/span")
	public WebElement btn_SaveWorkPhone;
	
	@FindBy(id="btnCancelWorkPhoneNumber")
	public WebElement btn_CancelUpdateWorkPhone;
	
	@FindBy(xpath="//*[@name='cellPhoneForm']//button")
	public WebElement btn_CellPhone;
	
	@FindBy(id="txtPhoneNumber-cellPhone")
	public WebElement textbox_NewCellPhone;
	
	@FindBy(xpath="//*[@id='btnSaveCellPhoneInfo']/span")
	public WebElement btn_SaveCellPhone;
	
	@FindBy(id="btnCancelCellPhoneInfo")
	public WebElement btn_CancelUpdateCellPhone;
	
	@FindBy(xpath="//*[@name='allowTextMessageForm']//button")
	public WebElement btn_TextMessageAlerts;
	
	@FindBy(xpath="//*[@id='allowTextMessage-true']/ancestor::div/label")
	public WebElement btn_WantTextAlertsYes;
	
	@FindBy(xpath="//*[@id='allowTextMessage-false']/ancestor::div/label")
	public WebElement btn_WantTextAlertsNo;
	
	@FindBy(name="phoneNumber")
	public WebElement textbox_TextAlertsMobileNumber;
	
	@FindBy(name="carrier")
	public WebElement dropdown_Carrrier;
	
	@FindBy(xpath="//*[@id='btnSaveTextAlerts']/span")
	public WebElement btn_SaveTextAlerts;
	
	@FindBy(id="btnCancelTextMessageAlerts")
	public WebElement btn_CancelUpdateTextAlerts;
	
	@FindBy(id="model-btn-Keep")
	public WebElement btn_KeepChanges;
	
	@FindBy(id="model-btn-Discard")
	public WebElement btn_DiscardChanges;
	
}
