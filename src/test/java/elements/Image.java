package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

public class Image {
    String name;
    SelenideElement selector;

    public Image(String name, SelenideElement selector){
        this.name = name;
        this.selector = selector;
    }

    public Image logoCheck() {
        selector.shouldBe(Condition.visible, Duration.ofSeconds(10));
        return this;
    }


}
