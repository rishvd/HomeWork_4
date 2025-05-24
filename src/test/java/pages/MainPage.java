package pages;


import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public WikiPage goToWiki() {
        $("#wiki-tab").click();
        return new WikiPage();
    }
}
