package SharedTC;


import ApplicationPages.PaymentConfirmation;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_PaymentConfirmation {

    public void paymentConfirmation(Testing test) {
        test.setPage(PaymentConfirmation.class);
        PaymentConfirmation paymentConfirmation = (PaymentConfirmation) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().staticWait(5000);
        test.webFunctions().click(test, paymentConfirmation.btn_BackToDashboard);
        test.getLogger().info("Payment Successful.");
    }
}