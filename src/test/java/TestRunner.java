import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.Runner;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import stepdefinitions.Hooks;
import utility.BaseTest;

@CucumberOptions(
            features = "src/test/resources/features",
            glue = "stepdefinitions", // Make sure this is pointing to the correct package
            tags = {"@pop"},
            plugin = {"html:target/cucumber-reports.html"},
            dryRun = false // Set to true for dry run, false for actual execution
    )
    @Test()
    public class TestRunner extends AbstractTestNGCucumberTests {

    private static final BaseTest baseTest = new BaseTest();

    @BeforeClass
    public static void setUp() {
        // Create an instance of Hooks with the BaseTest instance
        Hooks hooks = new Hooks(baseTest);
        hooks.beforeScenario();
    }
    }


