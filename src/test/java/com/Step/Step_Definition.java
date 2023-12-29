package com.Step;

import com.Base.Base_Class;
import com.pom.Log_In_Page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class{

	
	Log_In_Page ip = new Log_In_Page();

	@Given("User launch the brower {string}")
	public void user_launch_the_brower(String string) {
		launchurl(string);
	}

	@Given("user click on shop men")
	public void user_click_on_shop_men() throws InterruptedException{
	   Thread.sleep(3000);
	   ip.getShopmen().click();
   	 //  ip.getShopmen().click();
		
	}

	@Given("user click on men page")
	public void user_click_on_men_page() throws InterruptedException {
		Thread.sleep(3000);
		moveCursorActions(ip.getMen());
	}

	@Given("user click into SportsTshirt")
	public void user_click_into_sports_tshirt() throws InterruptedException {
		Thread.sleep(3000);
		ip.getTshirts().click();
	}

	@Given("user select a tshirt")
	public void user_select_a_tshirt() throws InterruptedException {
        Thread.sleep(3000);
		ip.getSelectts().click();
	}

	@Given("to select the Tshirt size")
	public void to_select_the_tshirt_size() throws InterruptedException {
		Thread.sleep(3000);
		 ip.getSize().click();
	}

	@Given("click the Add to cart")
	public void click_the_add_to_cart() throws InterruptedException {
		Thread.sleep(3000);
		 ip.getAddtocart().click();
	}

	
}
