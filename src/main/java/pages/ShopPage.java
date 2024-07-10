package pages;

import base.BasePage;
import utils.PlaywrightDriver;

public class ShopPage extends BasePage {
    public void gotoToyota(){
        click("toyota_XPATH");
    }
    public void gotoFord(){
        click("ford_XPATH");
    } public void gotoHonda(){
        click("honda_XPATH");
    } public void gotoNissan(){
        click("nissan_XPATH");
    }
}
