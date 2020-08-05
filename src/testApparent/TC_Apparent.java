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
    STC_NewPaymentMethod stc_newpaymentmethod = new STC_NewPaymentMethod();
    STC_Vehicle stc_vehicle = new STC_Vehicle();
    STC_AddDriver stc_addDriver = new STC_AddDriver();
    STC_RemoveVehicle stc_removeVehicle = new STC_RemoveVehicle();

    // ==============================================================================================
    // ***_TEST_CASES_***

    //	TC001
    @Test(enabled = true, priority = 5, description = "$10 Payment - Saved Card")
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


//	==============================================================================================

    //	TC002
    @Test(enabled =true, priority = 5, description = "Validate OneTimePayment_New Credit Card")
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
    @Test(enabled = true, priority = 5, description = "Validate OneTimePayment_New ACH/Bank Account")
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
    @Test(enabled = true, priority = 5, description = "Add new payment Method - ACH")
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
    @Test(enabled = true, priority = 5, description = "Add new payment Method - Credit Card")
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

    // Script will run if there is only one driver and one vehicle in the policy
    //TC006
    @Test(enabled = true, priority = 5, description = "Add Driver without vehicle")
    @Parameters("ENV")
    public void TC006(String ENV) {

        Testing test = new Testing(ENV, brandName, "AddDriver_NoVehicle");
        try {
            stc_Login.login(test);
            stc_DashBoard.clickAddDriver(test);
            stc_addDriver.aboutDriver(test);
            stc_addDriver.addVehicleNo(test);
            stc_addDriver.whoOperatesVehicle(test);
            stc_addDriver.editCoverage(test);
            stc_DashBoard.backToDashboard(test);
        }catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
    }//closing TC006 method6

    //---------------------------------------------------------------------------------------
    // Scipt will run if there is only one driver and one vehicle in the policy
    //TC007
    @Test(enabled = true, priority = 5, description = "Add Driver with New Vehicle")
    @Parameters("ENV")
    public void TC007(String ENV) {

        Testing test = new Testing(ENV, brandName, "AddDriver_WithVehicle");
        try {
            stc_Login.login(test);
            stc_DashBoard.clickAddDriver(test);
            stc_addDriver.aboutDriverwithvehicle(test);
            stc_addDriver.addVehicleYes(test);
            stc_addDriver.editCoverage(test);
            stc_DashBoard.backToDashboard(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
    }//closing TC007 method
    // 	---------------------------------------------------------------------------------------
    // Scipt will run if there is only one driver and one vehicle in the policy
    //TC008
    @Test(enabled = true, priority = 5, description = "AddVehicle without VIN")
    @Parameters("ENV")
    public void TC008(String ENV) {

        Testing test = new Testing(ENV, brandName, "AddVehicle_WithoutVIN");
        try {
            stc_Login.login(test);
            stc_DashBoard.clickAddReplaceVehicle(test);
            stc_vehicle.aboutVehicle(test);
            stc_vehicle.moreAboutVehicle(test);
            stc_vehicle.addDriverToVehicle(test);
            stc_vehicle.whoOperatesVehicle(test);
            stc_vehicle.editCoverage(test);
            stc_vehicle.VinforVehicle(test);
            stc_DashBoard.backToDashboard(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
    }//closing TC008 method
    //	---------------------------------------------------------------------------------------
    // Scipt will run if there is only one driver and one vehicle in the policy
    //TC009
    @Test(enabled = true, priority = 5, description = "AddVehicle with VIN")
    @Parameters("ENV")
    public void TC009(String ENV) {

        Testing test = new Testing(ENV, brandName, "AddVehicle_WithVIN");
        try {
            stc_Login.login2(test);
            stc_DashBoard.clickAddReplaceVehicle(test);
            stc_vehicle.addVehicle_Vin(test);
            stc_vehicle.whoOperatesVehiclewithVin(test);
            stc_addDriver.editCoverage(test);
            stc_DashBoard.backToDashboard(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
    }//closing TC009 method
    //	---------------------------------------------------------------------------------------
    // Scipt will run if there is only one driver and one vehicle in the policy
    //TC010
    @Test(enabled = true, priority = 5, description = "Replace Vehicle")
    @Parameters("ENV")
    public void TC010(String ENV) {

        Testing test = new Testing(ENV, brandName, "ReplaceVehicle");
        try {
            stc_Login.login2(test);
            stc_DashBoard.clickAddReplaceVehicle(test);
            stc_vehicle.replaceVehicle(test);
            stc_vehicle.moreAboutVehicle(test);
            stc_vehicle.addDriverToVehicleNo(test);
            stc_vehicle.whoOperatesVehiclewithVin(test);
            stc_addDriver.editCoverage(test);
            stc_DashBoard.backToDashboard(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
    }//closing TC010 method
    //	---------------------------------------------------------------------------------------
    // To remove vehicle you have to pass the exact vehicle name
    //TC011
    @Test(enabled = true, priority = 5, description = "Remove Vehicle")
    @Parameters("ENV")
    public void TC011(String ENV) {

        Testing test = new Testing(ENV, brandName, "RemoveVehicle");
        try{
            stc_Login.login2(test);
            stc_removeVehicle.removevehicle(test);
            stc_DashBoard.backToDashboard(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
    }//closing TC011 method
    //	---------------------------------------------------------------------------------------

    //TC012
    @Test(enabled = true, priority = 5, description = "Verify Claims")
    @Parameters("ENV")
    public void TC012(String ENV) {

        Testing test = new Testing(ENV, brandName, "VerifyClaims");
        try {
            stc_Login.login(test);
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

    }//closing TC012 method
    //	---------------------------------------------------------------------------------------



    //	TC013
    @Test(enabled = true, priority = 5, description = "Edit Mailing Address")
    @Parameters("ENV")

    public void TC013(String ENV) {

        Testing test = new Testing(ENV, brandName, "EditMailingAddress");
        try {
            stc_Login.login(test);
            stc_DashBoard.clickPersonalInfo(test);
            stc_PersonalInfo.editMailingAddress(test);
            test.webFunctions().staticWait(8000);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }

    }//closing TC013 method
    //	---------------------------------------------------------------------------------------


    //	TC014
    @Test(enabled = true, priority = 5, description = "EditGaragingAddress")
    @Parameters("ENV")

    public void TC014(String ENV) {

        Testing test = new Testing(ENV, brandName, "EditGaragingAddress");
        try {
            stc_Login.login_Apparent(test);
            stc_DashBoard.clickPersonalInfo(test);
            stc_PersonalInfo.editGaragingAddress(test);
            stc_editCoverage.updateGaragingAddCoverage(test);

        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }

    }//closing TC014 method
    //	---------------------------------------------------------------------------------------



    //	TC015
    @Test(enabled = true, priority = 5, description = "Edit Email Address")
    @Parameters("ENV")

    public void TC015(String ENV) {

        Testing test = new Testing(ENV, brandName, "EditEmail");
        try {
            stc_Login.login(test);
            stc_DashBoard.clickPersonalInfo(test);
            stc_PersonalInfo.editEmail(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
    }//closing TC015 method
//	---------------------------------------------------------------------------------------	
    
//	TC016
    @Test(enabled = true, priority = 5, description = "Edit Home Phone Number")
    @Parameters("ENV")
    public void TC016(String ENV) {

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
    }//closing TC016 method
//	---------------------------------------------------------------------------------------


    //	TC017
    @Test(enabled = true, priority = 5, description = "Edit Work Phone Number")
    @Parameters("ENV")
    public void TC017(String ENV) {

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
    }//closing TC017 method
    //	---------------------------------------------------------------------------------------


    //	TC018
    @Test(enabled = true, priority = 5, description = "Edit Cell Phone Number")
    @Parameters("ENV")
    public void TC018(String ENV) {

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
    }//closing TC018 method
    //	---------------------------------------------------------------------------------------

//	TC019
	@Test(enabled = true, priority = 5, description = "Edit Email Address")
	@Parameters("ENV")
	
	public void TC019(String ENV) {
		
		Testing test = new Testing(ENV, brandName, "EditEmail");
		try {
			stc_Login.login_Apparent(test);
            stc_DashBoard.clickPersonalInfo(test);
            stc_PersonalInfo.editEmail(test);            
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
	}//closing TC019 method

	
//	---------------------------------------------------------------------------------------	
	

//	TC0020
  @Test(enabled = true, priority = 5, description = "Edit Mailing Address")
	@Parameters("ENV")
	
	public void TC020(String ENV) {
		
		Testing test = new Testing(ENV, brandName, "EditMailingAddress");
		try {
			stc_Login.login_Apparent(test);
            stc_DashBoard.clickPersonalInfo(test);
            stc_PersonalInfo.editMailingAddress(test); 
            test.webFunctions().staticWait(8000);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
		
	}//closing TC020 method
//	---------------------------------------------------------------------------------------
	

//	TC021
	@Test(enabled = true, priority = 5, description = "EditGaragingAddress")
	@Parameters("ENV")
	
	public void TC021(String ENV) {
		
		Testing test = new Testing(ENV, brandName, "EditGaragingAddress");
		try {
			stc_Login.login_Apparent(test);
            stc_DashBoard.clickPersonalInfo(test);
            stc_PersonalInfo.editGaragingAddress(test);  
            stc_editCoverage.updateGaragingAddCoverage(test);
            
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
		
	}//closing TC021 method
//	---------------------------------------------------------------------------------------
	
	//TC022
		@Test(enabled = true, priority = 5, description = "Verify Claims")
		@Parameters("ENV")
		
		public void TC022(String ENV) {
			
			Testing test = new Testing(ENV, brandName, "VerifyClaims");
			try {
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
			
		}//closing TC022 method
//	---------------------------------------------------------------------------------------
}