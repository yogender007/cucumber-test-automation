package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Common_Steps {

    private WebDriver driver;

    @Before(order = 0)
    public void setUp() {
        driver = new ChromeDriver();
        System.out.println("Settings and initialisation done in Before Hook");
    }

    @After(order = 1)
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            //Take Screenshot
            final byte[] shot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            //Embed into Report
            scenario.attach(shot, "image/png", scenario.getName());
        }
        driver.quit();
        Thread.sleep(1000);
        System.out.println("Settings and closing activity done in After Hook");
    }

    public WebDriver getDriver() {
        return driver;
    }
}