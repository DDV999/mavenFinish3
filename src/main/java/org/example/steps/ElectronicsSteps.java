package org.example.steps;

import io.qameta.allure.Step;
import org.example.pages.ElectronicsPage;

public class ElectronicsSteps {

    @Step("выбрать раздел \"Наушники\"")
    public void stepClickButtonTVsHeadphones() {
        new ElectronicsPage().buttonHeadphones.click();
    }

    @Step("выбрать раздел \"Телевизоры\"")
    public void stepClickButtonTVsTV() {
        new ElectronicsPage().buttonTVs.click();
    }
}