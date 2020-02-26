package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class Hook extends BaseUtil {

    private BaseUtil base;
    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() {
        System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
        base.Driver = new ChromeDriver();
        base.Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        base.Driver.manage().window().maximize();
    }

    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println(scenario.getName());
        }
    }
}