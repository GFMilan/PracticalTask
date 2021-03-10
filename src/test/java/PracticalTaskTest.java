import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ChapterOnePage;
import pages.HomePage;
import constants.Constants;


public class PracticalTaskTest extends BaseTestClass {
    private String assertTextExpected = "Assert that this text is on the page";
    private String assertChapterOneTextExpected = "Chapter1";
    HomePage homePage;
    ChapterOnePage chapterOnePage;

    @BeforeClass
    public void beforeClass() {
        goToUrl(Constants.BASE_URL);
    }

    @Test
    public void practicalTaskTest() {
        homePage = new HomePage(driver);
        chapterOnePage = homePage.clickChapterOneClick();

        Assert.assertEquals(chapterOnePage.getAssertText(), assertTextExpected);
        homePage = chapterOnePage.clickHomePageLink();
        Assert.assertEquals(homePage.getChapterText(), assertChapterOneTextExpected);

    }



}