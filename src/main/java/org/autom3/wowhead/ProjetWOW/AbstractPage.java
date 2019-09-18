package org.autom3.wowhead.ProjetWOW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {
	
	@FindBy(name="q")
	//@FindBy(xpath="(//input[@type='text'])[1]")
	private static WebElement champ_recherche;
	
	@FindBy(xpath="//a[@class='header-search-button fa fa-search']")
	private static WebElement bouton_recherche;
	
	@FindBy(xpath="//span[text()='Continuer']")
	private static WebElement bouton_accepter_cookies;
	
	public PagePreResult recherche(WebDriver driver, String perso) {
		champ_recherche.clear();
		champ_recherche.sendKeys(perso);
		bouton_recherche.click();
		return PageFactory.initElements(driver, PagePreResult.class);
	}
	
	public void clickCookies() {
		bouton_accepter_cookies.click();
	}
}
