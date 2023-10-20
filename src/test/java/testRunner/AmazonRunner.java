package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/*
 * single test-tags="@BestSeller"
 * two or more scenario- tags="@BestSeller or @Mobile"
 * ignore any specific - tags="not @Mobile"
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Amazon.feature",
					glue="stepdef",
					tags="not @Mobile",
					publish=true)
public class AmazonRunner {

}
