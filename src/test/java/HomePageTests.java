import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTests extends TestBase {
    /* Navigate to Home Page
     *  Click on Custom Traffic Signs Image Box
     *  Check Custom Traffic Signs page appears
     *  Check Custom Traffic Signs page Heading as expected */
    @Test(priority = 2)
    public void homePage_ClickOnCustomTrafficSignsImageBox_CustomTrafficSignsPageAppears() {
        // arrange
        var homePage = new HomePage(driver, wait);

        // act
        homePage.customTrafficSignsImageBox.click();

        // assert
        Assertions.assertTrue(homePage.isPageTitleCustomTrafficSigns(), "Custom Traffic Signs page doesn't appear");
        var expectedPageHeading = "Custom Traffic Signs";
        Assertions.assertEquals(expectedPageHeading, homePage.getCustomTrafficSignsPageHeadingText(),
                "Custom Traffic Signs heading doesn't appear");
    }

    /* Navigate to Home Page
     *  Click on Custom Traffic Signs Text Link
     *  Check Custom Traffic Signs page appears
     *  Check Custom Traffic Signs page Heading as expected */
    @Test(priority = 1)
    public void homePage_ClickOnCustomTrafficSignsTextLink_CustomTrafficSignsPageAppears() {
        // arrange
        var homePage = new HomePage(driver, wait);

        // act
        homePage.customTrafficSignsTextLink.click();

        // assert
        Assertions.assertTrue(homePage.isPageTitleCustomTrafficSigns(), "Custom Traffic Signs page doesn't appear");
        var expectedPageHeading = "Custom Traffic Signs";
        Assertions.assertEquals(expectedPageHeading, homePage.getCustomTrafficSignsPageHeadingText(),
                "Custom Traffic Signs heading doesn't appear");
    }
}
