package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MakePayment {

    //	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

    @FindBy(id="//label[@for='pay-amount-due-now']")
    public WebElement btn_DueNow;

    @FindBy(id="//label[@for='pay-amount-total-balance']")
    public WebElement btn_TotalBalance;

    @FindBy(id="lblOtherAmount")
    public WebElement btn_OtherAmount;

    //If 'other amount' is selected:
    @FindBy(id="pay-amount-other-amount-input")
    public WebElement textBox_PaymentAmount;

    @FindBy(css=".form-icon-radio:nth-child(1) > .payment-method-radio > .radio-icon")
    public WebElement btn_SavedPaymentMethod;

    @FindBy(id="btnReviewPayment")
    public WebElement btn_ReviewPayment;

}
