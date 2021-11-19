package org.example.pages;

import org.example.steps.BaseSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElectronicsPage extends BasePageObject {
    @FindBy(xpath = "//*[contains(@data-zone-data,'26893630')]//*[text()='Наушники и Bluetooth-гарнитуры']")
    public WebElement buttonHeadphones;

    public ElectronicsPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
        (new WebDriverWait(BaseSteps.getDriver(), 5))
                .until(ExpectedConditions.visibilityOf(buttonHeadphones));
    }
}
