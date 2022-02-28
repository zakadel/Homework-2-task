package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckRectangleChangeTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void checkRectangleChangeTest() {
        //Открываем страницу
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //Проверяем, что страница открылась
        $(".example").shouldHave(text("Drag and Drop"));
        //Меняем местами прямоугольники
        $("#column-a").dragAndDropTo("#column-b");
        //Проверяем, что прямоугольники поменялись местами
        $("#columns").shouldHave(text("B"));
        $("#columns").shouldHave(text("A"));
    }

}
