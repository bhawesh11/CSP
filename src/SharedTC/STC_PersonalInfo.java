package SharedTC;

import ApplicationPages.PersonalInfo;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_PersonalInfo {
    public void editEmail(Testing test){
        test.setPage(PersonalInfo.class);
        PersonalInfo editEmail = (PersonalInfo) PageFactory.initElements(test.driver, test.getPage());        
        test.webFunctions().click(test, editEmail.btn_Email);
        test.webFunctions().type(test, editEmail.textbox_NewEmail, "testing@bhawesh.com");
        test.webFunctions().type(test, editEmail.textbox_CurrentPassword, "Passw0rd");
        test.webFunctions().click(test, editEmail.btn_SaveEmail);
        test.webFunctions().staticWait(10000);
        test.getLogger().info("emailID updated Successfully.");
    }
    
    public void editMailingAddress(Testing test){
        test.setPage(PersonalInfo.class);
        PersonalInfo editMailing = (PersonalInfo) PageFactory.initElements(test.driver, test.getPage());        
        test.webFunctions().click(test, editMailing.btn_MailingAddress);
        test.webFunctions().type(test, editMailing.textbox_Apt, "120 Lane");
        test.webFunctions().type(test, editMailing.textbox_City, "Faridabad");        
        test.webFunctions().type(test, editMailing.textbox_PostalCode, "75001");
        test.webFunctions().click(test,editMailing.dropdown__State);
        test.webFunctions().click(test,editMailing.stateselect,"TX");
        test.webFunctions().click(test, editMailing.btn_ParkVehicleAtAddress, "false");
        test.webFunctions().click(test, editMailing.btn_ContinueMailAdd);
        test.webFunctions().staticWait(10000);
        test.getLogger().info("Mailing Address updated Successfully");
    }


    public void editGaragingAddress(Testing test){
        test.setPage(PersonalInfo.class);
        PersonalInfo editGaraging = (PersonalInfo) PageFactory.initElements(test.driver, test.getPage());        
        test.webFunctions().click(test, editGaraging.btn_GaragingAddress);
        test.webFunctions().type(test, editGaraging.textbox_Apt, "121 Lane");
        test.webFunctions().type(test, editGaraging.textbox_City, "Faridabad");
        test.webFunctions().click(test,editGaraging.dropdown__State);
        test.webFunctions().click(test,editGaraging.stateselect,"TX");
        test.webFunctions().type(test, editGaraging.textbox_PostalCode, "75001");
        test.webFunctions().click(test, editGaraging.btn_IsThisMailingAddress, "false");
        test.webFunctions().click(test, editGaraging.btn_VehicleAtGaragAdd, "true");        
        test.webFunctions().click(test,editGaraging.dropdown_YearMovedToResidence);
        test.webFunctions().click(test,editGaraging.yearselect,"2019");
        test.webFunctions().click(test,editGaraging.dropdown_MonthMovedToResidence);
        test.webFunctions().click(test,editGaraging.monthselect,"April");
        test.webFunctions().click(test, editGaraging.dropdown_ResidencyStatus);
        test.webFunctions().click(test, editGaraging.ResidencyStatusSelect,"Rent");
        test.webFunctions().click(test, editGaraging.btn_ContinueGaragAddress);
        test.webFunctions().staticWait(7000);
        test.getLogger().info("Garaging Address updated successfully");
    }
    
    public void editHomePhoneNumber(Testing test){
        test.setPage(PersonalInfo.class);
        PersonalInfo editHomePhone = (PersonalInfo) PageFactory.initElements(test.driver, test.getPage());        
        test.webFunctions().click(test, editHomePhone.btn_HomePhone);
        test.webFunctions().type(test, editHomePhone.textbox_NewHomePhone, test.getTestData("Personal.HomePhone"));
        test.webFunctions().click(test, editHomePhone.btn_SaveHomePhone);
        test.webFunctions().staticWait(15000);
    }
    
    public void editWorkPhoneNumber(Testing test){
        test.setPage(PersonalInfo.class);
        PersonalInfo editWorkPhone = (PersonalInfo) PageFactory.initElements(test.driver, test.getPage());        
        test.webFunctions().click(test, editWorkPhone.btn_WorkPhone);
        test.webFunctions().type(test, editWorkPhone.textbox_NewWorkPhone, test.getTestData("Personal.WorkPhone"));
        test.webFunctions().click(test, editWorkPhone.btn_SaveWorkPhone);
        test.webFunctions().staticWait(15000);
    }
    
    public void editCellPhoneNumber(Testing test){
        test.setPage(PersonalInfo.class);
        PersonalInfo editCellPhone = (PersonalInfo) PageFactory.initElements(test.driver, test.getPage());        
        test.webFunctions().click(test, editCellPhone.btn_CellPhone);
        test.webFunctions().type(test, editCellPhone.textbox_NewCellPhone, test.getTestData("Personal.CellPhone"));
        test.webFunctions().click(test, editCellPhone.btn_SaveCellPhone);
        test.webFunctions().staticWait(15000);
    }
    
    public void textMessageAlert(Testing test){
        test.setPage(PersonalInfo.class);
        PersonalInfo textMessageAlert = (PersonalInfo) PageFactory.initElements(test.driver, test.getPage());        
        test.webFunctions().click(test, textMessageAlert.btn_TextMessageAlerts);
        test.webFunctions().click(test, "textMessageAlert.btn_WantTextAlerts", "Yes");
        test.webFunctions().type(test, textMessageAlert.textbox_TextAlertsMobileNumber, "8101458545");
        test.webFunctions().dropdown(test, textMessageAlert.dropdown_Carrrier, "Nextel");
        test.webFunctions().click(test, textMessageAlert.btn_SaveTextAlerts);
       
    }
}

