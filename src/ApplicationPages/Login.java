package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

    //	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

    @FindBy(id="txtEmail")
    public WebElement textBox_Email;

    @FindBy(id="txtPassword")
    public WebElement textBox_Password;

    @FindBy(xpath="//span[text()='Sign in']/..")
    public WebElement btn_SignIn;

    @FindBy(xpath="//a[text()='Forgot password?']")
    public WebElement link_ForgotPassword;

    @FindBy(xpath="//strong[text()='Setup Online Account']/..")
    public WebElement link_SetupOnlineAccount;

}
