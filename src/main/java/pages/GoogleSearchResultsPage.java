package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearchResultsPage {

    private WebDriver driver;
    public GoogleSearchResultsPage(WebDriver driver){
        super();
        this.driver = driver;
    }
    public String valorBusqueda(){
        List<WebElement> valor = driver.findElements(By.cssSelector("#rso>div>div>div>a>h3"));
        WebElement primerValor = valor.get(0);
        return primerValor.getText();
    }
}
