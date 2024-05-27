package Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class DellHome {
	@FindBy (xpath="/html/body/div[4]/header/section/header/div[2]/div[2]/nav/ul/li/button/span")
	List<WebElement> menus;
	@FindBy (xpath="/html/body/div[4]/header/section/header/div[2]/div[2]/nav/ul/li[3]/ul/li/button")
	List<WebElement> submenus;
	@FindBy(xpath="/html/body/div[4]/header/section/header/div[2]/div[2]/nav/ul/li[3]/ul/li[3]/ul/li/a")
	List<WebElement> ProduitsList;
	@FindBy(xpath="/html/body/main/div[2]/section[2]/div[1]/div/div/h1/span")
	WebElement verif;
	


public DellHome() {
	PageFactory.initElements(Config.driver, this);
}
public void mousehoveronmenubyname(String menuTitle, String submenuTitle) throws Exception {
	Thread.sleep(5000);
	
		for(WebElement menu:menus) {
			if(menu.getText().contains(menuTitle)) {
				Config.action = new Actions(Config.driver);
				Config.action.moveToElement(menu).perform();
				Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				for(WebElement submenu:submenus) {
					if(submenu.getText().contains(submenuTitle)) {
						Config.action.moveToElement(submenu).perform();
						
						}
					}
				}
			}
		}
public void clickonpdt(String produitname) {
	try {
	for(WebElement produit:ProduitsList) {
		if(produit.getText().contains(produitname)) {
			produit.click();
		}
	}
	}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

public String verifmessage() {
	String Actualtext = verif.getText();
	return Actualtext;
}
}
