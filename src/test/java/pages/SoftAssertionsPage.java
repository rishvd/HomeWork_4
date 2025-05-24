package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;

public class SoftAssertionsPage {
    public void shouldContainJUnit5Code(String expectedSnippet) {
        $(byTagAndText("h4", "3. Using JUnit5 extend test class:"))
                .parent().sibling(0).$("pre")
                .shouldHave(text(expectedSnippet));
    }
}
