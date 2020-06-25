package SharedTC;

import org.openqa.selenium.support.PageFactory;

import ApplicationPages.DashBoard;
import ApplicationPages.PaymentMethods;
import resources.Testing;

public class STC_NewPaymentMethod {
	
	public void AddAchAccount(Testing test) {
        test.setPage(PaymentMethods.class);
        PaymentMethods paymentmethods = (PaymentMethods) PageFactory.initElements(test.driver, test.getPage());
        
        test.webFunctions().click(test, paymentmethods.btn_NewBankAccount);
        test.getLogger().info("Selected ACH Account option.....");
        test.webFunctions().type(test, paymentmethods.textBox_AccountHolderFirstName, test.getTestData("ACHDetails.FirstName"));
        test.webFunctions().type(test, paymentmethods.textBox_AccountHolderLastName, test.getTestData("ACHDetails.LastName"));
        test.webFunctions().type(test, paymentmethods.textBox_RoutingNumber, test.getTestData("ACHDetails.RoutingNumber"));
        test.webFunctions().type(test, paymentmethods.textBox_AccountNumber, test.getTestData("ACHDetails.AccountNumber"));
        test.webFunctions().type(test, paymentmethods.textBox_BankNickName, test.getTestData("ACHDetails.Nickname"));
   //     test.webFunctions().click(test, paymentmethods.checkBox_MakePrimaryPaymentMethod);
        test.webFunctions().click(test, paymentmethods.btn_SaveBankAccount);
        
        test.getLogger().info("ACH Account Added.....");
    }
	
	public void AddCreditCard(Testing test) {
        test.setPage(PaymentMethods.class);
        PaymentMethods paymentmethods = (PaymentMethods) PageFactory.initElements(test.driver, test.getPage());
        
        test.webFunctions().click(test, paymentmethods.btn_NewCreditCard);
        test.getLogger().info("Selected Credit Card option.....");
        test.webFunctions().type(test, paymentmethods.textBox_CardFirstName, test.getTestData("CardDetails.FirstName"));
        test.webFunctions().type(test, paymentmethods.textBox_CardLastName, test.getTestData("CardDetails.LastName"));
        test.webFunctions().type(test, paymentmethods.textBox_CardNumber, test.getTestData("CardDetails.Amex"));
        
        test.webFunctions().click(test, paymentmethods.dropdown_NewCC_ExpirationMonth);
        test.webFunctions().click(test, paymentmethods.select_NewCC_ExpirationMonth,test.getTestData("CardDetails.ExpiryMonth"));
        
        test.webFunctions().click(test, paymentmethods.dropdown_NewCC_ExpirationYear);       
        test.webFunctions().click(test, paymentmethods.select_NewCC_ExpirationYear,test.getTestData("CardDetails.ExpiryYear"));
        
        test.webFunctions().type(test, paymentmethods.textBox_txtCardNickName, test.getTestData("CardDetails.Nickname"));
      // test.webFunctions().click(test, paymentmethods.checkBox_CardMakePrimaryPaymentMethod);
        test.webFunctions().click(test, paymentmethods.btn_SaveCreditCard);
        
        test.getLogger().info("Credit Card Added.....");
    }

}
