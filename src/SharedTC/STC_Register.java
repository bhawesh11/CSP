package SharedTC;

import ApplicationPages.Register;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_Register {
    public void login(Testing test){
        test.setPage(Register.class);
        Register register = (Register) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, register.textBox_PolicyNumber,test.getOutput("PolicyNumber"));
        test.webFunctions().type(test, register.textBox_LastName,test.getOutput("LastName"));
        test.webFunctions().type(test, register.textBox_DateOfBirth,test.getOutput("DateOfBirth"));
        test.webFunctions().type(test, register.textBox_ZipCode,test.getOutput("Zip"));
        test.webFunctions().click(test, register.btn_Continue);
        test.webFunctions().type(test, register.textBox_Password,test.getOutput("Password"));
        test.webFunctions().type(test, register.textBox_Password,test.getOutput("Password"));
        test.webFunctions().click(test, register.btn_Register);
        test.getLogger().info("Account is activated.");
    }

}
