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
        test.webFunctions().dropdown(test, vehicle.dropdown_VehicleYear,test.getOutput(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_VehicleMake,test.getOutput(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_VehicleModel,test.getOutput(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_BodyType,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_ReplacingYourVehicle,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_Next);
        test.webFunctions().click(test, vehicle.btn_Ridesharing,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_PrimarilyUse,test.getOutput(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_AnnualMileage,test.getOutput(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhereDoYouPark,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_WhenDidYouPurchase,test.getOutput(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhatMonth,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_HandsFree,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_CrashAvoidance,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_CustomEquipments,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_ExistingDamage,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_MakePaymentsonThisVehilce,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_ContinuetoQuote);    
		
	}
	
	public void addVehicle_Vin(Testing test)
	{

        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_AddReplaceVehicle);    
        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, vehicle.txt_VinNo,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_ReplacingYourVehicle,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_Next);
        test.webFunctions().click(test, vehicle.btn_Ridesharing,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_PrimarilyUse,test.getOutput(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_AnnualMileage,test.getOutput(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhereDoYouPark,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_WhenDidYouPurchase,test.getOutput(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhatMonth,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_HandsFree,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_CrashAvoidance,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_CustomEquipments,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_ExistingDamage,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_MakePaymentsonThisVehilce,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_ContinuetoQuote);    
		
	}
	
	
	public void addVehicle_Lease(Testing test)
	{
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_AddReplaceVehicle);    
        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, vehicle.txt_VinNo,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_ReplacingYourVehicle,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_Next);
        test.webFunctions().click(test, vehicle.btn_Ridesharing,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_PrimarilyUse,test.getOutput(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_AnnualMileage,test.getOutput(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhereDoYouPark,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_WhenDidYouPurchase,test.getOutput(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhatMonth,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_HandsFree,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_CrashAvoidance,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_CustomEquipments,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_ExistingDamage,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_MakePaymentsonThisVehilce,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_IsthisaLeasedVehicle,test.getOutput(""));
        test.webFunctions().type(test, vehicle.txt_LeaseholderName,test.getOutput(""));
        test.webFunctions().type(test, vehicle.txt_Leaseholder_Street,test.getOutput(""));
        test.webFunctions().type(test, vehicle.txt_Leaseholder_City,test.getOutput(""));
        test.webFunctions().type(test, vehicle.txt_Leaseholder_PostalCode,test.getOutput(""));        
        test.webFunctions().click(test, vehicle.btn_ContinuetoQuote);    		
	}
	
	
	public void addVehicle_RideSharing(Testing test)
	{

        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_AddReplaceVehicle);    
        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, vehicle.txt_VinNo,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_ReplacingYourVehicle,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_Next);
        test.webFunctions().click(test, vehicle.btn_Ridesharing,test.getOutput(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_HowManyHoursperWeek_Ridesharing,test.getOutput(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_AnnualMileage,test.getOutput(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhereDoYouPark,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_WhenDidYouPurchase,test.getOutput(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhatMonth,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_HandsFree,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_CrashAvoidance,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_CustomEquipments,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_ExistingDamage,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_MakePaymentsonThisVehilce,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_ContinuetoQuote);    
		
	}
	
	public void replaceVehicle(Testing test)
	{
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.btn_AddReplaceVehicle);    
        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, vehicle.txt_VinNo,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_ReplacingYourVehicle,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_KeepSameCoverage,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_DeActivatedtheTags,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_Next);
        test.webFunctions().click(test, vehicle.btn_Ridesharing,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_PrimarilyUse,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_PrimarilyUse,test.getOutput(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_AnnualMileage,test.getOutput(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhereDoYouPark,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_WhenDidYouPurchase,test.getOutput(""));
        test.webFunctions().dropdown(test, vehicle.dropdown_WhatMonth,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_HandsFree,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_CrashAvoidance,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_CustomEquipments,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_ExistingDamage,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_MakePaymentsonThisVehilce,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_ContinuetoQuote); 
	}

	
	public void removeVehicle(Testing test)
	{
        test.setPage(DashBoard.class);
        DashBoard dashBoard = (DashBoard) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, dashBoard.maximizeVehicleDetails,test.getOutput(""));
        test.webFunctions().click(test, dashBoard.btn_removeVehicle);        
        test.setPage(Vehicle.class);
        Vehicle vehicle = (Vehicle) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, vehicle.btn_DeActivatedtheTags,test.getOutput(""));
        test.webFunctions().click(test, vehicle.btn_Continue_WhenRemovingVehicle);  
        
	}





}
