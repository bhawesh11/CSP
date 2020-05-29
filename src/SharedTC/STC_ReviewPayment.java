package SharedTC;


import ApplicationPages.ReviewPayment;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_ReviewPayment {

    public void reviewPayment(Testing test) {
        test.setPage(ReviewPayment.class);
        ReviewPayment reviewPayment = (ReviewPayment) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, reviewPayment.btn_MakePayment);
        test.getLogger().info("Attempted Payment.");
    }
}