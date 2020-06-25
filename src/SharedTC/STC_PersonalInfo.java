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
    }
    
    public void editMailingAddress(Testing test){
        test.setPage(PersonalInfo.class);
        PersonalInfo editMailing = (PersonalInfo) PageFactory.initElements(test.driver, test.getPage());        
        test.webFunctions().click(test, editMailing.btn_MailingAddress);
        test.webFunctions().type(test, editMailing.textbox_Apt, "121 Lane");
        test.webFunctions().type(test, editMailing.textbox_City, "Faridabad");
        test.webFunctions().dropdown(test, editMailing.textbox_State, "VA");
        test.webFunctions().type(test, editMailing.textbox_PostalCode, "20130");
        test.webFunctions().click(test, "editMailing.btn_ParkVehicleAtAddress", "Yes");
        test.webFunctions().click(test, "editMailing.btn_VehicleAtMailAdd", "Yes");
        test.webFunctions().dropdown(test, editMailing.dropdown_YearMovedToResidence, "2015");
        test.webFunctions().dropdown(test, editMailing.dropdown_MonthMovedToResidence, "January");
        test.webFunctions().dropdown(test, editMailing.dropdown_ResidencyStatus, "Own Home");
        test.webFunctions().click(test, editMailing.btn_ContinueMailAdd);
    }

    public void editGaragingAddress(Testing test){
        test.setPage(PersonalInfo.class);
        PersonalInfo editGaraging = (PersonalInfo) PageFactory.initElements(test.driver, test.getPage());        
        test.webFunctions().click(test, editGaraging.btn_GaragingAddress);
        test.webFunctions().type(test, editGaraging.textbox_Apt, "121 Lane");
        test.webFunctions().type(test, editGaraging.textbox_City, "Faridabad");
        test.webFunctions().dropdown(test, editGaraging.textbox_State, "VA");
        test.webFunctions().type(test, editGaraging.textbox_PostalCode, "20130");
        test.webFunctions().click(test, "editGaraging.btn_IsThisMailingAddress", "Yes");
        test.webFunctions().click(test, "editGaraging.btn_VehicleAtGaragAdd", "Yes");
        test.webFunctions().dropdown(test, editGaraging.dropdown_YearMovedToResidence, "2015");
        test.webFunctions().dropdown(test, editGaraging.dropdown_MonthMovedToResidence, "January");
        test.webFunctions().dropdown(test, editGaraging.dropdown_ResidencyStatus, "Own Home");
        test.webFunctions().click(test, editGaraging.btn_ContinueGaragAddress);
    }
    
    public void editHomePhoneNumber(Testing test){
        test.setPage(PersonalInfo.class);
        PersonalInfo editHomePhone = (PersonalInfo) PageFactory.initElements(test.driver, test.getPage());        
        test.webFunctions().click(test, editHomePhone.btn_HomePhone);
        test.webFunctions().type(test, editHomePhone.textbox_NewHomePhone, "8145682575");
        test.webFunctions().click(test, editHomePhone.btn_SaveHomePhone);
    }
    
    public void editWorkPhoneNumber(Testing test){
        test.setPage(PersonalInfo.class);
        PersonalInfo editWorkPhone = (PersonalInfo) PageFactory.initElements(test.driver, test.getPage());        
        test.webFunctions().click(test, editWorkPhone.btn_WorkPhone);
        test.webFunctions().type(test, editWorkPhone.textbox_NewWorkPhone, "8001001254");
        test.webFunctions().click(test, editWorkPhone.btn_SaveWorkPhone);
    }
    
    public void editCellPhoneNumber(Testing test){
        test.setPage(PersonalInfo.class);
        PersonalInfo editCellPhone = (PersonalInfo) PageFactory.initElements(test.driver, test.getPage());        
        test.webFunctions().click(test, editCellPhone.btn_CellPhone);
        test.webFunctions().type(test, editCellPhone.textbox_NewCellPhone, "8101458545");
        test.webFunctions().click(test, editCellPhone.btn_SaveCellPhone);
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

