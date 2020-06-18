package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BindConfirmation {
	
    @FindBy(id="h1YourPolicybeenUpdated")
    public WebElement text_ConfirmationText;

    @FindBy(id="lblEffectiveDateValue")
    public WebElement text_EffectiveDate;

    @FindBy(id="lblPremiumImpactValue")
    public WebElement text_PremiumImpact;

    @FindBy(id="lblNextPaymentAmountValue")
    public WebElement text_NextPaymentAmount;

    @FindBy(id="lblNextPaymentDateValue")
    public WebElement text_NextPaymentDate;
}
