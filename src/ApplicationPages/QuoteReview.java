package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuoteReview {

    @FindBy(id="btnChangePolicy")
    public WebElement btn_ChangePolicy;

    @FindBy(id="btnEditChoices")
    public WebElement btn_EditChoices;

    @FindBy(id="btnCancelAmendment")
    public WebElement btn_CancelAmendment;
}
