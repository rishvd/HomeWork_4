package tests;

import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class GitHubTests {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://github.com/";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void checkSoftAssertionsAndJUnit5() {
        String expectedSnippet = "ExtendWith({SoftAssertsExtension.class})\n" +
                "class Tests {\n" +
                "  @Test\n" +
                "  void test() {\n" +
                "    Configuration.assertionMode = SOFT;\n" +
                "    open(\"page.html\");\n" +
                "\n" +
                "    $(\"#first\").should(visible).click();\n" +
                "    $(\"#second\").should(visible).click();\n" +
                "  }\n" +
                "}";

        open("/selenide/selenide");

        new MainPage()
                .goToWiki()
                .shouldContainPage("Soft assertions")
                .openSoftAssertionsPage()
                .shouldContainJUnit5Code(expectedSnippet);
    }
}
