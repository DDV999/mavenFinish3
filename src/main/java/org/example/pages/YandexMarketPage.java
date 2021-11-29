package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.example.steps.BaseSteps;

public class YandexMarketPage extends BasePageObject {

    @FindBy(xpath = "//span[text()='Электроника']")
    public WebElement buttonElectronics;

    @FindBy(xpath = "//*[@data-apiary-widget-name='@marketfront/FashionOnboardingPopup']//*[@data-tid='12e87f62']")
    public WebElement buttonClose;

    public YandexMarketPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
}