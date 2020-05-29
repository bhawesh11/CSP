package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentMethods {

    //-----------------------------NEW BANK ACCOUNT-----------------------------

    @FindBy(xpath="//span[text()='New Bank Account']/../../input")
    public WebElement btn_NewBankAccount;

    @FindBy(id="txtBankFirstName")
    public WebElement textBox_AccountHolderFirstName;

    @FindBy(id="txtBankLastName")
    public WebElement textBox_AccountHolderLastName;

//    @FindBy(xpath="//*[@for='existing-billing-address']/../input")
    @FindBy(css="address")
    public WebElement btn_AccountExistingAddress;

    @FindBy(xpath="//*[@for='new-billing-address']/../input")
    public WebElement btn_ADifferentBillingAddress;

    @FindBy(id="txtStreet")
    public WebElement textBox_Street;

    @FindBy(id="txtApt")
    public WebElement textBox_Apt;

    @FindBy(id="txtCity")
    public WebElement textBox_City;

    @FindBy(id="state")
    public WebElement dropDown_State;

    @FindBy(id="txtPostalCode")
    public WebElement textBox_PostalCode;

    @FindBy(xpath="//span[contains(.,'Checking')]")
    public WebElement btn_CheckingAccount;

    @FindBy(xpath="//label[contains(.,'Savings')]")
    public WebElement btn_SavingAccount;

    @FindBy(id="txtBankRoutingNumber")
    public WebElement textBox_RoutingNumber;

    @FindBy(id="txtBankAccountNumber")
    public WebElement textBox_AccountNumber;

    @FindBy(id="txtBankNickName")
    public WebElement textBox_BankNickName;

    @FindBy(xpath="//label[contains(.,'Make this my primary payment method')]")
    public WebElement checkBox_MakePrimaryPaymentMethod;

    @FindBy(id="btnPaymentMethod-SaveBankAccount")
    public WebElement btn_SaveBankAccount;

    //-----------------------------NEW CREDIT CARD-----------------------------

    @FindBy(xpath = "//span[contains(.,'New Credit Card')])")
    //@FindBy(xpath="//span[text()='New Credit Card']/../../input")
    public WebElement btn_NewCreditCard;

    @FindBy(id="id=txtCardFirstName")
    public WebElement textBox_CardFirstName;

    @FindBy(id="id=txtCardLastName")
    public WebElement textBox_CardLastName;

    @FindBy(css="address")
    public WebElement btn_CardExistingAddress;

    @FindBy(xpath="//span[contains(.,'A Different Billing Address')]")
    public WebElement btn_DifferentBillingAddress;

    @FindBy(id="txtStreet")
    public WebElement textBox_CardStreet;

    @FindBy(id="txtApt")
    public WebElement textBox_CardApt;

    @FindBy(id="txtCity")
    public WebElement textBox_CardCity;

    @FindBy(xpath="//mat-select[@id='state']/div/div")
    public WebElement dropDown_CardState;

    @FindBy(id="txtPostalCode")
    public WebElement textBox_CardPostalCode;

    @FindBy(id="txtCardNumber")
    public WebElement textBox_CardNumber;

    @FindBy(css=".mat-select-value > .ng-tns-c13-4")
    public WebElement dropDown_ExpiryMonth;

    @FindBy(css=".mat-select-value > .ng-tns-c13-6")
    public WebElement dropDown_ExpiryYear;

    @FindBy(id="txtCardNickName")
    public WebElement textBox_txtCardNickName;

    @FindBy(xpath="//label[contains(.,'Make this my primary payment method')]")
    public WebElement checkBox_CardMakePrimaryPaymentMethod;

    @FindBy(id="btnPaymentMethod-SaveCreditCard")
    public WebElement btn_SaveCreditCard;

}
