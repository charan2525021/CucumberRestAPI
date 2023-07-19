package stepdefinitions;

import org.testng.annotations.BeforeClass;

import utility.BaseTest;

public class Hooks {

    private final BaseTest baseTest;

    public Hooks(BaseTest baseTest) {
        this.baseTest = baseTest;
    }

    @BeforeClass(alwaysRun = true)
    public void beforeScenario() {
        baseTest.setBaseURI();
    }
}
