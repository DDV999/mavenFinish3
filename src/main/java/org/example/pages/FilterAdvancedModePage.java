package org.example.pages;

import org.example.steps.BaseSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterAdvancedModePage extends BasePageObject{

    @FindBy(xpath = "//*[@data-filter-id='glprice']//*[@data-prefix='от']/input")
    public WebElement fieldPriceFrom;

    @FindBy(xpath = "(//*[text()='Показать ещё'])[1]/..")
    public WebElement buttonShowMore;

    @FindBy(xpath = "//*[@id='8455647']")
    public WebElement checkboxBeats;

    @FindBy(xpath = "//*[@class='_2qvOO _3qN-v _1Rc6L']")
    public WebElement buttonShowOffers;

    @FindBy(xpath = "//*[@data-autotest-id='product-snippet']")
    public WebElement elementInList;

    @FindBy(xpath = "(//h3[@data-zone-name='title'])[1]/a[@title]")
    public WebElement firstTitleInList;

    @FindBy(xpath = "//*[@itemprop='query-input']")
    public WebElement queryInput;

    @FindBy(xpath = "//*[@data-r='search-button']")
    public WebElement buttonSearch;

    public FilterAdvancedModePage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void fillField(String fieldName, String value) {
        switch (fieldName) {
            case "Цена От":
                fillField(fieldPriceFrom, value);
                break;
            default:
                throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");
        }
    }

    public void selectHeadphone(String fieldName) {
        switch (fieldName) {
            case "Beats":
                checkboxBeats.click();
                break;
            default:
                throw new AssertionError("Чекбокс '" + fieldName + "' не объявлен на странице");
        }
    }

    public void fillField(String fieldName) {
        switch (fieldName) {
            case "Строка поиска":
                (new WebDriverWait(BaseSteps.getDriver(), 5))
                        .until(ExpectedConditions.visibilityOf(elementInList));
                fillField(queryInput, getFieldFirstTitle());
                break;
            default:
                throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");
        }
    }

    public String getFieldFirstTitle() {
        String xpath = "(//h3[@data-zone-name='title'])[1]/a[@title]";
        (new WebDriverWait(BaseSteps.getDriver(), 8))
                .until(ExpectedConditions.visibilityOf(firstTitleInList));
        return BaseSteps.getDriver().findElement(By.xpath(xpath)).getAttribute("title").toUpperCase();
    }

    public void checkCountElements() {
        (new WebDriverWait(BaseSteps.getDriver(), 2))
                .until(ExpectedConditions.visibilityOf(elementInList));
        int count = BaseSteps.getDriver().findElements(By.xpath("//*[@data-autotest-id='product-snippet']")).size();
        Assert.assertEquals(29, count);
    }

    public void checkNameHeadphoneInSearch() {
        String actualValue = firstTitleInList.getText().toUpperCase();
        Assert.assertTrue(String.format("Получено значение [%s]. Ожидалось [%s]", actualValue, getFieldFirstTitle()),
                actualValue.contains(getFieldFirstTitle()));
    }
}
