package org.example.steps;

import io.qameta.allure.Step;
import org.example.pages.YandexMarketPage;

import java.util.ArrayList;

import static java.lang.Thread.sleep;
import static org.example.steps.BaseSteps.driver;

public class YandexMarketSteps {
    @Step("выбрать раздел \"Электроника\"")
    public void stepClickButtonElectronics() throws InterruptedException {
        activatePage();
        new YandexMarketPage().buttonElectronics.click();
    }

    @Step("закрыть рекламу")
    public void stepCloseBoard() throws InterruptedException {
        activatePage();
        new YandexMarketPage().buttonClose.click();
    }

    private void activatePage() throws InterruptedException {
        sleep(3000);
        ArrayList tabs2 = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(String.valueOf(tabs2.get(1)));
    }
}