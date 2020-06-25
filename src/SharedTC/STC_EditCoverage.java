package SharedTC;

import org.openqa.selenium.support.PageFactory;
import ApplicationPages.CoverageSelections;
import resources.Testing;

public class STC_EditCoverage {
	
	// *****************************************Policy Level Coverage****************************************************
	
	public void selectBICoverage(Testing test){
        test.setPage(CoverageSelections.class);
        CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, selectcoverage.slider_BodilyInjury, "4");
       }
	
	public void selectPDCoverage(Testing test){
        test.setPage(CoverageSelections.class);
        CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, selectcoverage.slider_PropertyDamage, "4");
       }
	
	public void selectUMBICoverage(Testing test){
        test.setPage(CoverageSelections.class);
        CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, selectcoverage.slider_UMBI, "4");
       }
	
	public void selectUMPDCoverage(Testing test){
        test.setPage(CoverageSelections.class);
        CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, selectcoverage.slider_UMPD, "4");
       }
	
	public void selectPIPCoverage(Testing test){
        test.setPage(CoverageSelections.class);
        CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, selectcoverage.slider_PIP, "4");
      }
	
	public void selectMedPayCoverage(Testing test){
        test.setPage(CoverageSelections.class);
        CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, selectcoverage.slider_MedicalPayments, "4");
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
	
	public void selectComprehensiveCoverage(Testing test){
        test.setPage(CoverageSelections.class);
        CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, selectcoverage.slider_Comprehensive, "4", "4");
       }
	
	public void selectCollisionCoverage(Testing test){
        test.setPage(CoverageSelections.class);
        CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, selectcoverage.slider_Collision, "4", "4");
        }
	
	public void selectRentalCoverage(Testing test){
        test.setPage(CoverageSelections.class);
        CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, selectcoverage.slider_RentalReimbursement, "4", "4");
        }
	
	public void selectCustomEquipCoverage(Testing test){
            test.setPage(CoverageSelections.class);
            CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
            test.webFunctions().click(test, selectcoverage.slider_CustomEquipment, "4", "4");
            }
	public void selectRoadsideAssist(Testing test){
        test.setPage(CoverageSelections.class);
        CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, selectcoverage.chkbox_RoadSideAssist, "2012 ACURA MDX AWD");
        }
	
	
	public void selectNoDamage(Testing test){
        test.setPage(CoverageSelections.class);
        CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, selectcoverage.btn_Damage_NO, "2012 ACURA MDX AWD");
        }
	
	public void selectYesDamage(Testing test){
        test.setPage(CoverageSelections.class);
        CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, selectcoverage.btn_Damage_Yes, "2012 ACURA MDX AWD");
        }
	
	public void typeDamageDescription(Testing test){
        test.setPage(CoverageSelections.class);
        CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test, selectcoverage.textbox_DamageDesc, "2012 ACURA MDX AWD", "Damage on Door");
        }
	
	public void SelectLoanLeaseCoverage(Testing test){
        test.setPage(CoverageSelections.class);
        CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, selectcoverage.chkbox_LoanLeasePayoff, "2012 ACURA MDX AWD");
        }
	
	public void SelectUpdateCoverage(Testing test){
        test.setPage(CoverageSelections.class);
        CoverageSelections selectcoverage = (CoverageSelections) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, selectcoverage.btn_UpdateQuote);
        }
	
}
