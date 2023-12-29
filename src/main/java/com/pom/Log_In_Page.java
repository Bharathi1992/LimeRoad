package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;	

import com.Base.Base_Class;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log_In_Page extends Base_Class {

	public Log_In_Page() {
		
		PageFactory.initElements(driver, this);
	}
	//shop men or women
	@FindBy(xpath="//span[text()='SHOP MEN']")
	private WebElement shopmen;
	
	public WebElement getShopmen() {
		return shopmen;
	}
	// click to men	
	@FindBy(xpath="(//div[@class='fs13 fwB taC ttU vM dIb ls1 cuP'])[2]")
	private WebElement Men;

	public WebElement getMen() {
		return Men;
	}
	// click to Tshirt
	@FindBy(xpath="(//a[text()='t-shirts'])[2]")
    private WebElement Tshirts;

	public WebElement getTshirts() {
		return Tshirts;
	}

	//click tshirt
	@FindBy(xpath="(//img[@loading='eager']//parent::a)[1]")
//	@FindBy(xpath="//img[@src='//img3.junaroad.com/uiproducts/19600838/zoom_0-1685106903.jpg']")
	private WebElement Selectts;

	public WebElement getSelectts() {
		return Selectts;
	}
// Select size
    @FindBy(xpath="//span[text()=' L ']")
    private WebElement size;

    public WebElement getSize() {
	return size;
    }

    @FindBy(xpath="//div[text()='ADD TO CART']") 
    private WebElement addtocart;

	public WebElement getAddtocart() {
		return addtocart;
	}

}
