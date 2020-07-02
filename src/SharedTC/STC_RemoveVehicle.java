package SharedTC;

import ApplicationPages.Driver;
import ApplicationPages.RemoveVehicle;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_RemoveVehicle {
    public void removevehicle(Testing test){
        test.setPage(RemoveVehicle.class);
        RemoveVehicle removecar= (RemoveVehicle) PageFactory.initElements(test.driver, test.getPage());

        //First PAGE1 : Policy Page
        try { Thread.sleep(7000); } catch (InterruptedException e) { e.printStackTrace(); }
        test.webFunctions().click(test,removecar.btn_VehicleDetail,test.getTestData("RemoveVehicle.VehicleName"));
        test.webFunctions().click(test,removecar.btn_Remove);

        //NEXT PAGE2 : Tag Deactivitation
        test.webFunctions().click(test,removecar.btn_DeActivatedtheTags,test.getTestData("RemoveVehicle.DetactivateTags1"),test.getTestData("RemoveVehicle.DetactivateTags2"));
        test.webFunctions().click(test,removecar.btn_Continue);

        //NEXT PAGE3 : Vehicle Assignment
        try { Thread.sleep(4000); } catch (InterruptedException e) { e.printStackTrace(); }
        test.webFunctions().click(test,removecar.btn_Continue);


        //NEXT PAGE4 : Policy Coverage
        test.webFunctions().staticWait(20);
        test.webFunctions().click(test,removecar.btn_Continue);
        test.webFunctions().click(test,removecar.btn_UpdateQuote);

        //NEXT PAGE5 : Policy Review
        test.webFunctions().click(test,removecar.btn_ReviewCoverage);

        //NEXT PAGE6 : Almost Done
        test.webFunctions().click(test,removecar.btn_ChangePolicy);
        test.getLogger().info("Vehicle has been removed from the policy");


    }

}
