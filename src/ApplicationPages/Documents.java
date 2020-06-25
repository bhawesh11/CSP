package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Documents {

    @FindBy(how= How.XPATH,using="//*[contains(@id,{0})]/following-sibling::ul/li/app-id-card/expandable/div/button/span/div/collapsed/h3[contains(@id,'liabilityInsuranceCard')]")
    public WebElement btn_LIBILITY_INSURANCE_CARD;
    //{0} = '2011-CHEVROLET-CRUZELS'

    @FindBy(how= How.XPATH,using="//*[contains(@id,{0})]/following-sibling::ul/li/app-id-card/expandable/div/div/div/expanded/div/button/span/fa-icon")
    public WebElement btn_ShareIcon;
    //{0} = '2011-CHEVROLET-CRUZELS'

    @FindBy(how= How.XPATH,using="//*[(text()='Download PDF')]")
    public WebElement btn_DownloadPDF;

    @FindBy(how= How.XPATH,using="//*[(text()='Send Via Email')]")
    public WebElement btn_Send_Via_Email;

    @FindBy(how= How.XPATH,using="//*[(text()='Send Via Fax')]")
    public WebElement btn_Send_Via_Fax;

    @FindBy(how= How.XPATH,using="//*[(text()='Welcome Letter')]")
    public WebElement btn_WelcomeLetter;

    @FindBy(how= How.XPATH,using="//*[(text()='Policy Declarations Page')]")
    public WebElement btn_Policy_Declaration_Page;

    @FindBy(how= How.XPATH,using="//*[(text()='Payment FAQs')]")
    public WebElement btn_Payment_FAQs;

    @FindBy(how= How.XPATH,using="//*[(text()='Policy Documents')]")
    public WebElement btn_Policy_Documents_Page;

}
