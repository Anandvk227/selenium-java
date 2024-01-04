

package inVCStepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/inVcFeatures",glue={"inVCStepDefination"},
monochrome = true,
plugin={"pretty","junit:target/JUnitReports/report.xml",
"html:target/HtmlReports/report.html",
"json:target/JsonReports/report.json"},
tags="@Regression"
		)
public class testRunnerForInVc {
 
}
