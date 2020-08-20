package SharedTC;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ApplicationPages.Chatbox;
import resources.Testing;

public class STC_Chatbox {
	
	public void CheckChatbox(Testing test){
        test.setPage(Chatbox.class);
        Chatbox chatbox = (Chatbox) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().switchFrame(test, chatbox.frameid_Chatbox); 
        boolean CheckElementPresence =test.webFunctions().isElementPresent(test, chatbox.textbox_YourQuestionChatbox);
        if(CheckElementPresence == true) {
        	test.getLogger().info("Chatbox is visible");
        	 } else {
        	test.getLogger().info("Chatbox is not visible"); 
        	Assert.fail();
             }         
	}
}
