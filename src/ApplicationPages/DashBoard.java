package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard {

    //	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

    @FindBy(id="btnGetIdCards-Dashboard")
    public WebElement btn_GetIdCards;

    @FindBy(id="btnMakeAPayment-Dashboard")
    public WebElement btn_MaanagePayment;

    @FindBy(id="btnFileACliam-Dashboard")
    public WebElement btn_FileACliam;

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

    public String maximizeVehicleDetails = "//*[contains(@id,'{0}')]";//{0}->2012-AUDI-A8LQUATTRO

    @FindBy(xpath="//span[(text()='Remove')]")
    public WebElement btn_removeVehicle;

}
