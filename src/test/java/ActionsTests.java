import org.example.pages.DragAndDropPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsTests extends BaseTest {

    private DragAndDropPage dragAndDropPage;

    @BeforeMethod
    public void BeforeMethod()
    {
       dragAndDropPage = new DragAndDropPage(webDriver);
    }

   @Test
    public void dragAndDrop()
    {
        webDriver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
       dragAndDropPage
               .moveOsloToItaly()
               .moveStockholmToNorway();
    }

    @Test
    public void dragAndDrop2()
    {
        webDriver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        dragAndDropPage.moveOsloToItalyWithPause();
    }

    @Test
    public void scrollDown()
    {
        webDriver.get("https://www.selenium.dev/documentation/webdriver/elements/information/");

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)webDriver;
        javascriptExecutor.executeScript("window.scrollBy(0,400);");
    }
}
