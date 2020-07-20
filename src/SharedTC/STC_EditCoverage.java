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
            }

            public void selectPDCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                System.out.println(test.getTestData("PolicyCoverage.PropertyDamage"));
                test.webFunctions().click(test, selectcoverage.slider_PropertyDamage,test.getTestData("PolicyCoverage.PropertyDamage"));
            }

            public void selectUMBICoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                System.out.println(test.getTestData("PolicyCoverage.MotoristBodilyInjury"));
                test.webFunctions().click(test, selectcoverage.slider_UMBI,test.getTestData("PolicyCoverage.MotoristBodilyInjury"));
            }

            public void selectUMPDCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                System.out.println(test.getTestData("PolicyCoverage.MotoristPropertyDamage"));
                test.webFunctions().click(test, selectcoverage.slider_UMPD,test.getTestData("PolicyCoverage.MotoristPropertyDamage"));
            }

            public void selectPIPCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.slider_PIP,test.getTestData("PolicyCoverage.PIPTexas"));
            }

            public void selectMedPayCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.slider_MedicalPayments,test.getTestData("MedicalPayment"));
            }

            public void selectLegalCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.chkbox_LegalAssistance);
            }

            public void selectIncomeLossCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.chkbox_IncomeLoss);
            }

            public void selectEUIMCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.chkbox_EUIM_MD);
            }

            // *****************************************Vehicle Level Coverage****************************************************

            // *****************************************Vehicle 1 Covergae****************************************************

            public void selectComprehensiveCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.slider_Comprehensive,test.getTestData("VehicleCoverage.VehicleName"),test.getTestData("VehicleCoverage.Comprehensive"));
            }

            public void selectCollisionCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.slider_Collision,test.getTestData("VehicleCoverage.VehicleName"),test.getTestData("VehicleCoverage.Collision"));
            }

            public void selectRentalCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.slider_RentalReimbursement,test.getTestData("VehicleCoverage.VehicleName"),test.getTestData("VehicleCoverage.RentalReimbursement"));
            }

            public void selectCustomEquipCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.slider_CustomEquipment,test.getTestData("VehicleCoverage.VehicleName"),test.getTestData("VehicleCoverage.CustomEqipment"));
            }
            public void selectRoadsideAssist(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.chkbox_RoadSideAssist,test.getTestData("VehicleCoverage.VehicleName"));
            }


            public void selectNoDamage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.btn_Damage_NO,test.getTestData("VehicleCoverage.VehicleName"));
            }

            public void selectYesDamage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.btn_Damage_Yes,test.getTestData("VehicleName"));
            }

            public void typeDamageDescription(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().type(test, selectcoverage.textbox_DamageDesc,test.getTestData("VehicleName"),test.getTestData("DamageOnDoor"));
            }

            public void SelectLoanLeaseCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.chkbox_LoanLeasePayoff,test.getTestData("VehicleName"));
            }

            public void SelectUpdateCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.btn_UpdateQuote);
            }

            // *****************************************Vehicle 2 Covergae****************************************************

            public void selectComprehensiveCoverage2(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.slider_Comprehensive, test.getTestData("VehicleCoverage2.VehicleName2"),test.getTestData("VehicleCoverage2.Comprehensive2"));
            }

            public void selectCollisionCoverage2(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.slider_Collision, test.getTestData("VehicleCoverage2.VehicleName2"),test.getTestData("VehicleCoverage2.Collision2"));
            }

            public void selectRentalCoverage2(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.slider_RentalReimbursement, test.getTestData("VehicleCoverage2.VehicleName2"),test.getTestData("VehicleCoverage2.RentalReimbursement2"));
            }

            public void selectCustomEquipCoverage2(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.slider_CustomEquipment,test.getTestData("VehicleName2"),test.getTestData("CustomEqipment2"));
            }
            public void selectRoadsideAssist2(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.chkbox_RoadSideAssist,test.getTestData("VehicleName2"));
            }


            public void selectNoDamage2(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.btn_Damage_NO,test.getTestData("VehicleCoverage2.VehicleName2"));
            }

            public void selectYesDamage2(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.btn_Damage_Yes,"VehicleCoverage2.VehicleName2");
            }

            public void typeDamageDescription2(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().type(test, selectcoverage.textbox_DamageDesc, test.getTestData("VehicleName2"),test.getTestData("DamageOnDoor2"));
            }

            public void SelectLoanLeaseCoverage2(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.chkbox_LoanLeasePayoff,test.getTestData("Vehicle2"));
            }

            public void SelectUpdateCoverage2(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test, selectcoverage.btn_UpdateQuote);
            }

            public void updatequote(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test,selectcoverage.btn_UpdateQuote);
                test.webFunctions().click(test,selectcoverage.btn_ReviewCoverage);
                test.webFunctions().click(test,selectcoverage.btn_ChangePolicy);
            }
            
            public void updateGaragingAddCoverage(Testing test){
                test.setPage(CoverageSelections.class);
                CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
                test.webFunctions().click(test,selectcoverage.btn_ChangePolicy);
                
            }

        }



