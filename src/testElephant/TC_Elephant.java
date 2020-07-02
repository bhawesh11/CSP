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
    STC_AddDriver stc_addDriver =  new STC_AddDriver();
    STC_EditCoverage stc_editCoverage= new STC_EditCoverage();
    STC_Vehicle stc_vehicle= new STC_Vehicle();
    STC_RemoveVehicle stc_removeVehicle=new STC_RemoveVehicle();

    STC_Vehicle stc_Vehicle = new STC_Vehicle();


    //	==============================================================================================
    //	==============================================================================================
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

    //TC006
    @Test(enabled = false, priority = 5, description = "Add Driver without vehicle")
    @Parameters("ENV")
    public void TC006(String ENV) {

        Testing test = new Testing(ENV, brandName, "AddDriver");
        try {
            stc_Login.login(test);
            stc_DashBoard.addDriverBtn(test);
            stc_addDriver.aboutDriver(test);
            stc_addDriver.addVehicleNo(test);
            stc_addDriver.whoOperatesVehicle(test);
            stc_addDriver.editCoverage(test);
            stc_DashBoard.backToDashboard(test)
		
	}//closing TC006 method6
	

	//---------------------------------------------------------------------------------------
//	TC007
	@Test(enabled = true, priority = 5, description = "Edit Vehicle Coverages")
	@Parameters("ENV")
	public void TC007(String ENV) {
	
		Testing test = new Testing(ENV, brandName, "EditVehicleCoverages");
		try {
            stc_Login.login(test);
            stc_Vehicle.editVehicleCoverages(test);

        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }

    }//closing TC007 method

    //TC008
    @Test(enabled = false, priority = 5, description = "Add Driver without vehicle")
    @Parameters("ENV")
    public void TC006(String ENV) {

        Testing test = new Testing(ENV, brandName, "AddDriver");
        try {
            stc_Login.login(test);
            stc_DashBoard.addDriverBtn(test);
            stc_addDriver.aboutDriver(test);
            stc_addDriver.addVehicleNo(test);
            stc_addDriver.whoOperatesVehicle(test);
            stc_addDriver.editCoverage(test);
            stc_DashBoard.backToDashboard(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }

    }//closing TC008 method
    //	---------------------------------------------------------------------------------------

    //TC009
    @Test(enabled = false, priority = 5, description = "Add Driver with New Vehicle")
    @Parameters("ENV")
    public void TC009(String ENV) {

        Testing test = new Testing(ENV, brandName, "AddDriver");
        try {
            stc_Login.login(test);
            stc_DashBoard.addDriverBtn(test);
            stc_addDriver.aboutDriver(test);
            stc_addDriver.addVehicleYes(test);
            stc_addDriver.editCoverage(test);
            stc_DashBoard.backToDashboard(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
    }//closing TC009 method
    // 	---------------------------------------------------------------------------------------

    //TC010
    @Test(enabled = false, priority = 5, description = "Edit Coverage")
    @Parameters("ENV")
    public void TC010(String ENV) {

        Testing test = new Testing(ENV, brandName, "EditCoverage");
        try {
            stc_Login.login(test);
            stc_DashBoard.editCoverage(test);
            stc_editCoverage.selectBICoverage(test);
            stc_editCoverage.selectPDCoverage(test);
            stc_editCoverage.selectUMBICoverage(test);
            stc_editCoverage.selectUMPDCoverage(test);
            stc_editCoverage.selectPIPCoverage(test);
            stc_editCoverage.selectCollisionCoverage(test);
            stc_editCoverage.selectComprehensiveCoverage(test);
            stc_editCoverage.selectRentalCoverage(test);
            stc_editCoverage.selectNoDamage(test);
            stc_editCoverage.selectCollisionCoverage2(test);
            stc_editCoverage.selectComprehensiveCoverage2(test);
            stc_editCoverage.selectRentalCoverage2(test);
            stc_editCoverage.selectNoDamage2(test);
            stc_editCoverage.updatequote(test);
            stc_DashBoard.backToDashboard(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
    }//closing TC010 method
    //	---------------------------------------------------------------------------------------

    //TC011
    @Test(enabled = false, priority = 5, description = "AddVehicle without VIN")
    @Parameters("ENV")
    public void TC011(String ENV) {

        Testing test = new Testing(ENV, brandName, "AddVehicle");
        try {
            stc_Login.login(test);
            stc_DashBoard.addReplaceVehicle(test);
            stc_vehicle.aboutVehicle(test);
            stc_vehicle.moreAboutVehicle(test);
            stc_vehicle.addDriverToVehicle(test);
            stc_vehicle.whoOperatesVehicle(test);
            stc_vehicle.editCoverage(test);
            stc_DashBoard.backToDashboard(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
    }//closing TC011 method
    //	---------------------------------------------------------------------------------------

    //TC012
    @Test(enabled = true, priority = 5, description = "AddVehicle with VIN")
    @Parameters("ENV")
    public void TC012(String ENV) {

        Testing test = new Testing(ENV, brandName, "AddVehicle");
        try {
            stc_Login.login(test);
            stc_DashBoard.addReplaceVehicle(test);
            stc_vehicle.addVehicle_Vin(test);
            stc_vehicle.editCoverage(test);
            stc_DashBoard.backToDashboard(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
    }//closing TC012 method
    //	---------------------------------------------------------------------------------------
    //TC013
    @Test(enabled = false, priority = 5, description = "Replace Vehicle")
    @Parameters("ENV")
    public void TC013(String ENV) {

        Testing test = new Testing(ENV, brandName, "AddVehicle");
        try {
            stc_Login.login(test);
            stc_DashBoard.addReplaceVehicle(test);
            stc_vehicle.replaceVehicle(test);
            stc_vehicle.moreAboutVehicle(test);
            stc_vehicle.addDriverToVehicleNo(test);
            stc_vehicle.whoOperatesVehicle(test);
            stc_vehicle.editCoverage(test);
            stc_DashBoard.backToDashboard(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
    }//closing TC013 method
    //	---------------------------------------------------------------------------------------
    //TC014
    @Test(enabled = false, priority = 5, description = "Remove Vehicle")
    @Parameters("ENV")
    public void TC014(String ENV) {

        Testing test = new Testing(ENV, brandName, "RemoveVehicle");
        try {
            stc_Login.login(test);
            stc_removeVehicle.removevehicle(test);
            stc_DashBoard.backToDashboard(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
    }//closing TC014 method
    //	---------------------------------------------------------------------------------------
}




}
