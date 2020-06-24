package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard {

    //	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

	public String maximizeVehicleDetail = "//*[contains(@id,'{0}')]";//{0}->2012-AUDI-A8LQUATTRO
	
	@FindBy(id="btnGetIdCards-Dashboard")
    public WebElement btn_GetIdCards;

    @FindBy(id="btnMakeAPayment-Dashboard")
    public WebElement btn_MaanagePayment;

    @FindBy(id="btnFileACliam-Dashboard")
    public WebElement btn_FileACliam;
    
    @FindBy(xpath="//a[contains(text(),'Policy')]")
    public WebElement btn_Policy;
    
    @FindBy(xpath="//a[contains(text(),'Documents')]")
    public WebElement btn_Documents;
    
    @FindBy(xpath="//a[contains(text(),'Claims')]")
    public WebElement btn_Claims;
    
    @FindBy(xpath="//a[contains(text(),'Personal Info')]")
    public WebElement btn_PersonalInfo;
    
    @FindBy(id="btn-One-Time-Payment")
    public WebElement btn_OneTimePayment;

    @FindBy(id="btnPaymentMethods")
    public WebElement btn_PaymentMethods;

    @FindBy(id="btnEditCoverage")
    public WebElement btn_EditCoverage;

    @FindBy(id="btnAddDrivers")
    public WebElement btn_AddDrivers;

    @FindBy(id="(//h2[text()='Vehicles']/..//button)[1]")
    public WebElement expandVehicle1;

    @FindBy(id="btnAddReplaceVehicle")
    public WebElement btn_AddReplaceVehicle;

    @FindBy(xpath="//span[(text()='Remove')]")
    public WebElement btn_RemoveVehicle;
    
    @FindBy(id="btnReschedule")
    public WebElement btn_Reschedule;
    
    @FindBy(xpath="//span[text()='Edit']")
	public WebElement btn_EditVehicle;
	 
	@FindBy(xpath="//span[text()='Get ID Card']")
	public WebElement btn_IDCardForVehicle;
	
}
