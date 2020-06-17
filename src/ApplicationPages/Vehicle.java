package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Vehicle {

	
    @FindBy(how= How.ID,using="txtVinNo")
    public WebElement txt_VinNo;

    @FindBy(how= How.ID,using="vehicleYear")
    public WebElement dropdown_VehicleYear;

    @FindBy(how= How.XPATH,using="//*[@id='vehicleMake']/div/div[1]/span")
    public WebElement dropdown_VehicleMake;

    @FindBy(how= How.XPATH,using="//*[@id=\"vehicleModel\"]/div/div[1]/span")
    public WebElement dropdown_VehicleModel;

    @FindBy(how= How.ID,using="vehicleBodyType")
    public WebElement dropdown_BodyType;
    
    public String btn_ReplacingYourVehicle = "//*[@id='isReplaceVehicle-{0}']/../label[(text()='{1}')]"; //{0}-true/false ,{1}->Yes/No

    public String btn_KeepSameCoverage = "//*[@id='useSameCoverages-{0}']/../label[(text()='{1}')]"; //{0}-true/false ,{1}->Yes/No

    public String btn_DeActivatedtheTags = "//*[@id='isDeactivatedTags-{0}']/../label[(text()='{1}')]"; //{0}-true/false ,{1}->Yes/No

   @FindBy(how= How.XPATH,using="//*[@id='understandPenalty-true']/../label[(text()='I Understand')]")
    public WebElement btn_FinesAndPanalties_Iunderstand;

    @FindBy(how= How.XPATH,using="//*[@id='understandPenalty-false']/../label[(text()='Cancel')]")
    public WebElement btn_FinesAndPanalties_Cancel;

    @FindBy(how= How.ID,using="btnCancel")
    public WebElement btn_Cancel;

    @FindBy(how= How.ID,using="btnNext")
    public WebElement btn_Next;

//NEXT PAGE2 : Tell us more about your
    
    public String btn_Ridesharing = "//*[@id='isRideSharing-{0}']/../label/span[(text()='{1}')]"; //{0}-true/false ,{1}->Yes/No

    @FindBy(how= How.XPATH,using="//*[@id=\"lbl-rideSharingHours\"]/div/div/span")
    public WebElement dropdown_HowManyHoursperWeek_Ridesharing;
    
    public String btn_PrimarilyUse = "//*[@id='primaryUse-{0}']/../label/span[(text()='{1}')]]"; //{0}-true/false ,{1}->Yes/No
	//{0}->business/pleasure/commuting , {1}->Business/Pleasure/Commute to work or school

    public String btn_TitledAsBusiness = "//*[@id='titledAsBusiness-{0}']/../label/span[(text()='{1}')]";//{0}-true/false ,{1}->Yes/No

    public String btn_TransportPeopleforCompensation = "//*[@id='transportForCompensation-{0}']/../label/span[(text()='{1}')]";//{0}-true/false ,{1}->Yes/No

public String btn_PickupOrDeliveryService = "//*[@id='providePickupOrDelivery-{0}']/../label/span[(text()='{1}')]";
   
    @FindBy(how= How.ID,using="field-annualMileage")
    public WebElement dropdown_AnnualMileage;

    @FindBy(how= How.XPATH,using="//*[@id='field-parkingLocation']/div/div[1]/span/span")
    public WebElement dropdown_WhereDoYouPark;

    public String btn_WhenDidYouPurchase = "//*[@id='yearVehiclePurchased-{0}']/../label/span[(text()='{0}')]";

    @FindBy(how= How.XPATH,using="//*[@id='lbl-monthPurchased']/div")
    public WebElement dropdown_WhatMonth;

    public String btn_HandsFree = "//*[@id='handsFree-{0}']/../label";
  
    public String btn_CrashAvoidance = "//*[@id='crashAvoidance-{0}']/../label";
    
    public String btn_CustomEquipments = "//*[@id='isCustomEquipment-{0}']/../label";
    
    public String btn_ExistingDamage = "//*[@id='isExistingDamage-{0}']/../label";

    public String btn_MakePaymentsonThisVehilce = "//*[@id='isExistingDamage-{0}']/../label";

    public String btn_YourPrimaryVehicle = "//*[contains(@id,'{0}')]"; //{0}=AUDI-A8LQUATTRO

    
    public String btn_IsthisaLeasedVehicle ="//label[@for='isVehicleLeased-{0}']"; //{0}->true/false
   
    
    @FindBy(how= How.XPATH,using="//*[@id=\"txtLeaseHolderDetails\"]")
    public WebElement txt_LeaseholderName;
    
    @FindBy(how= How.XPATH,using="//*[@id=\"txtStreet\"]")
    public WebElement txt_Leaseholder_Street;
    
    @FindBy(how= How.XPATH,using="//*[@id=\"txtCity\"]")
    public WebElement txt_Leaseholder_City;
    
    @FindBy(how= How.XPATH,using="//*[@id=\"txtPostalCode\"]")
    public WebElement txt_Leaseholder_PostalCode;
    
    @FindBy(how= How.XPATH,using="//label[@for='lienHolderUnknown']")
    public WebElement checkbox_Leaseholder_IDontknowMyLeinholder;
  
    @FindBy(how= How.ID,using="btnContinueToQuote")
    public WebElement btn_ContinuetoQuote;
    
    // Below button appears when removing vehicle
    @FindBy(how= How.XPATH,using="//span[text()='Continue']")
    public WebElement btn_Continue_WhenRemovingVehicle;
  
    //Page3 : Would you like to add a new driver?

   public String btn_LikeToAddNewDriver ="//*[@id='isAddDriver-{0}']/../label";
 
    @FindBy(how= How.XPATH,using="//*[@id=\"btn-Continue\"]/span")
    public WebElement btn_Continue;



}
