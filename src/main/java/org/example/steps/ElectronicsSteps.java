package org.example.steps;

import io.qameta.allure.Step;
import org.example.pages.ElectronicsPage;

public class ElectronicsSteps {
    @Step("выбрать подраздел {0}")
    public void chooseSubsection(String field) {
        new ElectronicsPage().selectSubsection(field);
    }
}