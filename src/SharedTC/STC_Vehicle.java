package SharedTC;

import ApplicationPages.DashBoard;
import ApplicationPages.Vehicle;
import org.openqa.selenium.support.PageFactory;
import resources.Testing;

public class STC_Vehicle {
	
	
	public void addVehicle(Testing test)
	{

        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_AddReplaceVehicle);    
        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().dropdown(test, vehicle.dropdown_VehicleYear,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_VehicleMake,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_VehicleModel,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_BodyType,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_ReplacingYourVehicle,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_Next);
        test.webFunctions().click(test, vehicle.btn_Ridesharing,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_PrimarilyUse,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_AnnualMileage,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhereDoYouPark,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_WhenDidYouPurchase,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhatMonth,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_HandsFree,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_CrashAvoidance,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_CustomEquipments,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_ExistingDamage,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_MakePaymentsonThisVehilce,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_ContinuetoQuote);    
		
	}
	
	public void addVehicle_Vin(Testing test)
	{

        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_AddReplaceVehicle);    
        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, vehicle.txt_VinNo,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_ReplacingYourVehicle,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_Next);
        test.webFunctions().click(test, vehicle.btn_Ridesharing,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_PrimarilyUse,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_AnnualMileage,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhereDoYouPark,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_WhenDidYouPurchase,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhatMonth,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_HandsFree,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_CrashAvoidance,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_CustomEquipments,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_ExistingDamage,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_MakePaymentsonThisVehilce,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_ContinuetoQuote);    
		
	}
	
	
	public void addVehicle_Lease(Testing test)
	{
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_AddReplaceVehicle);    
        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, vehicle.txt_VinNo,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_ReplacingYourVehicle,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_Next);
        test.webFunctions().click(test, vehicle.btn_Ridesharing,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_PrimarilyUse,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_AnnualMileage,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhereDoYouPark,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_WhenDidYouPurchase,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhatMonth,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_HandsFree,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_CrashAvoidance,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_CustomEquipments,test.getTestData(""));
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
        test.webFunctions().click(test, vehicle.btn_Ridesharing,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_HowManyHoursperWeek_Ridesharing,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_AnnualMileage,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhereDoYouPark,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_WhenDidYouPurchase,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhatMonth,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_HandsFree,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_CrashAvoidance,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_CustomEquipments,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_ExistingDamage,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_MakePaymentsonThisVehilce,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_ContinuetoQuote);    
		
	}
	
	public void replaceVehicle(Testing test)
	{
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_AddReplaceVehicle);    
        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, vehicle.txt_VinNo,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_ReplacingYourVehicle,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_KeepSameCoverage,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_DeActivatedtheTags,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_Next);
        test.webFunctions().click(test, vehicle.btn_Ridesharing,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_PrimarilyUse,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_PrimarilyUse,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_AnnualMileage,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhereDoYouPark,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_WhenDidYouPurchase,test.getTestData(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhatMonth,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_HandsFree,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_CrashAvoidance,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_CustomEquipments,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_ExistingDamage,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_MakePaymentsonThisVehilce,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_ContinuetoQuote); 
	}

	
	public void removeVehicle(Testing test)
	{
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.maximizeVehicleDetail,test.getTestData(""));
        test.webFunctions().click(test, dashBoard.btn_RemoveVehicle);        
        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, vehicle.btn_DeActivatedtheTags,test.getTestData(""));
        test.webFunctions().click(test, vehicle.btn_Continue_WhenRemovingVehicle);  
        
	}





}
