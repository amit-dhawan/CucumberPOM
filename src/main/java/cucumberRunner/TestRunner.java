package cucumberRunner;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = "./cucumberProjectAmit/src/test/java/featureFiles", glue = { "stepDefinitions" }, strict = false)
public class TestRunner {

}
