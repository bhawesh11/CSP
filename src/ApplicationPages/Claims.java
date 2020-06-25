package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Claims {

    //	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

    @FindBy(xpath="//span[text()='File a Claim']")
    public WebElement btn_FileClaim;

    @FindBy(xpath="(//dt[text()='Claim Number:']/ancestor::div[1]/dd)[1]")
    public WebElement text_ClaimNumber;

    @FindBy(xpath="(//dt[text()='Loss Date:']/ancestor::div[1]/dd)[1]")
    public WebElement text_LossDate;

    @FindBy(xpath="(//dt[text()='Status:']/ancestor::div[1]/dd)[1]")
    public WebElement text_ClaimStatus;

    @FindBy(xpath="(//span[text()=' View Claim Details '])[1]")
    public WebElement btn_ViewClaimDetails;
}
