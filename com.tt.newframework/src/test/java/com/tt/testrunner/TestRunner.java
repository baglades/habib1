package com.tt.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= {"Features"},
		glue = {"com.tt.steps"},
		tags= {"@login"}
		
		
		)


public class TestRunner extends AbstractTestNGCucumberTests {

	


	

}
