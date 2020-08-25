package SharedTC;

import ApplicationPages.Register;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import resources.Testing;

public class STC_Register {
    public void register(Testing test){
        test.setPage(Register.class);
        Register register = (Register) PageFactory.initElements(test.driver, test.getPage());
       //test.webFunctions().type(test, register.textBox_PolicyNumber, test.getOutput("Policy Number"));
       //test.webFunctions().type(test, register.textBox_LastName, test.getOutput("Last Name"));
       //test.webFunctions().type(test, register.textBox_DateOfBirth, test.getOutput("Date Of Birth"));
       //test.webFunctions().type(test, register.textBox_ZipCode, test.getOutput("ZIP"));
       //test.webFunctions().click(test, register.btn_Continue);
       //test.webFunctions().type(test, register.textBox_Password, test.getOutput("Password"));
       //test.webFunctions().type(test, register.textBox_ConfirmPassword, test.getOutput("Password"));
        
        test.webFunctions().type(test, register.textBox_PolicyNumber,"247-000-000-98" );
        test.getLogger().info("Policy Number : 247-000-000-98");
        test.webFunctions().type(test, register.textBox_LastName,"Gupta" );
        test.getLogger().info("Last Name : Gupta");
        test.webFunctions().type(test, register.textBox_DateOfBirth,"01/01/2000");
        test.getLogger().info("DOB : 01/01/2000");
        test.webFunctions().type(test, register.textBox_ZipCode,"20130" );
        test.getLogger().info("Zip Code : 20130");
        test.webFunctions().click(test, register.btn_Continue);
        test.webFunctions().type(test, register.textBox_Password,"Passw0rd" );
        test.webFunctions().type(test, register.textBox_ConfirmPassword, "Passw0rd");
        test.webFunctions().click(test, register.btn_Register);
        test.webFunctions().staticWait(10000);
        Assert.assertEquals(test.webFunctions().getTitle(test),"Policy");
        test.getLogger().info("Account is activated on Portal.");
    }
    
    public void goToLogin(Testing test){
    	 test.setPage(Register.class);
         Register register = (Register) PageFactory.initElements(test.driver, test.getPage());
         test.webFunctions().click(test, register.btn_Login);
    }
    
    

}
