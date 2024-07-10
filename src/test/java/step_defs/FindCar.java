package step_defs;

import base.BasePage;
import base.CarBase;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.HomePage;
import pages.ShopPage;
import utils.PlaywrightDriver;

public class FindCar {
    HomePage homePage = new HomePage();
    ShopPage shopPage = new ShopPage();


    @Given("user navigates to carmax website")
    public void user_navigates_to_carmax_website() {
        PlaywrightDriver.openPage(PlaywrightDriver.config.getProperty("testsiteurl"));

    }
    @When("user clicks Shop link")
    public void user_clicks_shop_link() {
        homePage.clickShop();
    }
    @When("user clicks on {string} car")
    public void user_clicks_on_car(String carBrand) {
        if(carBrand.equalsIgnoreCase("toyota")){
            shopPage.gotoToyota();
        } else if (carBrand.equalsIgnoreCase("ford")) {
            shopPage.gotoFord();
        } else if (carBrand.equalsIgnoreCase("honda")) {
            shopPage.gotoHonda();
        } else if (carBrand.equalsIgnoreCase("nissan")) {
            shopPage.gotoNissan();
        }
    }
    @Then("user validates page title as {string}")
    public void user_validates_page_title_as(String pageTitle) {
        Assert.assertEquals(PlaywrightDriver.getPage().title(), pageTitle);
    }
}
