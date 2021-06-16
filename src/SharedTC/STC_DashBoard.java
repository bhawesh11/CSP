package SharedTC;

import ApplicationPages.DashBoard;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import resources.Testing;

public class STC_DashBoard {
	
	public void clickGetIDCards(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_GetIdCards);
        test.getLogger().info("Clicked on 'Get Id Cards' button on dashboard");
       
        test.getLogger().info("Expected Title : Documents    ----   Actual Title : "+ test.webFunctions().getTitle(test));
        Assert.assertEquals(test.webFunctions().getTitle(test),"Documents");
        test.getLogger().info("Assertion Passed");
     }
	
	public void clickManagePayments(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_ManagePayment);
        test.getLogger().info("Clicked on 'Manage Payment' button on dashboard");
        
        test.getLogger().info("Expected Title : Policy    ----   Actual Title : "+ test.webFunctions().getTitle(test));
        Assert.assertEquals(test.webFunctions().getTitle(test),"Policy");
        test.getLogger().info("Assertion Passed");
     }
	
	public void clickFileClaim(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_FileACliam);
        test.getLogger().info("Clicked on 'File a Claim' button on dashboard");
        test.webFunctions().switchWindow(test);
        test.getLogger().info("Expected Title : File a Claim    ----   Actual Title : "+ test.webFunctions().getTitle(test));
        Assert.assertEquals(test.webFunctions().getTitle(test),"File a Claim");
        test.getLogger().info("Assertion Passed");

     }
	
	public void clickPolicy(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_Policy);
        test.getLogger().info("Clicked on 'Policy' button on dashboard");
     }
	
	public void clickDocuments(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_Documents);
        test.getLogger().info("Clicked on 'Documents' button on dashboard");
     }
	
	public void clickClaims(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_Claims);

        test.getLogger().info("Clicked on 'Claims' button on dashboard");

     }
	
	public void clickPersonalInfo(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_PersonalInfo);

        test.getLogger().info("Clicked on 'Personal Info' button on dashboard");

     }	
	
    public void clickOneTimePayment(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_OneTimePayment);
        test.getLogger().info("Clicked on 'One-Time Payment' button on dashboard");
     }
    
    public void clickNewPaymentMethod(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_PaymentMethods);
        test.getLogger().info("Clicked on 'Payment Method' button on Dashboard.");
    }
    
    public void clickReschedulePayment(Testing test){
    	test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_Reschedule);
        test.getLogger().info("Clicked on 'Reschedule' button on dashboard");
      }
    
    public void clickEditCoverages(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_EditCoverage);
        test.getLogger().info("Clicked on 'Edit Coverage' button on dashboard");
      }
    
    public void clickAddDriver(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_AddDrivers);
        test.getLogger().info("Clicked on 'Add Drivers' button on dashboard");
      }
       
    public void clickAddReplaceVehicle(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_AddReplaceVehicle);
        test.getLogger().info("Clicked on 'Add/Replace Vehicle' button on dashboard");
      }
    
    public void clickExpandPolicyVehicle(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.maximizeVehicleDetail, "2012-AUDI-A8LQUATTRO");
        test.getLogger().info("Clicked to maximize vehicle details on dashboard");
      } 
    
    public void clickRemoveVehicle(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_RemoveVehicle);
        test.getLogger().info("Clicked on 'Remove' button in expanded vehicle details on dashboard");
      } 
    
    public void clickEditVehicle(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_EditVehicle);
        test.getLogger().info("Clicked on 'Edit' button in expanded vehicle details on dashboard");
      } 
    
    public void clickGetIDCardForVehicle(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_IDCardForVehicle);
        test.getLogger().info("Clicked on 'Get Id Cards' button in expanded vehicle details on dashboard");
      }
    
    public void clickChat(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_Chat);
        test.getLogger().info("Clicked on 'Chat' button to open chatbox");
      } 
    
    public void clickLogout(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_Logout);
        test.getLogger().info("Clicked on 'logout' button to logout from Customer portal");
      } 

      public void backToDashboard(Testing test){
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().staticWait(20);
        test.webFunctions().click(test,dashBoard.btn_BackToDashboard);
        test.webFunctions().staticWait(20);
        test.getLogger().info("Clicked on 'Close(X)' to return back to dashboard");
        
    }
}

