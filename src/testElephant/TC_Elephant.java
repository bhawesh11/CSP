package testElephant;

import SharedTC.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import resources.Testing;

import java.io.IOException;

//import SharedTC.QuoteAndBind;
public class TC_Elephant {


    Logger log = Logger.getLogger("Test Suite");
    private final String brandName = "Elephant";
//    SoftAssert softAssert = new SoftAssert();
//    String script;

//    public static HashMap<String, String> output = new HashMap<String, String>();

//	==============================================================================================
//										*** ADDITIONAL METHODS ***

    @BeforeSuite
    public void openBrowser() throws InterruptedException, IOException {
        PropertyConfigurator.configure("log4j.properties");
    }
    //	==============================================================================================
//										***_TEST_CASES_***
// Creating Objects :
    STC_Login stc_Login = new STC_Login();
    STC_DashBoard stc_DashBoard = new STC_DashBoard();
    STC_MakePayment stc_MakePayment = new STC_MakePayment();
    STC_ReviewPayment stc_ReviewPayment = new STC_ReviewPayment();
    STC_PaymentConfirmation stc_PaymentConfirmation = new STC_PaymentConfirmation();



    //	==============================================================================================
//										***_TEST_CASES_***

    //	TC001
    @Test(enabled = true, priority = 5, description = "$10 Payment - Saved Card")
    @Parameters("ENV")
    public void TC001(String ENV) {

        Testing test = new Testing(ENV, brandName, "Payment10");
        try {
            stc_Login.login(test);
            stc_DashBoard.clickOneTimePayment(test);
            stc_MakePayment.pay10FromSavedCard(test);
            stc_ReviewPayment.reviewPayment(test);
            stc_PaymentConfirmation.paymentConfirmation(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
    }//closing TC001 method

//	---------------------------------------------------------------------------------------



}
