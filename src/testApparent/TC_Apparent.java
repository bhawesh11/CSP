package testApparent;

import SharedTC.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import resources.Testing;
import java.io.IOException;

//import SharedTC.QuoteAndBind;
public class TC_Apparent {

	Logger log = Logger.getLogger("Test Suite");
	private final String brandName = "Apparent";

	// ==============================================================================================
	// *** ADDITIONAL METHODS ***

	@BeforeSuite
	public void openBrowser() throws IOException {
		PropertyConfigurator.configure("log4j.properties");
	}

	// ==============================================================================================

	// Creating Objects :
	STC_Login stc_Login = new STC_Login();
	STC_Register stc_Register = new STC_Register();
	STC_DashBoard stc_DashBoard = new STC_DashBoard();
	STC_MakePayment stc_MakePayment = new STC_MakePayment();
	STC_ReviewPayment stc_ReviewPayment = new STC_ReviewPayment();
	STC_PaymentConfirmation stc_PaymentConfirmation = new STC_PaymentConfirmation();
	STC_PersonalInfo stc_PersonalInfo = new STC_PersonalInfo();
	STC_Claims stc_Claims = new STC_Claims();
	STC_EditCoverage stc_editCoverage= new STC_EditCoverage();

	// ==============================================================================================
	// ***_TEST_CASES_***

	// TC001
	@Test(enabled = false, priority = 5, description = "$10 Payment - Saved Card")
	@Parameters("ENV")
	public void TC501(String ENV) {

		Testing test = new Testing(ENV, brandName, "Pay$10");
		try {
			test.getLogger().info("Apparent_Testcase001_Pay$10");
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
	}// closing TC501 methodS

	// ---------------------------------------------------------------------------------------
	
	//TC002
	@Test(enabled = false, priority = 5, description = "Verify Claims")
	@Parameters("ENV")
	
	public void TC002(String ENV) {
		
		Testing test = new Testing(ENV, brandName, "VerifyClaims");
		try {
			test.getLogger().info("Apparent_Testcase002_VerifyClaims");
            stc_Login.login_Apparent(test);
            stc_DashBoard.clickClaims(test);
            stc_Claims.verifyClaims(test);
                     
        } 
		catch (Throwable e) 
		{
            throw (e);
        } finally 
		{
            test.tearDown();
        }
		
	}//closing TC002 method  
    //	---------------------------------------------------------------------------------------
	
	
//	TC003
	@Test(enabled = false, priority = 5, description = "Edit Mailing Address")
	@Parameters("ENV")
	
	public void TC003(String ENV) {
		
		Testing test = new Testing(ENV, brandName, "EditMailingAddress");
		try {
			test.getLogger().info("Apparent_Testcase003_EditmailingAddress");
            stc_Login.login_Apparent(test);
            stc_DashBoard.clickPersonalInfo(test);
            stc_PersonalInfo.editMailingAddress(test); 
            test.webFunctions().staticWait(8000);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
		
	}//closing TC003 method
    //	---------------------------------------------------------------------------------------
	
	
//	TC004
	@Test(enabled = false, priority = 5, description = "EditGaragingAddress")
	@Parameters("ENV")
	
	public void TC004(String ENV) {
		
		Testing test = new Testing(ENV, brandName, "EditGaragingAddress");
		try {
			test.getLogger().info("Apparent_Testcase004_EditGaragingAddress");
            stc_Login.login_Apparent(test);
            stc_DashBoard.clickPersonalInfo(test);
            stc_PersonalInfo.editGaragingAddress(test);  
            stc_editCoverage.updateGaragingAddCoverage(test);
            
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
		
	}//closing TC004 method
    //	---------------------------------------------------------------------------------------
	
 
//	TC005
	@Test(enabled = false, priority = 5, description = "Edit Email Address")
	@Parameters("ENV")
	
	public void TC005(String ENV) {
		
		Testing test = new Testing(ENV, brandName, "EditEmail");
		try {
			test.getLogger().info("Apparent_Testcase005_EditEmail");
            stc_Login.login_Apparent(test);
            stc_DashBoard.clickPersonalInfo(test);
            stc_PersonalInfo.editEmail(test);            
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
		
	}//closing TC005 method
//	---------------------------------------------------------------------------------------
	
	 //	TC012
    @Test(enabled = true, priority = 5, description = "Edit Home Phone Number")
    @Parameters("ENV")
    public void TC012(String ENV) {

        Testing test = new Testing(ENV, brandName, "EditHomePhoneNumber");
        try {
            stc_Login.login(test);
            stc_DashBoard.clickPersonalInfo(test);
            stc_PersonalInfo.editHomePhoneNumber(test);

        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
    }//closing TC012 method
//	---------------------------------------------------------------------------------------
    
    
    //	TC013
    @Test(enabled = true, priority = 5, description = "Edit Work Phone Number")
    @Parameters("ENV")
    public void TC013(String ENV) {

        Testing test = new Testing(ENV, brandName, "EditWorkPhoneNumber");
        try {
            stc_Login.login(test);
            stc_DashBoard.clickPersonalInfo(test);;
            stc_PersonalInfo.editWorkPhoneNumber(test);

        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
    }//closing TC013 method
    //	---------------------------------------------------------------------------------------

    
    //	TC014
    @Test(enabled = true, priority = 5, description = "Edit Cell Phone Number")
    @Parameters("ENV")
    public void TC014(String ENV) {

        Testing test = new Testing(ENV, brandName, "EditCellPhoneNumber");
        try {
            stc_Login.login(test);
            stc_DashBoard.clickPersonalInfo(test);;
            stc_PersonalInfo.editCellPhoneNumber(test);

        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
    }//closing TC014 method
     //	---------------------------------------------------------------------------------------
}