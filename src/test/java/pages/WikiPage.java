package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;

public class WikiPage {
    public WikiPage shouldContainPage(String pageName) {
        $("#wiki-body").shouldHave(text(pageName));
        return this;
    }

    public SoftAssertionsPage openSoftAssertionsPage() {
        $(byTagAndText("a", "Soft assertions")).click();
        return new SoftAssertionsPage();
    }
}
