package tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest extends TestBase {
    @Test
    public void testGithub() {
        Selenide.open("/");
        String title = WebDriverRunner.getWebDriver().getTitle();
        assertTrue(title.contains("GitHub"));
    }
}
