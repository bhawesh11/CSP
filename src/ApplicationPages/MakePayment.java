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
    
    //------New Credit Card---------------
    
    @FindBy(xpath="//span[text()='New Credit Card']")
    public WebElement btn_NewCreditCard;
    
    @FindBy(id="txtCardFirstName")
    public WebElement textBox_NewCC_FirstName;
    
    @FindBy(id="txtCardLastName")
    public WebElement textBox_NewCC_LastName;
    
    @FindBy(xpath="//span[text()='A Different Billing Address']")
    public WebElement btn_NewCC_DifferentBillingAddress;
    
    @FindBy(id="txtCardNumber")
    public WebElement textBox_NewCC_CardNumber;
    
    @FindBy(xpath="//*[@name='expiryMonth']/div[1]/div[1]/span[1]")
    public WebElement dropdown_NewCC_ExpirationMonth;
    //@FindBy(xpath="//span[text()=' 01 ']")
    //public WebElement dropdown_NewCC_ExpirationMonth_01;
    public String select_NewCC_ExpirationMonth= "//span[text()=' {0} ']";
    
    @FindBy(xpath="//*[@name='expiryYear']/div[1]/div[1]/span[1]")
    public WebElement dropdown_NewCC_ExpirationYear;
    //@FindBy(xpath="//span[text()='2024']")
    //public WebElement dropdown_NewCC_ExpirationYear_2024;
    public String select_NewCC_ExpirationYear = "//span[text()='{0}']" ;
    
    @FindBy(xpath="//label[@for='save-true']")
    public WebElement btn_NewCC_SaveCard_Yes;
    
    @FindBy(xpath="//label[@for='save-false']")
    public WebElement btn_NewCC_SaveCard_No;
    
    @FindBy(id="txtCardNickName")
    public WebElement textbox_NewCC_Nickname;
    
    @FindBy(xpath="//label[@for='new-creditcard-primary-method']")
    public WebElement checkbox_NewCC_MakeDefault;
    
  //------New ACH----------------------------------------------
    
    @FindBy(xpath="//span[text()='New Bank Account']")
    public WebElement btn_NewACH;
    
    @FindBy(id="txtBankFirstName")
    public WebElement textBox_NewACH_FirstName;
    
    @FindBy(id="txtBankLastName")
    public WebElement textBox_NewACH_LastName;
    
    @FindBy(xpath="//span[text()='A Different Billing Address']")
    public WebElement btn_NewACH_DifferentBillingAddress;
    
    @FindBy(xpath="//span[text()='Savings']")
    public WebElement btn_NewACH_SavingsAccount;
    
    @FindBy(id="txtBankRoutingNumber")
    public WebElement textBox_NewACH_RoutingNumber;
    
    @FindBy(id="txtBankAccountNumber")
    public WebElement textBox_NewACH_AccountNumber;
    
    @FindBy(xpath="//label[@for='save-true']")
    public WebElement btn_NewACH_SaveAccount_Yes;
    
    @FindBy(xpath="//label[@for='save-false']")
    public WebElement btn_NewACH_SaveAccount_No;
    
    @FindBy(id="txtBankNickName")
    public WebElement textbox_NewACH_Nickname;
    
    @FindBy(xpath="//label[@for='new-bank-primary-method']")
    public WebElement checkbox_NewACH_MakeDefault;
    

}
