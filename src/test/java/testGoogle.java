import business.GoogleSearchPageBusiness;
import business.GoogleSearchResultBusiness;
import business.Interfaces.BusinessInterface;

import org.junit.Before;
import org.junit.After;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testGoogle {

    private WebDriver driver;
    private BusinessInterface googleSearchBusiness;
    private BusinessInterface googleSearchResultBusiness;


    public testGoogle() {
    }

    @Before
    public void settingTest(){
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com.ar");
        googleSearchBusiness = new GoogleSearchPageBusiness(driver);
        googleSearchResultBusiness = new GoogleSearchResultBusiness(driver);
    }

    @After
    public void cleanUp(){
        driver.quit();
    }

  //  @Test
  //  public void executeSearch(){
      //  String text = "Crowdar";
       // googleSearchBusiness.perform(text);
    //}

    @Test
    public void executeAndVerify(){
        String text = "Crowdar";
        googleSearchBusiness.perform(text);
        googleSearchResultBusiness.perform(text);
    }


}
