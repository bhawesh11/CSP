package SharedTC;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import ApplicationPages.CoverageSelections;
import resources.Testing;

        public class STC_EditCoverage {

            // *****************************************Policy Level Coverage****************************************************

            public void selectBICoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                System.out.println(test.getTestData("PolicyCoverage.BodilyInjury"));
                test.webFunctions().click(test, selectcoverage.slider_BodilyInjury,test.getTestData("PolicyCoverage.BodilyInjury"));
                test.getLogger().info("Clicked on slider to select BI Coverage");
            }

            public void selectPDCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                System.out.println(test.getTestData("PolicyCoverage.PropertyDamage"));
                test.webFunctions().click(test, selectcoverage.slider_PropertyDamage,test.getTestData("PolicyCoverage.PropertyDamage"));
                test.getLogger().info("Clicked on slider to select PD Coverage");
            }

            public void selectUMBICoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                System.out.println(test.getTestData("PolicyCoverage.MotoristBodilyInjury"));
                test.webFunctions().click(test, selectcoverage.slider_UMBI,test.getTestData("PolicyCoverage.MotoristBodilyInjury"));
                test.getLogger().info("Clicked on slider to select UMBI Coverage");
            }

            public void selectUMPDCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                System.out.println(test.getTestData("PolicyCoverage.MotoristPropertyDamage"));
                test.webFunctions().click(test, selectcoverage.slider_UMPD,test.getTestData("PolicyCoverage.MotoristPropertyDamage"));
                test.getLogger().info("Clicked on slider to select UMPD Coverage");
            }

            public void selectPIPCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.slider_PIP,test.getTestData("PolicyCoverage.PIPTexas"));
                test.getLogger().info("Clicked on slider to select PIP Coverage");
            }

            public void selectMedPayCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.slider_MedicalPayments,test.getTestData("MedicalPayment"));
                test.getLogger().info("Clicked on slider to select Medical Payment Coverage");
            }

            public void selectLegalCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.chkbox_LegalAssistance);
                test.getLogger().info("Clicked on checkbox to select Legal Assistance Coverage");
            }

            public void selectIncomeLossCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.chkbox_IncomeLoss);
                test.getLogger().info("Clicked on checkbox to select Income Loss Coverage");
            }

            public void selectEUIMCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.chkbox_EUIM_MD);
                test.getLogger().info("Clicked on checkbox to select EUIM Maryland Coverage");
            }

            // *****************************************Vehicle Level Coverage****************************************************

            public void selectComprehensiveCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.slider_Comprehensive,test.getTestData("VehicleCoverage.VehicleName"),test.getTestData("VehicleCoverage.Comprehensive"));
                test.getLogger().info("Clicked on slider to select comprehensive coverage");
            }

            public void selectCollisionCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.slider_Collision,test.getTestData("VehicleCoverage.VehicleName"),test.getTestData("VehicleCoverage.Collision"));
                test.getLogger().info("Clicked on slider to select collision coverage");
            }

            public void selectRentalCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.slider_RentalReimbursement,test.getTestData("VehicleCoverage.VehicleName"),test.getTestData("VehicleCoverage.RentalReimbursement"));
                test.getLogger().info("Clicked on slider to select Rental Reimbursement coverage");
            }

            public void selectCustomEquipCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.slider_CustomEquipment,test.getTestData("VehicleCoverage.VehicleName"),test.getTestData("VehicleCoverage.CustomEqipment"));
                test.getLogger().info("Clicked on slider to select Custom Eqipment coverage");
            }
            public void selectRoadsideAssist(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.chkbox_RoadSideAssist,test.getTestData("VehicleCoverage.VehicleName"));
                test.getLogger().info("Clicked on checkbox to select RoadSide Assistance Coverage");
            }

            public void selectNoDamage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.btn_Damage_NO,test.getTestData("VehicleCoverage.VehicleName"));
                test.getLogger().info("Selected vehicle damage as 'No'");
            }

            public void selectYesDamage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.btn_Damage_Yes,test.getTestData("VehicleName"));
                test.getLogger().info("Selected vehicle damage as 'Yes'");
            }

            public void typeDamageDescription(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().type(test, selectcoverage.textbox_DamageDesc,test.getTestData("VehicleName"),test.getTestData("DamageOnDoor"));
                test.getLogger().info("Mentioned vehicle damage description in damage description box");
            }

            public void SelectLoanLeaseCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.chkbox_LoanLeasePayoff,test.getTestData("VehicleName"));
                test.getLogger().info("Clicked on checkbox to select Loan Lease Payoff Coverage");
            }

            public void SelectUpdateCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.btn_UpdateQuote);
                test.getLogger().info("Clicked on 'Update Quote' button to navigate to next page");
            }
            
            public void updateGaragingAddCoverage(Testing test)
            { 
            test.setPage(CoverageSelections.class); 
            CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage()); 
            test.webFunctions().click(test,selectcoverage.btn_ChangePolicy); 
            test.getLogger().info("Continue Button clicked successfully without making anychange on coverages. ");
            }

          }




