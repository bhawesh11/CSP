package SharedTC;

import ApplicationPages.DashBoard;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_DashBoard {
    public void clickOneTimePayment(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_OneTimePayment);
        test.getLogger().info("Selected 'One Time Payment' on Dashboard.");
    }
    public void clickNewPaymentMethod(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_PaymentMethods);
        test.getLogger().info("Selected 'Payment Method' on Dashboard.");
    }
    
}
