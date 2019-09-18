package org.autom3.wowhead.ProjetWOW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLardeur {
	
	@FindBy(xpath="//a[text()='Chahuteurs de cadavre']")
	WebElement item_chahuteurs;
	
	@FindBy(xpath="//a[text()='Chausses de Lardeur']")
	WebElement item_chausses;
	
	@FindBy(xpath="//a[text()='Pioche en fer froid']")
	WebElement item_pioche;
	
	@FindBy(xpath="//a[text()='Grèves de geôlier volées']")
	WebElement item_greves;
	
	@FindBy(xpath="//a[text()='Espauliers de Tourne-Clé']")
	WebElement item_espauliers;

	public PageItem goPageChahuteurs(WebDriver driver) {
		item_chahuteurs.click();
		return PageFactory.initElements(driver, PageItem.class);
	}
	
	public PageItem goPageChausses(WebDriver driver) {
		item_chausses.click();
		return PageFactory.initElements(driver, PageItem.class);
	}

	public PageItem goPagePioche(WebDriver driver) {
		item_pioche.click();
		return PageFactory.initElements(driver, PageItem.class);
	}
	
	public PageItem goPageGreves(WebDriver driver) {
		item_greves.click();
		return PageFactory.initElements(driver, PageItem.class);
	}
	
	public PageItem goPageEspauliers(WebDriver driver) {
		item_espauliers.click();
		return PageFactory.initElements(driver, PageItem.class);
	}
	}

