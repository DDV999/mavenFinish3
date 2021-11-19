package org.example.steps;

import io.cucumber.java.en.And;

public class ScenarioSteps {
    ElectronicsSteps electronicsSteps = new ElectronicsSteps();
    FilterAdvancedModeSteps filterAdvancedModeSteps = new FilterAdvancedModeSteps();
    MainPageSteps mainPageSteps = new MainPageSteps();
    HeadphonesSteps tVsSteps = new HeadphonesSteps();
    YandexMarketSteps yandexMarketSteps = new YandexMarketSteps();

    @And("^перейти в \"Яндекс.Маркет\"$")
    public void clickYandexMarket() {
        mainPageSteps.stepClickButtonYandexMarket();
    }

    @And("^выбрать раздел \"Электроника\"$")
    public void clickElectronics() throws InterruptedException {
        yandexMarketSteps.stepClickButtonElectronics();
    }

    @And("^выбрать раздел \"Наушники\"$")
    public void clickTV() {
        electronicsSteps.stepClickButtonTVs();
    }

    @And("^зайти в расширенный поиск. кнопка \"Все фильтры\"$")
    public void goToAdvancedSearch() {
        tVsSteps.stepClickButtonAllFilters();
    }

    @And("^для поля \"(.+)\" задать параметр поиска \"(.+)\"$")
    public void fillFieldPriceFrom(String field, String value) {
        filterAdvancedModeSteps.fillField(field, value);
    }

    @And("^нажимается на кнопку \"Показать ещё\"$")
    public void showMoreButtonClick() {
        filterAdvancedModeSteps.stepClickButtonShowMore();
    }

    @And("^выбрать производителя \"(.+)\"$")
    public void chooseManufacturer(String field) {
        filterAdvancedModeSteps.chooseManufacturers(field);
    }

    @And("^нажать кнопку Показать предложения$")
    public void clickButtonShowOffers() {
        filterAdvancedModeSteps.stepClickButtonShowOffers();
    }

    @And("^проверить, что элементов на странице 29$")
    public void checkCountElements() {
        filterAdvancedModeSteps.checkElementsCount();
    }

    @And("^запомнить первый элемент в списке$")
    public void getFirstItemInTheList() {
        filterAdvancedModeSteps.getTitleMessageField();
    }

    @And("^ввести запомненное значение в \"(.+)\"$")
    public void pushValueToSearchField(String field) {
        filterAdvancedModeSteps.addValueToSearchField(field);
    }

    @And("^нажимается на кнопку Найти$")
    public void findButtonClick() {
        filterAdvancedModeSteps.stepClickButtonSearch();
    }

    @And("^проверить, что наименование товара соответствует запомненному значению.$")
    public void checkThatTheNameOfProductMatchesStoredValue() {
        filterAdvancedModeSteps.checkName();
    }
}
