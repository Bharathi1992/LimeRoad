package com.Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Base.Base_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features ="D:\\eclipse\\Task\\LimeRoad\\src\\test\\java\\com\\feature\\LimeRoad.feature",
                 glue="com.Step",
                 dryRun=false,
          
                 plugin={"pretty",
                 "json:Jrep/cucumber.json",
                 "html:hrep/cucumber.html",
                 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

                 )

public class Runner_Class extends Base_Class {
@BeforeClass
 public static void user_lanuch_browser_chrome() {
	 launchBrowser("chrome");
 }


}

