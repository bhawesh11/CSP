package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Claims {

    //	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

    @FindBy(xpath="//span[text()='File a Claim']")
    public WebElement btn_FileClaim;

    @FindBy(xpath="//dt[text()='Claim Number:']/../dd")
    public WebElement text_ClaimNumber;

    @FindBy(xpath="//dt[text()='Loss Date:']/../dd")
    public WebElement text_LossDate;

    @FindBy(xpath="//dt[text()='Status:']/../dd")
    public WebElement text_ClaimStatus;

    @FindBy(xpath="//span[text()=' View Claim Details ']")
    public WebElement btn_ViewClaimDetails;
}
