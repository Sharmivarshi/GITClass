package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\Rerun\\failed.txt",glue="org.stepdefinition",dryRun=false,
plugin= { "html:target\\Reports",
        "junit:target\\Reports\\output.xml",
        "json:target\\Reports\\js.json",
         "rerun:src\\test\\resources\\Rerun\\failed.txt"
	  	})

public class ReRunnerClass {

	@AfterClass
	public static void test() {

		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\Reports\\js.json");

}
}
