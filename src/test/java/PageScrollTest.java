import configs.BaseChromeTest;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

import java.nio.file.Paths;


public class PageScrollTest extends BaseChromeTest {

    @Test
    void scrollToInputKeyPress() throws InterruptedException{
        _driver.navigate().to("https://formy-project.herokuapp.com/scroll");

        WebElement name  = _driver.findElement(By.xpath("//*[@id='name']"));
//        #region May not be needed
        Actions actions = new Actions(_driver);
        actions.moveToElement(name);
//        #endregion
        name.sendKeys("Onadebi");

        WebElement date = _driver.findElement(By.xpath("//*[@id='date']"));
        date.sendKeys("02/02/2024");

        Thread.sleep(5000);
    }

}
