package Testsuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Page.DellHome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DellHomeStepDef {
	
@Given("Utilisateur en page dacceuil")
	public void utilisateur_en_page_dacceuil() throws Exception {
	Config.Confchrome();
	   Config.driver = new ChromeDriver();
	   Config.configmaximazewindow();
	   Config.driver.get(Utils.getproprety("Web_Link"));
	}

	@When("utilisateur passe la souris sur le menu {string} et sousmenu {string}")
	public void utilisateur_passe_la_souris_sur_le_menu_et_sousmenu(String menuName, String subMenuName) throws Exception {
	    DellHome page=new DellHome();
	    page.mousehoveronmenubyname(menuName, subMenuName);
	    
	}

	@When("utilisateur choisis {string}")
	public void utilisateur_choisis(String produitName) {
		DellHome page = new DellHome();
		page.clickonpdt(produitName);
	   
	}

	@Then("utilisateur se derige vers la page qui contient {string}")
	public void utilisateur_se_derige_vers_la_page_qui_contient(String NomProduit) {
	    DellHome page=new DellHome();
	    String ActualText=page.verifmessage();
	    
	}

}
