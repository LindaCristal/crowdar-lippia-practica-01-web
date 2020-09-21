package business;

import business.Interfaces.BusinessInterface;
import org.openqa.selenium.WebDriver;
import pages.GoogleSearchResultsPage;


public class GoogleSearchResultBusiness implements BusinessInterface {
    public GoogleSearchResultsPage googleSearchResultsPagePage;

    public GoogleSearchResultBusiness(WebDriver driver){
        super();
        this.googleSearchResultsPagePage = new GoogleSearchResultsPage(driver);
    }

    public void perform(String text) {
        System.out.println("El valor retornado es:"+ googleSearchResultsPagePage.valorBusqueda());

    }
}
