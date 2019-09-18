package org.autom3.wowhead.ProjetWOW;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Test1 {
	WebDriver driver;
	//String b = "firefox";
	private String BROWSER=System.getProperty("browser");
	String url= "https://fr.wowhead.com";
	
	@Before
	public void setUp() {
		System.out.println("\n@Before");
		driver= Outils.choisirNavigateur(BROWSER);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
@Test
	
	public void test() throws FileNotFoundException, InterruptedException {
	
	AbstractPage abstractPage = PageFactory.initElements(driver, AbstractPage.class);
	abstractPage.recherche(driver, "Lardeur");
	//abstractPage.clickCookies();
	PagePreResult pagePreResult = PageFactory.initElements(driver, PagePreResult.class);
	pagePreResult.goPageLardeur(driver);
	PageLardeur pageLardeur = PageFactory.initElements(driver, PageLardeur.class);
	pageLardeur.goPageChahuteurs(driver);
	PageItem pageItem = PageFactory.initElements(driver, PageItem.class);
	List<String> Liste1 = Outils.loadFile("src/main/Resources/CaracteristiquesItems/chahuteurs.txt");
	List<WebElement> Liste2 = driver.findElements(By.xpath("//div[@id][contains(@style, 'float: left')]//span"));
	List<String> Liste3 = new ArrayList<String>();
	
//	for(WebElement e : Liste2) {
//		Liste3.add(e.getText());
//	}
	Liste2.stream().map(WebElement::getText).forEach(Liste3::add);
	assertEquals(Liste1, Liste3);
}

@After
public void tearDown(){
	System.out.println("\n@After");
	driver.close();
}
}
