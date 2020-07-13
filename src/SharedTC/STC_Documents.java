package SharedTC;

import org.openqa.selenium.support.PageFactory;

import ApplicationPages.DashBoard;
import ApplicationPages.Documents;
import resources.Testing;

public class STC_Documents {
	
	public void doc_LibilityInsuranceCard_Download(Testing test)
	{
		   test.setPage(Documents.class);
	       Documents documents = (Documents) PageFactory.initElements(test.driver, test.getPage());
	       test.webFunctions().click(test, documents.btn_LIBILITY_INSURANCE_CARD,test.getTestData(""));
	       test.webFunctions().click(test,documents.btn_ShareIcon,test.getTestData(""));
	       test.webFunctions().click(test,documents.btn_DownloadPDF);
	      
	}
	
	public void doc_LibilityInsuranceCard_Email(Testing test)
	{
		 
	       test.setPage(Documents.class);
	       Documents documents = (Documents) PageFactory.initElements(test.driver, test.getPage());
	       test.webFunctions().click(test, documents.btn_LIBILITY_INSURANCE_CARD,test.getTestData(""));
	       test.webFunctions().click(test,documents.btn_ShareIcon,test.getTestData(""));
	       test.webFunctions().click(test,documents.btn_Send_Via_Email);
	       test.webFunctions().type(test,documents.txt_SendEmail,test.getTestData(""));
	       test.webFunctions().click(test,documents.btn_SendEmail_Button);	      
	}
	
	public void doc_LibilityInsuranceCard_Fax(Testing test)
	{
		 
	       test.setPage(Documents.class);
	       Documents documents = (Documents) PageFactory.initElements(test.driver, test.getPage());
	       test.webFunctions().click(test, documents.btn_LIBILITY_INSURANCE_CARD,test.getTestData(""));
	       test.webFunctions().click(test,documents.btn_ShareIcon,test.getTestData(""));
	       test.webFunctions().click(test,documents.btn_Send_Via_Fax);
	       test.webFunctions().type(test,documents.txt_Send_Fax,test.getTestData(""));
	       test.webFunctions().click(test,documents.btn_SendFax_Button);	      
	}
	
	public void doc_PolicyDeclarationPage_Download(Testing test)
	{
		  
	       test.setPage(Documents.class);
	       Documents documents = (Documents) PageFactory.initElements(test.driver, test.getPage());
	       test.webFunctions().click(test, documents.btn_Policy_Declaration_Page);
	       test.webFunctions().click(test,documents.btn_DownloadPDF);      
	}
	
	public void doc_PolicyDocuments_Download(Testing test)
	{
		 
	       test.setPage(Documents.class);
	       Documents documents = (Documents) PageFactory.initElements(test.driver, test.getPage());
	       test.webFunctions().click(test, documents.btn_Policy_Documents_Page);
	       test.webFunctions().click(test,documents.btn_DownloadPDF);      
	}

}
