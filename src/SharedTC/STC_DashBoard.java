package SharedTC;

import ApplicationPages.DashBoard;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_DashBoard {
	
	public void clickGetIDCards(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_GetIdCards);
     }
	
	public void clickManagePayments(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_MaanagePayment);
     }
	
	public void clickFileClaim(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_FileACliam);
     }
	
	public void clickPolicy(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_Policy);
     }
	
	public void clickDocuments(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_Documents);
     }
	
	public void clickClaims(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_Claims);
        test.getLogger().info("Claim button clicked successfully");
     }
	
	public void clickPersonalInfo(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_PersonalInfo);
        test.getLogger().info("Clicked on Personal Info tab Successfully");
     }	
	
    public void clickOneTimePayment(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_OneTimePayment);
     }
    
    public void clickNewPaymentMethod(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_PaymentMethods);
        test.getLogger().info("Selected 'Payment Method' on Dashboard.");
    }
    
    // This method is duplicate so need to be deleted
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
        test.webFunctions().click(test, dashBoard.maximizeVehicleDetail, "2012-AUDI-A8LQUATTRO");
      } 
    
    public void clickRemoveVehicle(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_RemoveVehicle);
      } 
    
    public void clickEditVehicle(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_EditVehicle);
      } 
    
    public void clickGetIDCardForVehicle(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_IDCardForVehicle);
      }


    public void addDriverBtn(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,dashBoard.btn_AddDrivers);
    }
    public void editCoverage(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,dashBoard.btn_EditCoverage);
    }
    public void addReplaceVehicle(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,dashBoard.btn_AddReplaceVehicle);
    }
    public void backToDashboard(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().staticWait(20);
        test.webFunctions().click(test,dashBoard.btn_BackToDashboard);
        test.webFunctions().staticWait(20);
    }
}

