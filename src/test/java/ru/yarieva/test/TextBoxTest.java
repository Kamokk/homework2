package ru.yarieva.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.commands.SelectRadio;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized=true;
        open("https://demoqa.com/automation-practice-form");
    }
    @Test
    void fillFormTest() {
$("#firstName").setValue("Mira");
$("#lastName").setValue("Smith");

//email
        $("#userEmail").setValue("Mira@mail.ru");

//gender
   //     $("#gender-radio-2").setValue("Female");
  $(byText("Female")).click();


        // Mobile
        $("#userNumber").setValue("+79802507861");

        //Date of Birth

        //Subjects
     //   $("#subjectsContainer").setValue("group");

        // Hobbies
     $(byText("Music")).click();

        //Picture
      //  $("#")

        //Current Address
        $("#currentAddress").setValue("Volgogradsky prospect, 21 st9");

        //Select State

        //Select City

    }
}
