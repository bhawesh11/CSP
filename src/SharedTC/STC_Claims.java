package SharedTC;

import ApplicationPages.Claims;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_Claims {
    public void verifyClaims(Testing test){
        test.setPage(Claims.class);
        Claims claims = (Claims) PageFactory.initElements(test.driver, test.getPage());
        String ClaimNo = test.webFunctions().readInfo(test, claims.text_ClaimNumber);
        System.out.println(ClaimNo);
        String LossDate = test.webFunctions().readInfo(test, claims.text_LossDate);
        System.out.println(LossDate);
        String ClaimStatus = test.webFunctions().readInfo(test, claims.text_ClaimStatus);
        System.out.println(ClaimStatus);
        test.webFunctions().click(test, claims.btn_ViewClaimDetails);
        test.getLogger().info("Claims verified successfully.");
       
    }

}
