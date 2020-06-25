package SharedTC;

import ApplicationPages.Claims;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_Claims {
    public void claims(Testing test){
        test.setPage(Claims.class);
        Claims claims = (Claims) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().readInfo(test, claims.text_ClaimNumber);
        test.webFunctions().readInfo(test, claims.text_LossDate);
        test.webFunctions().readInfo(test, claims.text_ClaimStatus);
        test.webFunctions().click(test, claims.btn_ViewClaimDetails);
        test.webFunctions().click(test, claims.btn_FileClaim);
    }

}
