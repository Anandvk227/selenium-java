package stepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature Files/login.feature",glue={"stepDefinition"},
monochrome = true,
plugin={"pretty","junit:target/JUnitReports/report.xml",
"html:target/HtmlReports/report.html",
"json:target/JsonReports/report.json"},
tags="@SmokeTest"
		)
public class TestRunner {

}
