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
    
    public void clickPaymentMethods(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_PaymentMethods);
    }
    
    public void clickReschedulePayment(Testing test){
    	test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_Reschedule);
      }
    
    public void clickEditCoverages(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_EditCoverage);
      }
    
    public void clickAddDriver(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_AddDrivers);
      }
       
    public void clickAddReplaceVehicle(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_AddReplaceVehicle);
      }
    
    public void clickExpandPolicyVehicle(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.maximizeVehicleDetails, "2012-AUDI-A8LQUATTRO");
      }   
 }
