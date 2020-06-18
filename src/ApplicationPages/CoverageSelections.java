package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoverageSelections {

    //Policy Coverage Sliders------------------------------------------------------
    //Need to enter node values while clicking this element
	
   // @FindBy(xpath="//ng5-slider[@id='EISPABodilyInjuryCov']/span[12]/span[{0}]/ng5-slider-tooltip-wrapper/button")
    //public WebElement slider_BodilyInjury;
	public String slider_BodilyInjury="//ng5-slider[@id='EISPABodilyInjuryCov']/span[12]/span[{0}]/ng5-slider-tooltip-wrapper/button";

    //@FindBy(xpath="//ng5-slider[@id='EISPAPropertyDamageCov']/span[12]/span[{0}]/ng5-slider-tooltip-wrapper/button")
    //public WebElement slider_PropertyDamage;
	public String slider_PropertyDamage="//ng5-slider[@id='EISPAPropertyDamageCov']/span[12]/span[{0}]/ng5-slider-tooltip-wrapper/button";

    //@FindBy(xpath="//ng5-slider[@id='PAUMBICov']/span[12]/span[{0}]/ng5-slider-tooltip-wrapper/button")
    //public WebElement slider_UMBI;
	public String slider_UMBI="//ng5-slider[@id='PAUMBICov']/span[12]/span[{0}]/ng5-slider-tooltip-wrapper/button";

   // @FindBy(xpath="//ng5-slider[@id='PAUMPDCov']/span[12]/span[{0}]/ng5-slider-tooltip-wrapper/button")
    //public WebElement slider_UMPD;
	public String slider_UMPD="//ng5-slider[@id='PAUMPDCov']/span[12]/span[{0}]/ng5-slider-tooltip-wrapper/button";

    //@FindBy(xpath="//ng5-slider[@id='PAMedPayCov']/span[12]/span[{0}]/ng5-slider-tooltip-wrapper/button")
    //public WebElement slider_MedicalPayments;
	public String slider_MedicalPayments="//ng5-slider[@id='PAMedPayCov']/span[12]/span[{0}]/ng5-slider-tooltip-wrapper/button";

    //Vehicle Coverage Sliders------------------------------------------------------
    //Need to enter node values while clicking this element
	
    //@FindBy(xpath="(//h3[contains(text(),'{0}')]//ancestor::div[1]//span[@class='ng5-slider-ticks']/span[{1}]/ng5-slider-tooltip-wrapper/button)[1]")
    //public WebElement slider_Comprehensive;
    //DESC of Dynamic Values : {0}=vehicle name(ex. - 2012 ACURA MDX AWD)   ,  {1}=Node no
	public String slider_Comprehensive="(//h3[contains(text(),'{0}')]//ancestor::div[1]//span[@class='ng5-slider-ticks']/span[{1}]/ng5-slider-tooltip-wrapper/button)[1]";

    //@FindBy(xpath="(//h3[contains(text(),'{0}')]//ancestor::div[1]//span[@class='ng5-slider-ticks']/span[{1}]/ng5-slider-tooltip-wrapper/button)[2]")
    //public WebElement slider_Collision;
    public String slider_Collision="(//h3[contains(text(),'{0}')]//ancestor::div[1]//span[@class='ng5-slider-ticks']/span[{1}]/ng5-slider-tooltip-wrapper/button)[2]";

    //@FindBy(xpath="(//h3[contains(text(),'{0}')]//ancestor::div[1]//span[@class='ng5-slider-ticks']/span[{1}]/ng5-slider-tooltip-wrapper/button)[3]")
    //public WebElement slider_RentalReimbursement;
    public String slider_RentalReimbursement="(//h3[contains(text(),'{0}')]//ancestor::div[1]//span[@class='ng5-slider-ticks']/span[{1}]/ng5-slider-tooltip-wrapper/button)[3]";

    //@FindBy(xpath="//h3[contains(text(),'{0}')]//ancestor::div[1]//label[contains(@for,'PATowingLaborCov')]")
    //public WebElement checkbox_RoadsideAssistance;
    public String checkbox_RoadsideAssistance="//h3[contains(text(),'{0}')]//ancestor::div[1]//label[contains(@for,'PATowingLaborCov')]";

   // @FindBy(xpath="(//h3[contains(text(),'{0}}')]//ancestor::div[1]//label[contains(@for,'DamageOnVehicle')])[1]")
    //public WebElement btn_Damage_Yes;
    public String btn_Damage_Yes="(//h3[contains(text(),'{0}}')]//ancestor::div[1]//label[contains(@for,'DamageOnVehicle')])[1]";

    //@FindBy(xpath="(//h3[contains(text(),'{0}')]//ancestor::div[1]//label[contains(@for,'DamageOnVehicle')])[2]")
    //public WebElement btn_Damage_NO;
    public String btn_Damage_NO="(//h3[contains(text(),'{0}')]//ancestor::div[1]//label[contains(@for,'DamageOnVehicle')])[2]";

    //@FindBy(xpath="//h3[contains(text(),'{0}')]//ancestor::div[1]//textarea[contains(@id,'txtDamageDesc')]")
    //public WebElement textbox_DamageDesc;
    public String textbox_DamageDesc="//h3[contains(text(),'{0}')]//ancestor::div[1]//textarea[contains(@id,'txtDamageDesc')]";

    //Special Coverages-----------------------------------------------------------------------------------------
    @FindBy(xpath="//label[@for='EISPALegalPlanCov']")
    public WebElement checkbox_LegalAssistance;
    
    //-----------------------------------------------------------------------------------------------------------
    @FindBy(id="btnUpdateQuote")
    public WebElement btn_UpdateQuote;
    
    
}
