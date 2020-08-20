package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Chatbox {
	
	public String frameid_Chatbox = "designstudio-iframe";
		
	 @FindBy(id="designstudio-iframe")
        public WebElement frameid_Chatbox1;

	 @FindBy(id="email")
	    public WebElement text_EmailChatbox;

	 @FindBy(xpath="(//*[@id='description'])[2]")
	    public WebElement textbox_YourQuestionChatbox;
	 
	 @FindBy(id="offline-send-email")
	    public WebElement btn_EmailUsChatbox;
  }
