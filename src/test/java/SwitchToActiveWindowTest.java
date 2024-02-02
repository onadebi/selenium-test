import configs.BaseChromeTest;
import  org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import java.util.Set;

public class SwitchToActiveWindowTest extends BaseChromeTest {

    @Test
    void switchToWindowTest() throws InterruptedException{
        _driver.navigate().to("https://formy-project.herokuapp.com/switch-window");

//        WebElement newTabButton = _driver.findElement(By.xpath("//*[@id='alert-button']"));
//        newTabButton.click();

        WebElement btnNewTab = _driver.findElement(By.xpath("//*[@id='new-tab-button']"));
        btnNewTab.click();

        Set<String> originalHandle = _driver.getWindowHandles();

        Thread.sleep(5000);
        String firstWindow = originalHandle.iterator().next();
        _driver.switchTo().window(firstWindow);

        Thread.sleep(5000);

        String initialWindow = originalHandle.stream().findFirst().orElse("");
        _driver.switchTo().window(initialWindow);
    }

}
