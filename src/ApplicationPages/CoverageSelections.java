package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoverageSelections {

    //----------------Policy Coverage Sliders------------------------------------------------------

    
	//Need to enter node values while clicking this element
	
	public String slider_BodilyInjury = "//*[contains(@id, 'BodilyInjury')]//span[{0}]//button";
	public String slider_PropertyDamage = "//*[contains(@id, 'PropertyDamage')]//span[{0}]//button";
	public String slider_UMBI = "//*[contains(@id, 'UMBI')]//span[{0}]//button";
	public String slider_UMPD = "//*[contains(@id, 'UMPD')]//span[{0}]//button";
	public String slider_MedicalPayments = "//*[contains(@id, 'MedPay')]//span[{0}]//button";
	public String slider_PIP = "//*[contains(@id, 'PIP')]//span[{0}]//button";

    //----------------Vehicle Coverage Sliders------------------------------------------------------

    //DESC of Dynamic Values : {0}=vehicle name(ex. - 2012 ACURA MDX AWD)   ,  {1}=Node no

	
	public String slider_Comprehensive = "(//h3[contains(text(),'{0}')]//ancestor::div[1]//span[@class='ng5-slider-ticks']/span[{1}]/ng5-slider-tooltip-wrapper/button)[1]";

    public String slider_Collision = "(//h3[contains(text(),'{0}')]//ancestor::div[1]//span[@class='ng5-slider-ticks']/span[{1}]/ng5-slider-tooltip-wrapper/button)[2]";
    public String slider_RentalReimbursement = "(//h3[contains(text(),'{0}')]//ancestor::div[1]//span[@class='ng5-slider-ticks']/span[{1}]/ng5-slider-tooltip-wrapper/button)[3]";
    public String slider_CustomEquipment = "(//h3[contains(text(),'{0}')]//ancestor::div[1]//span[@class='ng5-slider-ticks']/span[{1}]/ng5-slider-tooltip-wrapper/button)[4]";
    public String chkbox_RoadSideAssist = "//h3[contains(text(),'{0}')]//ancestor::div[1]//label[contains(@for,'PATowingLaborCov')]";

    public String btn_Damage_Yes = "(//h3[contains(text(),'{0}}')]//ancestor::div[1]//label[contains(@for,'DamageOnVehicle')])[1]";
    public String btn_Damage_NO = "(//h3[contains(text(),'{0}')]//ancestor::div[1]//label[contains(@for,'DamageOnVehicle')])[2]";
    public String textbox_DamageDesc= "//h3[contains(text(),'{0}')]//ancestor::div[1]//textarea[contains(@id,'txtDamageDesc')]";
    public String chkbox_LoanLeasePayoff = "//h3[contains(text(),'{0}')]//ancestor::div[1]//label[contains(@for,'EISPALoanGapCov')]";
    
    //-----------------Special Coverages-----------------------------------------------------------------------------------------
    @FindBy(xpath="//label[@for='EISPALegalPlanCov']")
    public WebElement chkbox_LegalAssistance;
    
    @FindBy(xpath="//div[text()='Income Loss']")
	 public WebElement chkbox_IncomeLoss;
    
    @FindBy(xpath="//div[text()='Enhanced Underinsured Motorist']")
	 public WebElement chkbox_EUIM_MD;
        
    //-----------------------------------------------------------------------------------------------------------
    @FindBy(id="btnUpdateQuote")
    public WebElement btn_UpdateQuote;
	//public String chkbox_RoadSideAssist;


    //NEXT PAGE6 : Policy Review

    @FindBy(id="btnReviewCoverage")
    public WebElement btn_ReviewCoverage;

    //NEXT PAGE7 : Almost Done

    @FindBy(id="btnChangePolicy")
    public WebElement btn_ChangePolicy;

    @FindBy(id="btnEditChoices")
    public WebElement btn_EditChoices;

    @FindBy(id="btnCancelAmendment")
    public WebElement btn_CancelAmendment;


    }

