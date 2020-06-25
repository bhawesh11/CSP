package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditVehicleCoverage {

 
	 
	 public String btn_SliderComprehensive = "//*[contains(@id, 'PAComprehensive')]//span[{0}]//button";
	 public String btn_SliderCollision = "//*[contains(@id, 'PACollision')]//span[{0}]//button";
	 public String btn_SliderRental = "//*[contains(@id, 'PARental')]//span[{0}]//button";
	 public String btn_CustomEquipment = "//*[contains(@id, 'EISPACustEquip')]//span[{0}]//button";
	 
	 @FindBy(xpath="//input[contains(@id, 'DamageOnVehicle')]/ancestor::div/label[text()='Yes']")
	 public WebElement btn_HaveDamageYes;
	 
	 @FindBy(xpath="//input[contains(@id, 'DamageOnVehicle')]/ancestor::div/label[text()='No']")
	  public WebElement btn_HaveDamageNo;
	 	 
	 @FindBy(xpath="//input[contains(@id, 'makingPayments')]/ancestor::div/label[text()='Yes']")
	  public WebElement btn_MakingPaymentsYes;
	 
	 @FindBy(xpath="//input[contains(@id, 'makingPayments')]/ancestor::div/label[text()='No']")
	  public WebElement btn_MakingPaymentsNo;
	      
	 @FindBy(xpath="//input[contains(@id, 'isVehicleLeased')]/ancestor::div/label[text()='Yes']")
	  public WebElement btn_IsLeasedVehicleYes;
	 
	 @FindBy(xpath="//input[contains(@id, 'isVehicleLeased')]/ancestor::div/label[text()='No']")
	  public WebElement btn_IsLeasedVehicleNo;
	 
	  @FindBy(id="btnEditLeaseHolder")
	  public WebElement btn_EditLienholder;
	 
	  @FindBy(xpath="//div[text()='Smart Roadside Assistance']")
	  public WebElement chkbox_RoadsideAssistance;
	 
	   @FindBy(xpath="//div[text()='Loan Lease Payoff']")
	   public WebElement chkbox_LoanLeasePayoff;
	 	 	 
	   @FindBy(xpath="//*[contains(@id, 'txtDamageDesc')]")
	   public WebElement textbox_DamageDescription;
	  	 
	    @FindBy(id="txtLeaseHolderDetails")
	    public WebElement textbox_Leaseholder;
	 
	    @FindBy(id="txtStreet")
		public WebElement textbox_Street;
			 
	    @FindBy(id="txtApt")
		public WebElement textbox_Apt;
		
		@FindBy(id="txtCity")
		public WebElement textbox_City;
		
		@FindBy(id="state")
		public WebElement textbox_State;
		
		@FindBy(id="txtPostalCode")
		public WebElement textbox_PostalCode;
		
		@FindBy(xpath="//*[@id='lienHolderUnknown']/ancestor::div/label")
		public WebElement chkbox_UnknownLienholder;
		
		@FindBy(xpath="//*[contains(@id, 'btnCancel')]/span")
		public WebElement btn_CancelLienholderUpdate;
		
		@FindBy(xpath="'btnSaveLienholder')]/span")
		public WebElement btn_SaveLienholder;
		
		@FindBy(xpath="//*[@id='model-btn-Cancel']/span")
		public WebElement btn_CancelAmendment;
		
		@FindBy(xpath="//*[@id='model-btn-Ok']/span")
		public WebElement btn_OkAmendment;
	 
		@FindBy(xpath="//*[contains(@id, 'btnSaveVehicles')]/span")
		public WebElement btn_SaveVehicles;
		
		@FindBy(xpath="//*[contains(@id, 'btnCancelEditVehicles')]/span")
		public WebElement btn_CancelVehicles;
		
	 

}
