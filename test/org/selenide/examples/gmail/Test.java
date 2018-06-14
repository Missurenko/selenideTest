package org.selenide.examples.gmail;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by ${bohdan.missurenko} on 6/14/2018.
 */
public class Test extends GmailTests {
    private static String gmailUsername = System.getProperty("gmail.username", "work.b.missurenko@gmail.com");
    private static String gmailPassword = System.getProperty("gmail.password", "HelloHowAreYou");

    @org.junit.Test
    public void test() {
        $(By.linkText("Увійти")).click();
        $("input").setValue("work.b.missurenko@gmail.com");
        $("input").pressEnter();
        $("#password input").val(gmailPassword).pressEnter();
        $("#gbwa").find("a").click();
        $("#gb49").click();
        $(".uw8t2").waitUntil(Condition.visible, 60000).click();
        $(".l-u-Ab-zb-Pn-ve").click();
        String ss = "";
    }
}
