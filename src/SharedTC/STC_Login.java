package SharedTC;

import ApplicationPages.Login;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_Login {

    public void login(Testing test){
        test.setPage(Login.class);
        Login login = (Login) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, login.textBox_Email,test.getOutput("Email"));
        test.webFunctions().type(test, login.textBox_Password,test.getOutput("Password"));
        test.webFunctions().click(test, login.btn_SignIn);
        test.getLogger().info("Logged in successfully.");
    }
}