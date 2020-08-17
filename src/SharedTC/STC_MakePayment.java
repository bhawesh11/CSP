package SharedTC;

        import ApplicationPages.MakePayment;
        import org.openqa.selenium.support.PageFactory;
        import resources.Testing;

public class STC_MakePayment {

    public void pay10FromSavedCard(Testing test) {
        test.setPage(MakePayment.class);
        MakePayment makePayment = (MakePayment) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, makePayment.btn_OtherAmount);
        test.webFunctions().type(test, makePayment.textBox_PaymentAmount, "10");
        test.webFunctions().click(test, makePayment.btn_SavedPaymentMethod);
        test.getLogger().info("Clicked Saved Payment Instrument to initiate Payment");
        test.webFunctions().click(test, makePayment.btn_ReviewPayment);
        test.getLogger().info("Clicked to Review Payment.");
    }
    
    public void payFromNewCard(Testing test) {
        test.setPage(MakePayment.class);
        MakePayment makePayment = (MakePayment) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, makePayment.btn_OtherAmount);
        test.webFunctions().type(test, makePayment.textBox_PaymentAmount, test.getTestData("CardDetails.PaymentAmount"));
        test.webFunctions().click(test, makePayment.btn_NewCreditCard);
        test.getLogger().info("Clicked New Credit Card Payment Instrument to initiate Payment");
        test.webFunctions().type(test, makePayment.textBox_NewCC_FirstName,test.getTestData("CardDetails.FirstName"));
        test.webFunctions().type(test, makePayment.textBox_NewCC_LastName,test.getTestData("CardDetails.LastName"));
        test.webFunctions().type(test, makePayment.textBox_NewCC_CardNumber,test.getTestData("CardDetails.Mastercard"));
        test.webFunctions().click(test, makePayment.dropdown_NewCC_ExpirationMonth);
        
        test.webFunctions().click(test, makePayment.select_NewCC_ExpirationMonth,test.getTestData("CardDetails.ExpiryMonth"));
        test.webFunctions().click(test, makePayment.dropdown_NewCC_ExpirationYear);
        
        test.webFunctions().click(test, makePayment.select_NewCC_ExpirationYear,test.getTestData("CardDetails.ExpiryYear"));
        test.webFunctions().click(test, makePayment.btn_NewCC_SaveCard_No);
        test.webFunctions().type(test, makePayment.textbox_NewCC_Nickname,test.getTestData("CardDetails.Nickname"));
        test.webFunctions().click(test, makePayment.checkbox_NewCC_MakeDefault);   
        test.getLogger().info("Made Payment instrument as default .");
        test.webFunctions().click(test, makePayment.btn_ReviewPayment);
        test.getLogger().info("Clicked to Review Payment.");
    }
    
    public void pay10FromNewBankAccount(Testing test) {
        test.setPage(MakePayment.class);
        MakePayment makePayment = (MakePayment) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, makePayment.btn_OtherAmount);
        test.webFunctions().type(test, makePayment.textBox_PaymentAmount, "12");
        test.webFunctions().click(test, makePayment.btn_NewACH);
        test.getLogger().info("Clicked New BANK ACCOUNT Payment Instrument to initiate Payment");
        test.webFunctions().type(test, makePayment.textBox_NewACH_FirstName,test.getTestData("ACHDetails.FirstName"));
        test.webFunctions().type(test, makePayment.textBox_NewACH_LastName,test.getTestData("ACHDetails.LastName"));
        test.webFunctions().click(test, makePayment.btn_NewACH_SavingsAccount);
        test.webFunctions().type(test, makePayment.textBox_NewACH_RoutingNumber,test.getTestData("ACHDetails.RoutingNumber"));
        test.webFunctions().type(test, makePayment.textBox_NewACH_AccountNumber,test.getTestData("ACHDetails.AccountNumber"));
        
        test.webFunctions().click(test, makePayment.btn_NewACH_SaveAccount_No);
        test.webFunctions().type(test, makePayment.textbox_NewACH_Nickname,test.getTestData("ACHDetails.Nickname"));
        test.webFunctions().click(test, makePayment.checkbox_NewACH_MakeDefault);   
        test.getLogger().info("Made Payment instrument as default .");
        test.webFunctions().click(test, makePayment.btn_ReviewPayment);
        test.getLogger().info("Clicked to Review Payment.");
    }
}