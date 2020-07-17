package ApplicationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Driver {

    //NEXT PAGE : Tell us about the driver

    public String btn_LikeToAddNewDriver="//label[contains(@for,'isAddDriver-{0}')]";

    @FindBy(how= How.ID,using="firstName")
    public WebElement textbox_FirstName;

    @FindBy(how= How.ID,using="lastName")
    public WebElement textbox_LastName;

    @FindBy(how= How.XPATH,using="//input[contains(@id,'dob')]")
    public WebElement textbox_DOB;

    @FindBy(how= How.XPATH,using="//label[contains(@for,'gender-M')]")
    public WebElement btn_SelectMale;

    @FindBy(how= How.XPATH,using="//label[contains(@for,'gender-F')]")
    public WebElement btn_SelectFemale;

    public String btn_selectvalues="//div[contains(@class,'form-row')]/child::div/label/span[contains(text(),'{0}')]";

    @FindBy(how= How.XPATH,using="//span[text()='Primary vehicle']")
    public WebElement dropdown_PrimaryVehicle;

    @FindBy(how= How.XPATH,using="(//mat-option[@tabindex='0'])[1]")
    public WebElement dropdown_FirstVehicle;

    @FindBy(how= How.XPATH,using="(//mat-option[@tabindex='0'])[2]")
    public WebElement dropdown_SecondVehicle;

    @FindBy(how= How.ID,using="driverLicenseNumber")
    public WebElement textbox_DriverLicenseNumber;

    @FindBy(how= How.ID,using="lbl-driverLicenseState")
    public WebElement dropdown_DriverLicenseState;

    public String dropdown_SelectState="//mat-option//span[contains(text(),'{0}')]";


    @FindBy(how= How.XPATH,using="//label[@for='inSchool-true']")
    public WebElement btn_CurentlyStudentYes;

    @FindBy(how= How.XPATH,using="//label[@for='inSchool-false']")
    public WebElement btn_CurentlyStudentNo;

    @FindBy(how= How.XPATH,using="//button//span[contains(text(),'Continue')]")
    public WebElement btn_Continue;

    @FindBy(how= How.ID,using="btn-cancel")
    public WebElement btn_Cancel;

    //NEXT PAGE : Do you want to add Vehicle?

    @FindBy(how= How.XPATH,using="//label[contains(@for,'isAddVehicle-true')]")
    public WebElement btn_AddVehicleYes;

    @FindBy(how= How.XPATH,using="//label[contains(@for,'isAddVehicle-false')]")
    public WebElement btn_AddVehicleNo;

    //NEXT PAGE : Who operates the vehicle most?

    @FindBy(how= How.XPATH,using="(//span[contains(@class,'desc')])[1]")
    public WebElement btn_VehicleOperatorNewDriver;

    @FindBy(how= How.XPATH,using="(//span[contains(@class,'desc')])[4]")
    public WebElement btn_VehicleOperatorOldDriver;


    @FindBy(how= How.XPATH,using="(//span[contains(@class,'desc')])[2]")
    public WebElement btn_VehicleOperatorPolicyHolder;

    @FindBy(how= How.ID,using="btnUpdateQuote")
    public WebElement btn_UpdateQuote;

    @FindBy(how= How.ID,using= "//button//span[contains(text(),'Continue without Coverage')]")
    public WebElement btn_ContinueWithoutCoverage;

    //NEXT PAGE : Policy Review

    @FindBy(how= How.ID,using="btnReviewCoverage")
    public WebElement btn_ReviewCoverage;

    //NEXT PAGE : Almost Done

    @FindBy(how= How.ID,using="btnChangePolicy")
    public WebElement btn_ChangePolicy;

    @FindBy(how= How.ID,using="btnEditChoices")
    public WebElement btn_EditChoices;

    @FindBy(how= How.ID,using="btnCancelAmendment")
    public WebElement btn_CancelAmendment;

    @FindBy(how= How.XPATH,using="//button//span[contains(text(),'Ok')]")
    public WebElement btn_ok;





}
