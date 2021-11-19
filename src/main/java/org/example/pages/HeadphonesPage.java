package org.example.pages;

import org.example.steps.BaseSteps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeadphonesPage extends BasePageObject {
    @FindBy(xpath = "//*[text()='Все фильтры']")
    public WebElement buttonAllFilters;

    public HeadphonesPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
        (new WebDriverWait(BaseSteps.getDriver(), 5))
                .until(ExpectedConditions.visibilityOf(buttonAllFilters));
    }
}
