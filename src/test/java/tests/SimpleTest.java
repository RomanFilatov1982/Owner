package tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest extends TestBase {
    @Test
    public void testGithub() {
        Selenide.open("/");
        String title = WebDriverRunner.getWebDriver().getTitle();
        assertEquals("GitHub · Build and ship software on a single, collaborative platform · GitHub", title);
    }
}
