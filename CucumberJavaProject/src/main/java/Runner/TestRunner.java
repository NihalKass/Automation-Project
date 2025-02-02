import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
  features = "Features"//folder name
  ,glue={"stepDefinition"} //package name for step def
  )
public class TestRunner {}
