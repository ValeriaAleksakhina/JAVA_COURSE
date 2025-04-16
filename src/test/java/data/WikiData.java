package data;

import lombok.Getter;

public class WikiData {

    public static String getText() {
        return seacrhText;
    }

    @Getter
    public static String url = "https://ru.m.wikipedia.org/wiki";
    public static String seacrhText = "Java";



}
