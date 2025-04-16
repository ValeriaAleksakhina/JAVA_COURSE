package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

public class Input {
    String name;
    SelenideElement selector;

    public Input (String name, SelenideElement selector){
        this.name = name;
        this.selector = selector;
    }

    public void setValue(String value){
        selector.shouldBe(Condition.visible, Duration.ofSeconds(10)).shouldBe(Condition.enabled, Duration.ofSeconds(10))
                .setValue(value);
    }
}
