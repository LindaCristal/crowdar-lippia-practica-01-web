package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class GoogleHomePage {

    private WebDriver driver;

    public GoogleHomePage(WebDriver driver){
        super();
        this.driver = driver;
    }

    public void buscareEnGoogle(String busqueda){
        WebElement input = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        input.clear();
        input.sendKeys(busqueda);
        input.sendKeys(Keys.TAB);

    }

    public void clickButton(){
        WebElement btnSearch = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.FPdoLc.tfB0Bf > center > input.gNO89b"));
        btnSearch.click();
        driver.manage().timeouts().implicitlyWait( 3,TimeUnit.SECONDS);
    }
}