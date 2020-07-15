package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Vehicle {

    @FindBy(how= How.ID,using="btnAddReplaceVehicle")
    public WebElement btn_AddReplaceVehicle;

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

    @FindBy(how= How.XPATH,using="//*[@id='isReplaceVehicle-false']/../label[(text()='No')]")
    public WebElement btn_ReplacingYourVehicle_No;

   @FindBy(how= How.XPATH,using="//*[@id='understandPenalty-true']/../label[(text()='I Understand')]")
    public WebElement btn_FinesAndPanalties_Iunderstand;

    @FindBy(how= How.XPATH,using="//*[@id='understandPenalty-false']/../label[(text()='Cancel')]")
    public WebElement btn_FinesAndPanalties_Cancel;

    @FindBy(how= How.ID,using="btnCancel")
    public WebElement btn_Cancel;

    @FindBy(how= How.ID,using="btnNext")
    public WebElement btn_Next;

    //NEXT PAGE : Tell us more about your Vehicle


    @FindBy(how= How.XPATH,using="//label[contains(@for,'isRideSharing-false')]")
    public WebElement btn_RidesharingNo;

    public String btn_PrimarilyUseAndYear = "//label//span[contains(text(),'{0}')]"; //{0}->business/pleasure/commuting   or //{0}-> 2020/2019/2018/Prior to 2018

    @FindBy(how= How.XPATH,using="//*[@id='primaryUse-pleasure']/../label/span[(text()='Pleasure')]")
    public WebElement btn_Pleasure;

    @FindBy(how= How.XPATH,using="//*[@id='primaryUse-commuting']/../label/span[(text()='Commute to work or school')]")
    public WebElement btn_CommuteToWork_School;

    public String btn_TitledAsBusiness = "//*[@id='titledAsBusiness-{0}']/../label/span[(text()='{1}')]";//{0}-true/false ,{1}->Yes/No

    public String btn_TransportPeopleforCompensation = "//*[@id='transportForCompensation-{0}']/../label/span[(text()='{1}')]";//{0}-true/false ,{1}->Yes/No

public String btn_PickupOrDeliveryService = "//*[@id='providePickupOrDelivery-{0}']/../label/span[(text()='{1}')]";
   
    @FindBy(how= How.ID,using="field-annualMileage")
    public WebElement dropdown_AnnualMileage;

    public String dropdown_MultiselectDropdown="//mat-option//span[contains(text(),'{0}')]"; //Pass anyvalue of dropdow in {0}- Month, Where you park,Annual Milegae

    @FindBy(how= How.XPATH,using="//*[@id='field-parkingLocation']/div/div[1]/span")
    public WebElement dropdown_WhereDoYouPark;


    @FindBy(how= How.XPATH,using="//*[@id='lbl-monthPurchased']/div")
    public WebElement dropdown_WhatMonth;

    public String btn_HandsFree="//*[@id='handsFree-{0}']/../label";

    public String btn_CrashAvoidance= "//*[@id='crashAvoidance-{0}']/../label";

    @FindBy(how= How.XPATH,using="//label[contains(@for,'isCustomEquipment-false')]")
    public WebElement btn_CustomEquipmentNo;

    public String btn_ExistingDamage="//*[@id='isExistingDamage-{0}']/../label";

    public String btn_MakePaymentsonThisVehilce = "//*[@id='makingPayments-{0}']/../label";


    @FindBy(how= How.XPATH,using="(//label[contains(@id,'vehicleYMM')])[1]")
    public WebElement btn_YourPrimaryVehicle;
    
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
  
    //Page : Would you like to add a new driver?

    public String btn_LikeToAddNewDriver="//label[contains(@for,'isAddDriver-{0}')]";

    @FindBy(how= How.XPATH,using="//*[@id=\"btn-Continue\"]/span")
    public WebElement btn_Continue;

    //Page: Who Operates the Vehicle?

    public String btn_selectdriver="//div[contains(text(),'{0}')]/following-sibling::div//label/span[contains(text(),'{1}')]";


    @FindBy(how= How.ID,using="btnUpdateQuote")
    public WebElement btn_UpdateQuote;

    //NEXT PAGE4 : Policy Review

    @FindBy(how= How.ID,using="btnReviewCoverage")
    public WebElement btn_ReviewCoverage;

    //NEXT PAGE5 : Almost Done

    @FindBy(how= How.ID,using="btnChangePolicy")
    public WebElement btn_ChangePolicy;

    @FindBy(how= How.ID,using="btnEditChoices")
    public WebElement btn_EditChoices;

    @FindBy(how= How.ID,using="btnCancelAmendment")
    public WebElement btn_CancelAmendment;

    //NEXT PAGE : Enter VIN For Vehicle

    @FindBy(how= How.XPATH,using="//input[contains(@placeholder,'VIN')]")
    public WebElement textbox_VIN;

    @FindBy(how= How.XPATH,using="//button[contains(@type,'submit')]")
    public WebElement btn_saveVIN;



}
