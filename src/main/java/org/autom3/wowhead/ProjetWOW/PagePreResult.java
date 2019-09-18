package org.autom3.wowhead.ProjetWOW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagePreResult {

	@FindBy(xpath="//div[text()='PNJ (7)']")
	private WebElement pnj;
	
	@FindBy(xpath="//td[@class='icon-boss-padded']")
	private WebElement lardeur;
	
	@FindBy(xpath="//span[text()='Continuer']")
	private WebElement bouton_cookie;
	
	public PageLardeur goPageLardeur(WebDriver driver) throws InterruptedException{
		pnj.click();
		Thread.sleep(3000);
		bouton_cookie.click();
		lardeur.click();
	return PageFactory.initElements(driver, PageLardeur.class);
	}
	
}
