package business;

import business.Interfaces.BusinessInterface;
import org.openqa.selenium.WebDriver;
import pages.GoogleHomePage;

public class GoogleSearchPageBusiness implements BusinessInterface {
 private GoogleHomePage googleHomePage;

 public GoogleSearchPageBusiness(WebDriver driver){
     this.googleHomePage = new GoogleHomePage(driver);
 }

 public void perform(String text) {
     googleHomePage.buscareEnGoogle(text);
     googleHomePage.clickButton();
    }
}
