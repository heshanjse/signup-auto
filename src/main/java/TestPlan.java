import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Submit a WebForm")
    public static void submitForm() throws InterruptedException {
        driver.get(Utils.SIGNUP);
        SignupForm signupForm = new SignupForm(driver);
//        Thread.sleep(2000);
        signupForm.enterFirstName("Wu");
        Thread.sleep(30);
        signupForm.enterLastName("Biao");
        Thread.sleep(200);

        signupForm.enterPassword("0987@abcd");
        Thread.sleep(100);
        signupForm.enterConfirmPassword("0987@abcd");
        Thread.sleep(300);
        signupForm.enterUserName("wu.biao36521");
        Thread.sleep(500);
        signupForm.pressNextButton();
        Thread.sleep(5000);
        signupForm.enterPhoneNumber("89322066");
        Thread.sleep(300);
        signupForm.pressSecNextButton();
        Thread.sleep(10000);
        signupForm.pressVerifyButton();
        Thread.sleep(3000);
        signupForm.clearPhoneNumber();
        Thread.sleep(3000);
        signupForm.enterRecoveryEmail("XXX@gmail.com");
        Thread.sleep(3000);
        signupForm.enterDay("12");
        Thread.sleep(3000);
        signupForm.enterMonth();
        Thread.sleep(3000);
        signupForm.enterYear("1992");
        Thread.sleep(3000);
        signupForm.enterGender();
        Thread.sleep(3000);
        signupForm.pressthrNextButton();
        Thread.sleep(3000);
        signupForm.pressagreeButton();
        Thread.sleep(300000);

//        signupForm.clearPhoneNumber();
//        Thread.sleep(115000);
//        WebForm webForm = new WebForm(driver);
//        Thread.sleep(2000);
//        webForm.enterFirstName();
//        Thread.sleep(3000);
//        webForm.enterLastName();
//        Thread.sleep(3000);
//        webForm.pressSubmitButton();
    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}