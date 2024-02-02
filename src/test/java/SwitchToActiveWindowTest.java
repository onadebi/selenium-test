import  org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Test;
import configs.BaseChromeTest;
import org.openqa.selenium.By;

public class SwitchToActiveWindow extends BaseChromeTest {

    @Test
    void switchToWindowTest() throws InterruptedException{
        _driver.navigate().to("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = _driver.findElement(By.xpath("//*[@id='alert-button']"));
        newTabButton.click();

        WebElement btnNewTab = _driver.findElement(By.xpath("//*[@id='new-tab-button']"));
        btnNewTab.click();

        Thread.sleep(5000);
    }

}
