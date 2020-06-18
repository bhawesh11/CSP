package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveDriver {
    @FindBy(how= How.XPATH,using="(//button[contains(@title,'Click to show details')])[5]")
    public WebElement buttton_VehicleDetail;

    @FindBy(how= How.XPATH,using="//span[contains(text(),'Remove')]")
    public WebElement buttton_Remove;

    //NEXT PAGE2 : Tag Deactivitation

    @FindBy(how= How.XPATH,using="//label[contains(text(),'Yes')]")
    public WebElement buttton_Yes;

    @FindBy(how= How.XPATH,using="//label[contains(text(),'No')]")
    public WebElement buttton_No;

    @FindBy(how= How.XPATH,using="//label[contains(text(),'I Understand')]")
    public WebElement buttton_IUnderstnad;

    @FindBy(how= How.XPATH,using="//label[contains(text(),'Cancel')]")
    public WebElement buttton_Cancel;

    @FindBy(how= How.XPATH,using="//button//span[contains(text(),'Continue')]")
    public WebElement buttton_Continue;
}
