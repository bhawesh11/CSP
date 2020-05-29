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
        test.webFunctions().click(test, makePayment.btn_ReviewPayment);
        test.getLogger().info("Clicked to Review Payment.");
    }
}