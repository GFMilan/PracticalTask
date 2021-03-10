package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    @FindBy(xpath = "//a[@href='/chapter1']")
    private WebElement chapterOneLink;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public ChapterOnePage clickChapterOneClick(){
        chapterOneLink.click();
        return new ChapterOnePage(driver);
    }

    public String getChapterText(){
        return chapterOneLink.getText();
    }


}
