package ApplicationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Driver {

    @FindBy(how= How.ID,using="btnAddDrivers")
    public WebElement btn_AddDriver;

    //NEXT PAGE2 : Tell us about the driver

    @FindBy(how= How.ID,using="firstName")
    public WebElement textbox_FirstName;

    @FindBy(how= How.ID,using="lastName")
    public WebElement textbox_LastName;

    @FindBy(how= How.XPATH,using="//input[contains(@id,'dob')]")
    public WebElement textbox_DOB;

    @FindBy(how= How.ID,using="//span[contains(text(),'Male')]")
    public WebElement btn_SelectMale;

    @FindBy(how= How.ID,using="//span[contains(text(),'Female')]")
    public WebElement btn_SelectFemale;

    @FindBy(how= How.XPATH,using="//div")
    public WebElement btn_relationship;

    @FindBy(how= How.ID,using="driverLicenseNumber")
    public WebElement textbox_DriverLicenseNumber;

    @FindBy(how= How.ID,using="lbl-driverLicenseState")
    public WebElement dropdown_DriverLicenseState;

    @FindBy(how= How.ID,using="btn-Continue")
    public WebElement btn_Continue;

    @FindBy(how= How.ID,using="btn-cancel")
    public WebElement btn_Cancel;

    //NEXT PAGE3 : Do you want to add Vehicle?

    @FindBy(how= How.XPATH,using="//label[contains(@for,'isAddVehicle-true')]")
    public WebElement btn_YesAddVehicle;

    @FindBy(how= How.XPATH,using="//label[contains(@for,'isAddVehicle-false')]")
    public WebElement btn_NoAddVehicle;

    //NEXT PAGE4 : Who operates the vehicle most?

    @FindBy(how= How.XPATH,using="(//span[contains(@class,'desc')])[1]")
    public WebElement btn_VehicleOperatorNewDriver;

    @FindBy(how= How.XPATH,using="(//span[contains(@class,'desc')])[2]")
    public WebElement btn_VehicleOperatorPolicyHolder;

    @FindBy(how= How.ID,using="btnUpdateQuote")
    public WebElement btn_UpdateQuote;

    //NEXT PAGE5 : Policy Review

    @FindBy(how= How.ID,using="btnReviewCoverage")
    public WebElement btn_ReviewCoverage;

    //NEXT PAGE6 : Almost Done

    @FindBy(how= How.ID,using="btnChangePolicy")
    public WebElement btn_ChangePolicy;

    @FindBy(how= How.ID,using="btnEditChoices")
    public WebElement btn_EditChoices;

    @FindBy(how= How.ID,using="btnCancelAmendment")
    public WebElement btn_CancelAmendment;


    public void relationshipToInsured(String str)
    {
        btn_relationship.findElement(By.xpath("[contains(@class,'form-row')]/child::div/label/span[contains(text(),'"+str+"')]")).click();
    }
}
