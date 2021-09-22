package ru.yarieva.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized=true;
    }
    @Test
    void fillFormTest() {
open("https://demoqa.com/automation-practice-form");
$("#firstName").setValue("Mira");
$("#lastName").setValue("Smith");


    }
}
