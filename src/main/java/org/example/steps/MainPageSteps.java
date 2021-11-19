package org.example.steps;

import io.qameta.allure.Step;
import org.example.pages.MainPage;

public class MainPageSteps {
    @Step("перейти в \"Яндекс.Маркет\"")
    public void stepClickButtonYandexMarket() {
        new MainPage().buttonYandexMarket.click();
    }
}
