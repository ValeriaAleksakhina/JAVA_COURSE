package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

public class Button {
    private String name;
    private SelenideElement selector;

    public Button (String name, SelenideElement selector) {
        this.name = name;
        this.selector = selector;
    }

    public Button buttonClick(){
        selector.shouldBe(Condition.visible, Duration.ofSeconds(10))
                .click();
        return this;
    }
}
