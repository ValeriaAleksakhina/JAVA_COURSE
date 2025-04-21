package test;

import data.WikiData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.WikiPage;

import static com.codeborne.selenide.Selenide.sleep;

public class FullTest extends BaseTest{
    WikiPage wikiPage = new WikiPage();

    @Test
    @DisplayName("Проверка работы строки поиска")
    void searchFieldCheck() {
        wikiPage.openPage(WikiData.getUrl())
                .waitForTitle()
                .fillSearchField()
                .submitButtonClick()
                .logotypeCheck();

    }
}
