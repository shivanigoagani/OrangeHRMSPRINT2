package com.testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="sprint2features"
		,glue={"com.SPRINT2_OrangeHRM"}
		//,tags={"@Invalid"}
		)
public class Test_runner_orange {

}
