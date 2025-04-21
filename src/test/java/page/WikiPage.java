package page;

import com.codeborne.selenide.Selenide;
import data.WikiData;
import elements.Button;
import elements.Image;
import elements.Input;
import elements.TextField;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class WikiPage {
    private final TextField searchField = new TextField("Строка поиска", $x("//div[@class=\"search-box\"]"));
    private final Input inputSearch = new Input("инпут строки поиска", $x("//div[contains(@class, \"search-header-view\")]//input[@name=\"search\"]"));
    private final Button findButton = new Button("Кнопка Найти", $x("//div[@class=\"search-content\"]"));
    private final Image logo = new Image("Логотип", $x("(//img[@alt=\"Википедия\"])[1]"));



    @Step("Открываем страницу википедии")
    public WikiPage openPage(String url) {
        open(url);
        return this;
    }

    @Step("Заполняем строку поиска")
    public WikiPage fillSearchField() {
        searchField.textFieldClick();
        inputSearch.setValue(WikiData.getText());
        return this;
    }

    @Step("Нажимаем Искать")
    public WikiPage submitButtonClick() {
        findButton.buttonClick();
        return this;
    }

    @Step("Проверяем логотип")
    public WikiPage logotypeCheck() {
        logo.logoCheck();
        return this;
    }


}
