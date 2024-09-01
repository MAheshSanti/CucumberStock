package ERPTestRunner;

import org.junit.runner.RunWith;

import commonFunction.FunctionLibrary;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
features = {"FeatureFile"}
,monochrome = true,

glue = "ERPStepDefination",
plugin= {"pretty","html:target/ERP-StockAccounting.html"}/*,
tags = {"@tag3"}*/
)
public class ERP_Runner {

	
}
