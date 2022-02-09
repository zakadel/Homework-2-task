package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestPracticeForm {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void successFillForm() {
        open("/automation-practice-form");
        $(".main-header").shouldHave(text("Practice Form"));

        //Заполнение полей ФИО и почты
        $("#firstName").setValue("Adel");
        $("#lastName").setValue("Zakiev");
        $("#userEmail").setValue("zakievadel1994@yandex.ru");

        //Выбор радио кнопки
        $(byText("Male")).click();

        //Ввод номер телефона
        $("#userNumber").setValue("9082787488");

        //Выбор даты рождения
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption("1994");
        $(".react-datepicker__month-select").selectOption("March");
        $(byText("18")).click();

        //Ввод предметов
        $("#subjectsInput").setValue("Arts").pressEnter();
        $("#subjectsInput").setValue("Civics").pressEnter();

        //Выбор файла
        $("#uploadPicture").uploadFromClasspath("test.jpg");

        //Ввод адреса
        $("#currentAddress").setValue("Republic of Tatarstan, Kazan");

        //Выбор штата и города
        $(byText("Select State")).click();
        $(byText("NCR")).click();
        $(byText("Select City")).click();
        $(byText("Delhi")).click();

        //Клик на Submit
        $("#submit").click();

        //Проверяем, что открылась форма с введенными данными
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));

        //Проверяем, что веедные данны верны
        $(".table-responsive").shouldHave(
                text("Student Name"),    text("Adel Zakiev"),
                text("Student Email"),   text("zakievadel1994@yandex.ru"),
                text("Gender"),          text("Male"),
                text("Mobile"),          text("9082787488"),
                text("Date of Birth"),   text("18 March,1994"),
                text("Subjects"),        text("Arts"),
                text("Hobbies"),         text("Civics"),
                text("Picture"),         text("test.jpg"),
                text("Address"),         text("Republic of Tatarstan, Kazan"),
                text("State and City"),  text("NCR Delhi")
        );

        //Закрытие формы
        $("#closeLargeModal").click();
    }
}
