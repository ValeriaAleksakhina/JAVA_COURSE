package elements;


import com.codeborne.selenide.SelenideElement;


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


}
