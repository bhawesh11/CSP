package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoverageSelections {

    //Policy Coverage Sliders------------------------------------------------------
    //Need to enter node values while clicking this element
    @FindBy(xpath="//ng5-slider[@id='EISPABodilyInjuryCov']/span[12]/span[{0}]/ng5-slider-tooltip-wrapper/button")
    public WebElement slider_BodilyInjury;

    @FindBy(xpath="//ng5-slider[@id='EISPAPropertyDamageCov']/span[12]/span[{0}]/ng5-slider-tooltip-wrapper/button")
    public WebElement slider_PropertyDamage;

    @FindBy(xpath="//ng5-slider[@id='PAUMBICov']/span[12]/span[{0}]/ng5-slider-tooltip-wrapper/button")
    public WebElement slider_UMBI;

    @FindBy(xpath="//ng5-slider[@id='PAUMPDCov']/span[12]/span[{0}]/ng5-slider-tooltip-wrapper/button")
    public WebElement slider_UMPD;

    @FindBy(xpath="//ng5-slider[@id='PAMedPayCov']/span[12]/span[{0}]/ng5-slider-tooltip-wrapper/button")
    public WebElement slider_MedicalPayments;

    //Vehicle Coverage Sliders------------------------------------------------------
    //Need to enter node values while clicking this element
    @FindBy(xpath="(//h3[contains(text(),'{0}')]//ancestor::div[1]//span[@class='ng5-slider-ticks']/span[{1}]/ng5-slider-tooltip-wrapper/button)[1]")
    public WebElement slider_Comprehensive;
    // {0}=vehicle name(ex. - 2012 ACURA MDX AWD)   ,   {1}=Node no

    @FindBy(xpath="(//h3[contains(text(),'{0}')]//ancestor::div[1]//span[@class='ng5-slider-ticks']/span[{1}]/ng5-slider-tooltip-wrapper/button)[2]")
    public WebElement slider_Collision;

    @FindBy(xpath="(//h3[contains(text(),'{0}')]//ancestor::div[1]//span[@class='ng5-slider-ticks']/span[{1}]/ng5-slider-tooltip-wrapper/button)[3]")
    public WebElement slider_RentalReimbursement;

    @FindBy(xpath="//h3[contains(text(),'{0}')]//ancestor::div[1]//label[contains(@for,'PATowingLaborCov')]")
    public WebElement checkbox_RoadsideAssistance;

    @FindBy(xpath="(//h3[contains(text(),'{0}}')]//ancestor::div[1]//label[contains(@for,'DamageOnVehicle')])[1]")
    public WebElement btn_Damage_Yes;

    @FindBy(xpath="(//h3[contains(text(),'{0}')]//ancestor::div[1]//label[contains(@for,'DamageOnVehicle')])[2]")
    public WebElement btn_Damage_NO;

    @FindBy(xpath="//h3[contains(text(),'{0}')]//ancestor::div[1]//textarea[contains(@id,'txtDamageDesc')]")
    public WebElement textbox_DamageDesc;

    //Special Coverages-----------------------------------------------------------------------------------------
    @FindBy(xpath="//label[@for='EISPALegalPlanCov']")
    public WebElement checkbox_LegalAssistance;
    //-----------------------------------------------------------------------------------------------------------
    @FindBy(id="btnUpdateQuote")
    public WebElement btn_UpdateQuote;
}