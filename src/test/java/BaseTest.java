import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver webDriver;

    @BeforeMethod
    public void initDriver()
    {
        webDriver = new ChromeDriver();
    }

    @AfterMethod()
    public void destroy()
    {
        webDriver.quit();
    }
}
