package test;

import data.WikiData;
import org.junit.jupiter.api.Assertions;
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


    @Test
    void exceptionNull() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }

    @Test
    void exceptionAssert() {
        try {
            Assertions.assertTrue(false);
        } catch (AssertionError e) {
            System.out.println("Условие не соблюдено " + e.getMessage());
            throw new IllegalArgumentException("Ошибка! Смотри текст сообщения!", e);
        }
    }


}
