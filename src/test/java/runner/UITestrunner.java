package runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = "stepDifinations",
        tags ="@secondTestCase",
       // plugin = "pretty",monochrome = true
        plugin = "html:target/cucumber-reports/index.html"
)
public class UITestrunner{

}