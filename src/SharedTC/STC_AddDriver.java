package SharedTC;

import ApplicationPages.CoverageSelections;
import ApplicationPages.Driver;
import ApplicationPages.PaymentConfirmation;
import ApplicationPages.Vehicle;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_AddDriver {

    public void aboutDriver(Testing test) {
        test.setPage(Driver.class);
        Driver addingdriver = (Driver) PageFactory.initElements(test.driver, test.getPage());

        //NEXT PAGE : Tell us about the driver

        test.webFunctions().type(test, addingdriver.textbox_FirstName, test.getTestData("AboutDriver.FirstName"));
        test.webFunctions().type(test, addingdriver.textbox_LastName, test.getTestData("AboutDriver.LastName"));
        test.webFunctions().type(test, addingdriver.textbox_DOB, test.getTestData("AboutDriver.DOB"));
        test.webFunctions().click(test, addingdriver.btn_SelectMale);
        test.webFunctions().click(test,addingdriver.btn_relationship,test.getTestData("AboutDriver.Relationship"));
        test.webFunctions().click(test,addingdriver.btn_relationship,test.getTestData("AboutDriver.MaritalStatus"));
        test.webFunctions().click(test,addingdriver.btn_relationship,test.getTestData("AboutDriver.ValidLicense"));
        test.webFunctions().click(test,addingdriver.btn_relationship,test.getTestData("AboutDriver.AgeFirstLicensed"));
        try
        {
            if(addingdriver.dropdown_PrimaryVehicle.isDisplayed()== true)
            {

                test.webFunctions().click(test, addingdriver.dropdown_PrimaryVehicle);
                test.webFunctions().click(test, addingdriver.dropdown_FirstVehicle);
            }
        }
        catch(Exception e)
        {

        }
        test.webFunctions().type(test, addingdriver.textbox_DriverLicenseNumber, test.getTestData("AboutDriver.LicenseNumber"));
        //test.webFunctions().dropdown(test, addingdriver.dropdown_DriverLicenseState, test.getTestData("AboutDriver.LicenseState"));
        test.webFunctions().click(test, addingdriver.btn_CurentlyStudentNo);
        test.webFunctions().click(test, addingdriver.btn_Continue);

    }

    public void addVehicleNo(Testing test) {
        test.setPage(Driver.class);
        Driver addingdriver = (Driver) PageFactory.initElements(test.driver, test.getPage());

        //NEXT PAGE : Do you want to add Vehicle?- NO

        test.webFunctions().click(test, addingdriver.btn_AddVehicleNo);
        test.webFunctions().click(test, addingdriver.btn_Continue);
    }
    public void addVehicleYes(Testing test){
        test.setPage(Driver.class);
        Driver addingdriver = (Driver) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,addingdriver.btn_AddVehicleYes);
        test.webFunctions().click(test, addingdriver.btn_Continue);
        //NEXT PAGE : Do you want to add Vehicle?- Yes

        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, vehicle.txt_VinNo,test.getTestData("WannaAddVehicle.VinNo"));
        test.webFunctions().click(test, vehicle.btn_ReplacingYourVehicle,test.getTestData("WannaAddVehicle.ReplacingYourVehicle"),test.getTestData("WannaAddVehicle.ReplacingYourVehicle2"));
        test.webFunctions().click(test, vehicle.btn_Next);
        test.webFunctions().click(test, vehicle.btn_PrimarilyUseAndYear,test.getTestData("WannaAddVehicle.PrimarlyUse"));
        test.webFunctions().click(test, vehicle.dropdown_AnnualMileage);
        test.webFunctions().click(test,vehicle.dropdown_MultiselectDropdown,test.getTestData("WannaAddVehicle.AnnualMileage"));
        test.webFunctions().click(test, vehicle.dropdown_WhereDoYouPark);
        test.webFunctions().click(test,vehicle.dropdown_MultiselectDropdown,test.getTestData("WannaAddVehicle.WhereYouPark"));
        test.webFunctions().click(test, vehicle.btn_PrimarilyUseAndYear,test.getTestData("WannaAddVehicle.Year"));
        test.webFunctions().click(test, vehicle.dropdown_WhatMonth);
        test.webFunctions().click(test,vehicle.dropdown_MultiselectDropdown,test.getTestData("WannaAddVehicle.Month"));
        test.webFunctions().click(test, vehicle.btn_ExistingDamage,test.getTestData("WannaAddVehicle.ExistingDamage"));
        test.webFunctions().click(test, vehicle.btn_MakePaymentsonThisVehilce,test.getTestData("WannaAddVehicle.MakePayment"));
        test.webFunctions().click(test, vehicle.btn_ContinuetoQuote);
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
        test.webFunctions().click(test, addingdriver.btn_VehicleOperatorNewDriver);
        test.webFunctions().click(test,addingdriver.btn_VehicleOperatorOldDriver);
        test.webFunctions().click(test, addingdriver.btn_Continue);
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
        test.webFunctions().click(test,addingdriver.btn_Continue);

    }

    public void whoOperatesVehicle(Testing test) {
        test.setPage(Driver.class);
        Driver addingdriver = (Driver) PageFactory.initElements(test.driver, test.getPage());

        //NEXT PAGE : Who operates the vehicle most?
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
        test.webFunctions().click(test, addingdriver.btn_VehicleOperatorNewDriver);
        test.webFunctions().click(test, addingdriver.btn_Continue);
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        test.webFunctions().click(test,addingdriver.btn_Continue);
    }

    public void editCoverage(Testing test) {
        test.setPage(Driver.class);
        Driver addingdriver = (Driver) PageFactory.initElements(test.driver, test.getPage());

        //NEXT PAGE5 : Policy Coverage
        test.setPage(CoverageSelections.class);
        CoverageSelections editcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, editcoverage.slider_BodilyInjury, test.getTestData("EditCoverage.BodilyInjury"));
        test.webFunctions().click(test, editcoverage.slider_PropertyDamage,test.getTestData("EditCoverage.PropertyDamage") );
        test.webFunctions().click(test, addingdriver.btn_UpdateQuote);


        //NEXT PAGE6 : Policy Review
        test.webFunctions().click(test, addingdriver.btn_ReviewCoverage);

        //NEXT PAGE7 : Almost Done
        test.webFunctions().click(test, addingdriver.btn_ChangePolicy);
        test.getLogger().info("Driver has been Added Successfully");

    }


    }

