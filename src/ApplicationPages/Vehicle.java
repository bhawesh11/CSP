package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Vehicle {

	//Test
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

    @FindBy(how= How.XPATH,using="//*[@id='isReplaceVehicle-true']/../label[(text()='Yes')]")
    public WebElement btn_ReplacingYourVehicle_Yes;

    @FindBy(how= How.XPATH,using="//*[@id='isReplaceVehicle-false']/../label[(text()='No')]")
    public WebElement btn_ReplacingYourVehicle_No;

    @FindBy(how= How.XPATH,using="//*[@id='useSameCoverages-true']/../label[(text()='Yes')]")
    public WebElement btn_KeepSameCoverage_Yes;

    @FindBy(how= How.XPATH,using="//*[@id='useSameCoverages-false']/../label[(text()='No')]")
    public WebElement btn_KeepSameCoverage_No;

    @FindBy(how= How.XPATH,using="//*[@id='isDeactivatedTags-true']/../label[(text()='Yes')]")
    public WebElement btn_DeActivatedtheTags_Yes;

    @FindBy(how= How.XPATH,using="//*[@id='isDeactivatedTags-false']/../label[(text()='No')]")
    public WebElement btn_DeActivatedtheTags_No;

    @FindBy(how= How.XPATH,using="//*[@id='understandPenalty-true']/../label[(text()='I Understand')]")
    public WebElement btn_FinesAndPanalties_Iunderstand;

    @FindBy(how= How.XPATH,using="//*[@id='understandPenalty-false']/../label[(text()='Cancel')]")
    public WebElement btn_FinesAndPanalties_Cancel;

    @FindBy(how= How.ID,using="btnCancel")
    public WebElement btn_Cancel;

    @FindBy(how= How.ID,using="btnNext")
    public WebElement btn_Next;

//NEXT PAGE2 : Tell us more about your

    @FindBy(how= How.XPATH,using="//*[@id='primaryUse-business']/../label/span[(text()='Business')]")
    public WebElement btn_Business;

    @FindBy(how= How.XPATH,using="//*[@id='primaryUse-pleasure']/../label/span[(text()='Pleasure')]")
    public WebElement btn_Pleasure;

    @FindBy(how= How.XPATH,using="//*[@id='primaryUse-commuting']/../label/span[(text()='Commute to work or school')]")
    public WebElement btn_CommuteToWork_School;

    @FindBy(how= How.XPATH,using="//*[@id='titledAsBusiness-true']/../label/span[(text()='Yes')]")
    public WebElement btn_TitledAsBusiness_Yes;

    @FindBy(how= How.XPATH,using="//*[@id='titledAsBusiness-false']/../label/span[(text()='No')]")
    public WebElement btn_TitledAsBusiness_No;

    @FindBy(how= How.XPATH,using="//*[@id='transportForCompensation-true']/../label/span[(text()='Yes')]")
    public WebElement btn_TransportPeopleforCompensation_Yes;

    @FindBy(how= How.XPATH,using="//*[@id='transportForCompensation-false']/../label/span[(text()='No')]")
    public WebElement btn_TransportPeopleforCompensation_No;

    @FindBy(how= How.XPATH,using="//*[@id='providePickupOrDelivery-true']/../label/span[(text()='Yes')]")
    public WebElement btn_PickupOrDeliveryService_Yes;

    @FindBy(how= How.XPATH,using="//*[@id='providePickupOrDelivery-false']/../label/span[(text()='No')]")
    public WebElement btn_PickupOrDeliveryService_No;

    @FindBy(how= How.ID,using="field-annualMileage")
    public WebElement dropdown_AnnualMileage;

    @FindBy(how= How.XPATH,using="//*[@id='field-parkingLocation']/div/div[1]/span/span")
    public WebElement dropdown_WhereDoYouPark;

    @FindBy(how= How.XPATH,using="//*[@id='yearVehiclePurchased-{0}']/../label/span[(text()='{0}')]")
    public WebElement btn_WhenDidYouPurchase;

    @FindBy(how= How.XPATH,using="//*[@id='lbl-monthPurchased']/div")
    public WebElement dropdown_WhatMonth;

    @FindBy(how= How.XPATH,using="//*[@id='handsFree-{0}']/../label")
    public WebElement btn_HandsFree;

    @FindBy(how= How.XPATH,using="//*[@id='crashAvoidance-{0}']/../label")
    public WebElement btn_CrashAvoidance;

    @FindBy(how= How.XPATH,using="//*[@id='isExistingDamage-{0}']/../label")
    public WebElement btn_ExistingDamage;

    @FindBy(how= How.XPATH,using="//*[@id='isExistingDamage-{0}']/../label")
    public WebElement btn_MakePaymentsonThisVehilce;

    @FindBy(how= How.XPATH,using="//*[contains(@id,'{0}')]")//{0}=AUDI-A8LQUATTRO
    public WebElement btn_YourPrimaryVehicle;

    @FindBy(how= How.ID,using="btnContinueToQuote")
    public WebElement btn_ContinuetoQuote;

    //Page3 : Would you like to add a new driver?

    @FindBy(how= How.XPATH,using="//*[@id='isAddDriver-{0}']/../label")
    public WebElement btn_LikeToAddNewDriver;

    @FindBy(how= How.XPATH,using="//*[@id=\"btn-Continue\"]/span")
    public WebElement btn_Continue;



}
