package elements;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;


public class TextField {
    public TextField(String name, SelenideElement selector) {

        this.name = name;
        this.selector = selector;
    }

    String name;
    SelenideElement selector;

    public void textFieldClick(){
        selector.click();
    }

    public void visibilityCheck(){
        selector.shouldBe(Condition.visible, Duration.ofSeconds(10));
    }


}
