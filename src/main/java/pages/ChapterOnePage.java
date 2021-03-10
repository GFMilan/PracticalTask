package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChapterOnePage {
    private WebDriver driver;

    @FindBy(xpath = "//a[@href='/']")
    private WebElement homePageLink;

    @FindBy(css = "#divontheleft")
    private WebElement assertText;


    public ChapterOnePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public HomePage clickHomePageLink(){
        homePageLink.click();
        return new HomePage(driver);
    }

    public String getAssertText(){
        return assertText.getText();
    }

}
