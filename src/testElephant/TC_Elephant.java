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
    STC_NewPaymentMethod stc_newpaymentmethod= new STC_NewPaymentMethod();
    STC_ReviewPayment stc_ReviewPayment = new STC_ReviewPayment();
    STC_PaymentConfirmation stc_PaymentConfirmation = new STC_PaymentConfirmation();



    //	==============================================================================================
//										***_TEST_CASES_***

    //	TC001
    @Test(enabled = false, priority = 5, description = "$10 Payment - Saved Card")
    @Parameters("ENV")
    public void TC001(String ENV) {

        Testing test = new Testing(ENV, brandName, "OneTimePayment_ExistingCreditCard");
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

//	==============================================================================================


//	TC002
	@Test(enabled = true, priority = 5, description = "Validate OneTimePayment_New Credit Card")
	@Parameters("ENV")
	public void TC002(String ENV) {
	
		Testing test = new Testing(ENV, brandName, "OneTimePayment_NewCreditCard");
		try {
            stc_Login.login(test);
            stc_DashBoard.clickOneTimePayment(test);
            stc_MakePayment.payFromNewCard(test);
            stc_ReviewPayment.reviewPayment(test);
            stc_PaymentConfirmation.paymentConfirmation(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
		
	}//closing TC002 method

//---------------------------------------------------------------------------------------
	
//	TC003
	@Test(enabled = false, priority = 5, description = "Validate OneTimePayment_New ACH/Bank Account")
	@Parameters("ENV")
	public void TC003(String ENV) {
	
		Testing test = new Testing(ENV, brandName, "OneTimePayment_NewACH");
		try {
            stc_Login.login(test);
            stc_DashBoard.clickOneTimePayment(test);
            stc_MakePayment.pay10FromNewBankAccount(test);
            stc_ReviewPayment.reviewPayment(test);
            stc_PaymentConfirmation.paymentConfirmation(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
		
	}//closing TC003 method

//---------------------------------------------------------------------------------------

//	TC004
	@Test(enabled = false, priority = 5, description = "Add new payment Method - ACH")
	@Parameters("ENV")
	public void TC004(String ENV) {
	
		Testing test = new Testing(ENV, brandName, "AddNewPaymentMethod_ACH");
		try {
            stc_Login.login(test);
            stc_DashBoard.clickNewPaymentMethod(test);
            stc_newpaymentmethod.AddAchAccount(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
		
	} //closing TC004 method

//---------------------------------------------------------------------------------------
//	TC005
	@Test(enabled = false, priority = 5, description = "Add new payment Method - Credit Card")
	@Parameters("ENV")
	public void TC005(String ENV) {
	
		Testing test = new Testing(ENV, brandName, "AddNewPaymentMethod_CreditCard");
		try {
            stc_Login.login(test);
            stc_DashBoard.clickNewPaymentMethod(test);
            stc_newpaymentmethod.AddCreditCard(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
		
	}//closing TC005 method
}
