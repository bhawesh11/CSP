package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPayment {

    //	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

    @FindBy(xpath="//dd[contains(.,'$')]")
    public WebElement text_PaymentAmount;

//    @FindBy(xpath="//span[contains(.,'Correct! Make Payment')]")
//    @FindBy(xpath="//button[@id='btnMakePayment']/span")
    @FindBy(id="btnMakePayment")
    public WebElement btn_MakePayment;

    @FindBy(xpath="//*[@class='alert alert-info']")
    public WebElement text_ReturnedPaymentFeeText;
}
