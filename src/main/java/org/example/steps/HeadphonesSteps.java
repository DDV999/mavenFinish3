package org.example.steps;

import io.qameta.allure.Step;
import org.example.pages.HeadphonesPage;

public class HeadphonesSteps {
    @Step("зайти в расширенный поиск (кнопка \"Все фильтры\")")
    public void stepClickButtonAllFilters() {
        new HeadphonesPage().buttonAllFilters.click();
    }
}
