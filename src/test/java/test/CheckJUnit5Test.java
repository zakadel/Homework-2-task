package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckJUnit5Test {

    String softAssertions = "SoftAssertions";
    String jUnit5 = "Using JUnit5 extend test class:";

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void checkJUnit5() {
        //Открываем страницу
        open("https://github.com/selenide/selenide");
        //Открываем вкладку Wiki
        $("#wiki-tab").click();
        //Вводим в фильтр поиска нужное значение
        $("#wiki-pages-filter").setValue(softAssertions);
        //Провеяем, что раздел найден и открываем его
        $("#wiki-pages-box").$(withText(softAssertions)).click();
        //Проверяем наличие нужного значения
        $(".markdown-body").shouldHave(text(jUnit5));
    }
}
