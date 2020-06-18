package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoverageSelections {

    //----------------Policy Coverage Sliders------------------------------------------------------
    
	//Need to enter node values while clicking this element
	
	public String slider_BodilyInjury="//ng5-slider[@id='EISPABodilyInjuryCov']/span[12]/span[{0}]/ng5-slider-tooltip-wrapper/button";
	public String slider_PropertyDamage="//ng5-slider[@id='EISPAPropertyDamageCov']/span[12]/span[{0}]/ng5-slider-tooltip-wrapper/button";
	public String slider_UMBI="//ng5-slider[@id='PAUMBICov']/span[12]/span[{0}]/ng5-slider-tooltip-wrapper/button";
	public String slider_UMPD="//ng5-slider[@id='PAUMPDCov']/span[12]/span[{0}]/ng5-slider-tooltip-wrapper/button";
	public String slider_MedicalPayments="//ng5-slider[@id='PAMedPayCov']/span[12]/span[{0}]/ng5-slider-tooltip-wrapper/button";

	
	
    //----------------Vehicle Coverage Sliders------------------------------------------------------
    	
    //DESC of Dynamic Values : {0}=vehicle name(ex. - 2012 ACURA MDX AWD)   ,  {1}=Node no
	
	public String slider_Comprehensive="(//h3[contains(text(),'{0}')]//ancestor::div[1]//span[@class='ng5-slider-ticks']/span[{1}]/ng5-slider-tooltip-wrapper/button)[1]";
    public String slider_Collision="(//h3[contains(text(),'{0}')]//ancestor::div[1]//span[@class='ng5-slider-ticks']/span[{1}]/ng5-slider-tooltip-wrapper/button)[2]";
    public String slider_RentalReimbursement="(//h3[contains(text(),'{0}')]//ancestor::div[1]//span[@class='ng5-slider-ticks']/span[{1}]/ng5-slider-tooltip-wrapper/button)[3]";
    public String checkbox_RoadsideAssistance="//h3[contains(text(),'{0}')]//ancestor::div[1]//label[contains(@for,'PATowingLaborCov')]";
    public String btn_Damage_Yes="(//h3[contains(text(),'{0}}')]//ancestor::div[1]//label[contains(@for,'DamageOnVehicle')])[1]";
    public String btn_Damage_NO="(//h3[contains(text(),'{0}')]//ancestor::div[1]//label[contains(@for,'DamageOnVehicle')])[2]";
    public String textbox_DamageDesc="//h3[contains(text(),'{0}')]//ancestor::div[1]//textarea[contains(@id,'txtDamageDesc')]";

    //-----------------Special Coverages-----------------------------------------------------------------------------------------
    @FindBy(xpath="//label[@for='EISPALegalPlanCov']")
    public WebElement checkbox_LegalAssistance;
    
    //-----------------------------------------------------------------------------------------------------------
    @FindBy(id="btnUpdateQuote")
    public WebElement btn_UpdateQuote;
    
    
}
