package SharedTC;

import ApplicationPages.Login;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;


public class STC_Login {
	

    public void login(Testing test){
        test.setPage(Login.class);
        Login login = (Login) PageFactory.initElements(test.driver, test.getPage());

        //test.webFunctions().type(test, login.textBox_Email,test.getOutput("Email"));
        //test.webFunctions().type(test, login.textBox_Password,test.getOutput("Password"));

        test.webFunctions().type(test, login.textBox_Email, "lastdryrun@vvv.com");
        test.webFunctions().type(test, login.textBox_Password, "Passw0rd");
        test.webFunctions().click(test, login.btn_SignIn);
        test.getLogger().info("Login Username : lastdryrun@vvv.com");
        test.getLogger().info("Policy Number : 244-000-015-41");
      test.webFunctions().staticWait(10000);
		if (test.driver.getTitle().equals("Policy"))
			test.getLogger().info("Logged in successfully.");
		else {
			 STC_Register stc_Register = new STC_Register();
			 stc_Register.register(test);
		}
    }
    public void login2(Testing test){
        test.setPage(Login.class);
        Login login = (Login) PageFactory.initElements(test.driver, test.getPage());

        //test.webFunctions().type(test, login.textBox_Email,test.getOutput("Email"));
        //test.webFunctions().type(test, login.textBox_Password,test.getOutput("Password"));
        test.webFunctions().type(test, login.textBox_Email, "lastdryrun1@vvv.com");
        test.webFunctions().type(test, login.textBox_Password, "Passw0rd");
        test.webFunctions().click(test, login.btn_SignIn);
        test.getLogger().info("Logged in successfully.");
        test.webFunctions().staticWait(10000);
        if (test.driver.getTitle().equals("Policy"))
            test.getLogger().info("Logged in successfully.");
        else {
            STC_Register stc_Register = new STC_Register();
            stc_Register.register(test);
        }
    }


    public void claimAccountLogin(Testing test){
        test.setPage(Login.class);
        Login login = (Login) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, login.textBox_Email, "login  .com");
        test.webFunctions().type(test, login.textBox_Password, "Passw0rd");
        test.webFunctions().click(test, login.btn_SignIn);
        test.webFunctions().staticWait(8000);

        test.webFunctions().click(test, login.btn_SignIn);
      test.webFunctions().staticWait(8000);

		if (test.driver.getTitle().equals("Policy"))
			test.getLogger().info("Logged in successfully.");
		else {
			 STC_Register stc_Register = new STC_Register();
			 stc_Register.register(test);
		}
    }
    
    
    public void login_Apparent(Testing test){
        test.setPage(Login.class);
        Login login = (Login) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, login.textBox_Email, "loginap@elle.com");
        test.webFunctions().type(test, login.textBox_Password, "Passw0rd");
        test.webFunctions().click(test, login.btn_SignIn);
        test.getLogger().info("Login Username : TestzIQPywHsva@apparentinsurance.com");
        test.getLogger().info("Policy Number : 244-000-010-00");
      test.webFunctions().staticWait(7000);
		if (test.driver.getTitle().equals("Policy"))
			test.getLogger().info("Logged in successfully.");
		else {
			 STC_Register stc_Register = new STC_Register();
			 stc_Register.register(test);
		}
    } 
    
    public void clickSetupAccount(Testing test) {
    	test.setPage(Login.class);
    	Login login = (Login) PageFactory.initElements(test.driver, test.getPage());
    	test.webFunctions().click(test, login.link_SetupOnlineAccount);
    }
    
}