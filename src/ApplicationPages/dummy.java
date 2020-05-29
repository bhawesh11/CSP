package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dummy {
    @FindBy(id="txtPolicy")
    public WebElement textBox_PolicyNumber;

    @FindBy(id="txtLastName")
    public WebElement textBox_LastName;

    @FindBy(id="txtDateOfBirth")
    public WebElement textBox_DateOfBirth;

    @FindBy(id="txtZipCode")
    public WebElement textBox_ZipCode;

    @FindBy(xpath="//span[text()='Continue']/..")
    public WebElement btn_Continue;

    @FindBy(id="txtPassword")
    public WebElement textBox_Password;

    @FindBy(id="txtConfirmPassword")
    public WebElement textBox_ConfirmPassword;

    @FindBy(xpath="//*[@type='submit']")
    public WebElement btn_Register;

    String x="INSERT INTO test \n" +
            "SET \n" +
            "BrandId = (SELECT brandId FROM brand WHERE brandName='brand'), \n" +
            "DataId = (\n" +
            "SELECT d.DataId FROM application a, test t, brand b, data d, script s\n" +
            "WHERE \n" +
            "t.BrandId = b.BrandId\n" +
            "AND a.AppId =d.AppId\n" +
            "AND t.dataId = d.dataId\n" +
            "AND s.ScriptId = d.ScriptId\n" +
            "AND a.AppName='Policy Center'\n" +
            "AND s.ScriptName='script'\n" +
            "AND (brandName = 'brand' OR BrandName = NULL)),\n" +
            "Output = 'Output'";
}
