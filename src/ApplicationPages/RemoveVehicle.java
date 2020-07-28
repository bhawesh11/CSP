package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveVehicle {

    public String btn_VehicleDetail="//div[contains(@id,'{0}')]";

    @FindBy(how= How.XPATH,using="//span[contains(text(),'Remove')]")
    public WebElement btn_Remove;

    //NEXT PAGE2 : Tag Deactivitation

    public String btn_DeActivatedtheTags = "//*[@id='isDeactivatedTags-{0}']/../label[(text()='{1}')]"; //{0}-true/false ,{1}->Yes/No

    @FindBy(how= How.XPATH,using="//label[contains(text(),'No')]")
    public WebElement btn_No;

    @FindBy(how= How.XPATH,using="//label[contains(text(),'I Understand')]")
    public WebElement btn_IUnderstnad;

    @FindBy(how= How.XPATH,using="//label[contains(text(),'Cancel')]")
    public WebElement btn_Cancel;

    //NEXT PAGE3 : Vehicle Assignment
    @FindBy(how= How.XPATH,using="//button//span[contains(text(),'Continue')]")
    public WebElement btn_Continue;

    //NEXT PAGE4 : Policy Coverage
    @FindBy(how= How.ID,using="btnUpdateQuote")
    public WebElement btn_UpdateQuote;

    @FindBy(how= How.XPATH,using= "//button//span[contains(text(),'Continue without Coverage')]") //Button will appear if you select collision and legal assistance as coverage
    public WebElement btn_ClickContinueWithoutCoverage;

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


}
