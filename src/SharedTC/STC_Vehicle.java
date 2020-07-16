package SharedTC;

import ApplicationPages.BindConfirmation;
import ApplicationPages.CoverageSelections;
import ApplicationPages.DashBoard;
import ApplicationPages.Driver;
import ApplicationPages.EditVehicleCoverage;
import ApplicationPages.QuoteReview;
import ApplicationPages.Vehicle;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_Vehicle {

    // *****************************************Add Vehicle****************************************************
    public void aboutVehicle(Testing test) {

        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());

        test.webFunctions().click(test, vehicle.dropdown_VehicleYear);
        test.webFunctions().click(test, vehicle.dropdown_MultiselectDropdown, test.getTestData("AddVehicle.AboutVehicle.VehicleYear"));
        test.webFunctions().click(test,vehicle.dropdown_VehicleMake);
        test.webFunctions().click(test, vehicle.dropdown_MultiselectDropdown, test.getTestData("AddVehicle.AboutVehicle.VehicleMake"));
        test.webFunctions().click(test,vehicle.dropdown_VehicleModel);
        test.webFunctions().click(test, vehicle.dropdown_MultiselectDropdown, test.getTestData("AddVehicle.AboutVehicle.VehicleModel"));
        test.webFunctions().click(test,vehicle.dropdown_BodyType);
        test.webFunctions().click(test, vehicle.dropdown_MultiselectDropdown, test.getTestData("AddVehicle.AboutVehicle.VehicleBodyType"));
        test.webFunctions().click(test, vehicle.btn_ReplacingYourVehicle, test.getTestData("AddVehicle.AboutVehicle.ReplacingYourVehicle1"), test.getTestData("AddVehicle.AboutVehicle.ReplacingYourVehicle2"));
        test.webFunctions().click(test, vehicle.btn_Next);
    }
    public void moreAboutVehicle(Testing test){

        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());

        test.webFunctions().staticWait(40);
        try{
            if(vehicle.btn_RidesharingNo.isDisplayed()==true){
                test.webFunctions().click(test,vehicle.btn_RidesharingNo); }
        }catch(Exception e) {
        }
        test.webFunctions().click(test, vehicle.btn_PrimarilyUseAndYear,test.getTestData("AddVehicle.AboutVehicle.PrimarlyUse"));
        test.webFunctions().click(test, vehicle.dropdown_AnnualMileage);
        test.webFunctions().click(test,vehicle.dropdown_MultiselectDropdown,test.getTestData("AddVehicle.AboutVehicle.AnnualMileage"));
        test.webFunctions().click(test, vehicle.dropdown_WhereDoYouPark);
        test.webFunctions().click(test,vehicle.dropdown_MultiselectDropdown,test.getTestData("AddVehicle.AboutVehicle.WhereYouPark"));
        test.webFunctions().click(test, vehicle.btn_PrimarilyUseAndYear,test.getTestData("AddVehicle.AboutVehicle.Year"));
        test.webFunctions().click(test, vehicle.dropdown_WhatMonth);
        test.webFunctions().click(test,vehicle.dropdown_MultiselectDropdown,test.getTestData("AddVehicle.AboutVehicle.Month"));
        test.webFunctions().click(test, vehicle.btn_ExistingDamage,test.getTestData("AddVehicle.AboutVehicle.ExistingDamage"));
        try{
            if(vehicle.btn_CustomEquipmentNo.isDisplayed()==true){
                test.webFunctions().click(test,vehicle.btn_CustomEquipmentNo);
            }
        }catch(Exception e) {
        }
        test.webFunctions().click(test, vehicle.btn_MakePaymentsonThisVehilce,test.getTestData("AddVehicle.AboutVehicle.MakePayment"));
        test.webFunctions().staticWait(40);
        try
        {
            if(vehicle.btn_YourPrimaryVehicle.isDisplayed()== true)
            {
                test.webFunctions().click(test,vehicle.btn_YourPrimaryVehicle);
            }
        }
        catch(Exception e) {
        }
        test.webFunctions().click(test, vehicle.btn_ContinuetoQuote);
        test.webFunctions().staticWait(80);
    }

    public void addDriverToVehicle(Testing test)
    {
        test.setPage(Driver.class);
        Driver addingdriver = (Driver) PageFactory.initElements(test.driver, test.getPage());

        //NEXT PAGE : Tell us about the driver

        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        test.webFunctions().click(test,addingdriver.btn_LikeToAddNewDriver,test.getTestData("AddVehicle.AddDriverToVehicle.AddDriverButton"));
        test.webFunctions().click(test,addingdriver.btn_Continue);

        test.webFunctions().type(test, addingdriver.textbox_FirstName, test.getTestData("AddVehicle.AddDriverToVehicle.FirstName"));
        test.webFunctions().type(test, addingdriver.textbox_LastName, test.getTestData("AddVehicle.AddDriverToVehicle.LastName"));
        test.webFunctions().type(test, addingdriver.textbox_DOB, test.getTestData("AddVehicle.AddDriverToVehicle.DOB"));
        test.webFunctions().click(test, addingdriver.btn_SelectMale);
        test.webFunctions().click(test,addingdriver.btn_selectvalues,test.getTestData("AddVehicle.AddDriverToVehicle.Relationship"));
        test.webFunctions().click(test,addingdriver.btn_selectvalues,test.getTestData("AddVehicle.AddDriverToVehicle.MaritalStatus"));
        test.webFunctions().click(test,addingdriver.btn_selectvalues,test.getTestData("AddVehicle.AddDriverToVehicle.ValidLicense"));
        test.webFunctions().click(test,addingdriver.btn_selectvalues,test.getTestData("AddVehicle.AddDriverToVehicle.AgeFirstLicensed"));
        test.webFunctions().click(test, addingdriver.dropdown_PrimaryVehicle);
        test.webFunctions().click(test, addingdriver.dropdown_FirstVehicle);
        test.webFunctions().type(test, addingdriver.textbox_DriverLicenseNumber, test.getTestData("AddVehicle.AddDriverToVehicle.LicenseNumber"));
        test.webFunctions().click(test,addingdriver.dropdown_DriverLicenseState);
        test.webFunctions().click(test, addingdriver.dropdown_SelectState, test.getTestData("AddVehicle.AddDriverToVehicle.LicenseState"));
        test.webFunctions().click(test, addingdriver.btn_CurentlyStudentNo);
        test.webFunctions().click(test, addingdriver.btn_Continue);
    }

    public void addDriverToVehicleNo(Testing test)
    {
        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());
        try { Thread.sleep(10000); } catch (InterruptedException e) { e.printStackTrace(); }
        test.webFunctions().click(test,vehicle.btn_LikeToAddNewDriver,test.getTestData("AddVehicle.ReplaceVehicle.AddDriverNo"));
        test.webFunctions().click(test,vehicle.btn_Continue);
    }
    public void whoOperatesVehicle(Testing test) {
        test.setPage(Driver.class);
        Driver addingdriver = (Driver) PageFactory.initElements(test.driver, test.getPage());

        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());

        //NEXT PAGE : Who operates the vehicle most?
        try { Thread.sleep(8000); } catch (InterruptedException e) { e.printStackTrace(); }
        test.webFunctions().click(test,vehicle.btn_selectdriver,test.getTestData("AddVehicle.AboutVehicle.Vehicle"),test.getTestData("AddVehicle.AboutVehicle.DriverName"));
        test.webFunctions().click(test, addingdriver.btn_Continue);
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        test.webFunctions().click(test,addingdriver.btn_Continue);
    }

    public void whoOperatesVehiclewithVin(Testing test){
        test.setPage(Driver.class);
        Driver addingdriver = (Driver) PageFactory.initElements(test.driver, test.getPage());

        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());

        try { Thread.sleep(8000); } catch (InterruptedException e) { e.printStackTrace(); }
        test.webFunctions().click(test, addingdriver.btn_VehicleOperatorNewDriver);test.webFunctions().click(test, addingdriver.btn_Continue);
        test.webFunctions().click(test,vehicle.btn_selectdriver,test.getTestData("AddVehicle.AboutVehicle.Vehicle2"),test.getTestData("AddVehicle.AboutVehicle.DriverName"));
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        test.webFunctions().click(test,addingdriver.btn_Continue);

    }
    public void whoOperatesVehicleForRemoveVehicle(Testing test){
        test.setPage(Driver.class);
        Driver addingdriver = (Driver) PageFactory.initElements(test.driver, test.getPage());

        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());

        try { Thread.sleep(8000); } catch (InterruptedException e) { e.printStackTrace(); }
        test.webFunctions().click(test,vehicle.btn_selectdriver,test.getTestData("AddVehicle.ReplaceVehicle.Vehicle"),test.getTestData("AddVehicle.ReplaceVehicle.DriverName"));
        test.webFunctions().click(test, addingdriver.btn_Continue);
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        test.webFunctions().click(test,addingdriver.btn_Continue);
    }
    public void addVehicle_Vin(Testing test)
    {

        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, vehicle.txt_VinNo,test.getTestData("AddVehicle.AboutVehicle.VinNo"));

        test.webFunctions().click(test, vehicle.btn_ReplacingYourVehicle, test.getTestData("AddVehicle.AboutVehicle.ReplacingYourVehicle1"), test.getTestData("AddVehicle.AboutVehicle.ReplacingYourVehicle2"));
        test.webFunctions().click(test, vehicle.btn_Next);
        try{
            if(vehicle.btn_RidesharingNo.isDisplayed()==true){
                test.webFunctions().click(test,vehicle.btn_RidesharingNo); }
        }catch(Exception e) {
        }
        test.webFunctions().click(test, vehicle.btn_PrimarilyUseAndYear,test.getTestData("AddVehicle.AboutVehicle.PrimarlyUse"));
        test.webFunctions().click(test, vehicle.dropdown_AnnualMileage);
        test.webFunctions().click(test,vehicle.dropdown_MultiselectDropdown,test.getTestData("AddVehicle.AboutVehicle.AnnualMileage"));
        test.webFunctions().click(test, vehicle.dropdown_WhereDoYouPark);
        test.webFunctions().click(test,vehicle.dropdown_MultiselectDropdown,test.getTestData("AddVehicle.AboutVehicle.WhereYouPark"));
        test.webFunctions().click(test, vehicle.btn_PrimarilyUseAndYear,test.getTestData("AddVehicle.AboutVehicle.Year"));
        test.webFunctions().click(test, vehicle.dropdown_WhatMonth);
        test.webFunctions().click(test,vehicle.dropdown_MultiselectDropdown,test.getTestData("AddVehicle.AboutVehicle.Month"));
        test.webFunctions().click(test, vehicle.btn_ExistingDamage,test.getTestData("AddVehicle.AboutVehicle.ExistingDamage"));
        try{
            if(vehicle.btn_CustomEquipmentNo.isDisplayed()==true){
                test.webFunctions().click(test,vehicle.btn_CustomEquipmentNo);
            }
        }catch(Exception e) {
        }
        test.webFunctions().click(test, vehicle.btn_MakePaymentsonThisVehilce,test.getTestData("AddVehicle.AboutVehicle.MakePayment"));
        test.webFunctions().staticWait(40);
        try
        {
            if(vehicle.btn_YourPrimaryVehicle.isDisplayed()== true)
            {
                test.webFunctions().click(test,vehicle.btn_YourPrimaryVehicle);
            }
        }
        catch(Exception e){
        }
        test.webFunctions().click(test, vehicle.btn_ContinuetoQuote);
        test.webFunctions().click(test,vehicle.btn_LikeToAddNewDriver,test.getTestData("AddVehicle.ReplaceVehicle.AddDriverNo"));
        test.webFunctions().click(test,vehicle.btn_Continue);
    }


    public void addVehicle_Lease(Testing test)
    {
        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, vehicle.txt_VinNo,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_ReplacingYourVehicle,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_PrimarilyUseAndYear,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_AnnualMileage,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhereDoYouPark,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_PrimarilyUseAndYear,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhatMonth,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_HandsFree,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_CrashAvoidance,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_ExistingDamage,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_MakePaymentsonThisVehilce,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_IsthisaLeasedVehicle,test.getTestData(""));
        test.webFunctions().type(test, vehicle.txt_LeaseholderName,test.getTestData(""));
        test.webFunctions().type(test, vehicle.txt_Leaseholder_Street,test.getTestData(""));
        test.webFunctions().type(test, vehicle.txt_Leaseholder_City,test.getTestData(""));
        test.webFunctions().type(test, vehicle.txt_Leaseholder_PostalCode,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_ContinuetoQuote);
    }


    public void addVehicle_RideSharing(Testing test)
    {

        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_AddReplaceVehicle);
        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, vehicle.txt_VinNo,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_ReplacingYourVehicle,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_Next);
        test.webFunctions().dropdown(test, vehicle.dropdown_AnnualMileage,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhereDoYouPark,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_PrimarilyUseAndYear,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhatMonth,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_HandsFree,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_CrashAvoidance,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_ExistingDamage,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_MakePaymentsonThisVehilce,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_ContinuetoQuote);

    }

    public void replaceVehicle(Testing test)
    {
        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, vehicle.txt_VinNo,test.getTestData("AddVehicle.ReplaceVehicle.VinNo"));
        test.webFunctions().staticWait(30);
        test.webFunctions().click(test, vehicle.btn_ReplacingYourVehicle,test.getTestData("AddVehicle.ReplaceVehicle.ReplacingYourVehicle1"),test.getTestData("AddVehicle.ReplaceVehicle.ReplacingYourVehicle2"));
        try {
            if(vehicle.btn_YourPrimaryVehicle.isDisplayed()== true)
            {
                test.webFunctions().click(test,vehicle.btn_YourPrimaryVehicle);
            }
        }
        catch(Exception e){
        }
        test.webFunctions().click(test, vehicle.btn_KeepSameCoverage,test.getTestData("AddVehicle.ReplaceVehicle.KeepCoverage1"),test.getTestData("AddVehicle.ReplaceVehicle.KeepCoverage2"));
        test.webFunctions().click(test, vehicle.btn_DeActivatedtheTags,test.getTestData("AddVehicle.ReplaceVehicle.DeactivateTags1"),test.getTestData("AddVehicle.ReplaceVehicle.DeactivateTags2"));
        test.webFunctions().click(test, vehicle.btn_Next);
    }


    public void removeVehicle(Testing test)
    {
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.maximizeVehicleDetails,test.getTestData(""));
        test.webFunctions().click(test, dashBoard.btn_RemoveVehicle);
        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, vehicle.btn_DeActivatedtheTags,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_Continue_WhenRemovingVehicle);

    }
    public void editCoverage(Testing test) {
        test.setPage(Driver.class);
        Driver addingdriver = (Driver) PageFactory.initElements(test.driver, test.getPage());

        //NEXT PAGE5 : Policy Coverage
        test.setPage(CoverageSelections.class);
        CoverageSelections editcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
        //test.webFunctions().click(test, editcoverage.slider_BodilyInjury, test.getTestData("AddVehicle.EditCoverage.BodilyInjury"));
        //test.webFunctions().click(test, editcoverage.slider_PropertyDamage,test.getTestData("AddVehicle.EditCoverage.PropertyDamage") );
        test.webFunctions().click(test, addingdriver.btn_UpdateQuote);

        //NEXT PAGE6 : Policy Review
        test.webFunctions().click(test, addingdriver.btn_ReviewCoverage);

        //NEXT PAGE7 : Almost Done
        test.webFunctions().click(test, addingdriver.btn_ChangePolicy);
        try {
            if(addingdriver.btn_ok.isDisplayed()== true)
            {
                test.webFunctions().click(test,addingdriver.btn_ok);
            }
        }
        catch(Exception e){
        }
        test.getLogger().info("Driver has been Added");

    }
    public void editVehicleCoverages (Testing test) {
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.maximizeVehicleDetail,test.getTestData("VehicleDetails.Vehicle"));
        test.getLogger().info("Maximized Vehicle View");
        test.webFunctions().click(test, dashBoard.btn_EditVehicle);
        test.getLogger().info("Clicked Edit Vehicle.");
       
        test.setPage(EditVehicleCoverage.class);
        EditVehicleCoverage editVehicleCoverage = (EditVehicleCoverage) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,editVehicleCoverage.btn_SliderComprehensive,test.getTestData("VehicleDetails.CompCoverage"));
        test.webFunctions().click(test,editVehicleCoverage.btn_SliderCollision,test.getTestData("VehicleDetails.CollisionCoverage"));
        test.webFunctions().click(test,editVehicleCoverage.btn_SliderRental,test.getTestData("VehicleDetails.RentalCoverage"));
        test.webFunctions().click(test,editVehicleCoverage.chkbox_RoadsideAssistance);
        test.webFunctions().click(test,editVehicleCoverage.btn_HaveDamageNo);
        test.webFunctions().click(test,editVehicleCoverage.btn_SaveVehicles);
        test.getLogger().info("Clicked Save vehicle, navigating to Quote Review Page.");
       
        test.setPage(QuoteReview.class);
        QuoteReview quoteReview = (QuoteReview) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,quoteReview.btn_ChangePolicy);
        test.getLogger().info("Changing Vehicle coverages...");
       
        test.setPage(BindConfirmation.class);
        BindConfirmation bindConfirm = (BindConfirmation) PageFactory.initElements(test.driver, test.getPage());
               
        assertTrue(test.webFunctions().readInfo(test, bindConfirm.text_ConfirmationText).contains("Your policy has been updated."));
        test.getLogger().info("Vehicle coverages changed successfully..");
               
    }

    public void VinforVehicle(Testing test)
    {
        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());

        test.setPage(Driver.class);
        Driver addingdriver = (Driver) PageFactory.initElements(test.driver, test.getPage());

        test.webFunctions().type(test,vehicle.textbox_VIN,test.getTestData("AddVehicle.AboutVehicle.FinalVinNo"));
        test.webFunctions().click(test,vehicle.btn_saveVIN);
        try {
            if(vehicle.btn_Continue.isDisplayed()== true)
            {
                test.webFunctions().click(test,vehicle.btn_Continue);
            }
        }catch(Exception e){
        }
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
        test.webFunctions().click(test, vehicle.btn_Next);
        test.webFunctions().click(test, vehicle.btn_PrimarilyUseAndYear,test.getTestData("AddVehicle.AboutVehicle.Year"));
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        test.webFunctions().click(test, addingdriver.btn_Continue);
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
        test.webFunctions().click(test,addingdriver.btn_Continue);
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
        test.webFunctions().click(test,addingdriver.btn_Continue);
        test.webFunctions().click(test, addingdriver.btn_UpdateQuote);

        //NEXT PAGE6 : Policy Review
        test.webFunctions().click(test, addingdriver.btn_ReviewCoverage);

        //NEXT PAGE7 : Almost Done
        test.webFunctions().click(test, addingdriver.btn_ChangePolicy);

    }




}
