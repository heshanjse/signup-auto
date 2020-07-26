import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignupForm extends PageObject{

    @FindBy(id = "firstName")
    private WebElement first_name;

    @FindBy(id = "lastName")
    private WebElement last_name;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"passwd\"]/div[1]/div/div[1]/input")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")
    private WebElement confirm_password;

    @FindBy(id = "accountDetailsNext")
    private WebElement next_button;

    @FindBy(xpath = "//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button")
    private WebElement sec_next_button;

    @FindBy(xpath = "//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div[2]/div[1]/div/div/button")
    private WebElement verify;

    @FindBy(xpath = "//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[2]/div/div/div[1]/div/div[1]/input")
    private WebElement re_email;

    @FindBy(id = "day")
    private WebElement day;

    @FindBy(id = "year")
    private WebElement year;

    @FindBy(id = "month")
    private WebElement month;

    @FindBy(id = "gender")
    private WebElement gender;

    @FindBy(xpath = "//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button")
    private WebElement thr_next_button;

    @FindBy(id = "termsofserviceNext")
    private WebElement agree;




//    @FindBy(xpath = "//*[@id=\"phoneNumberId\"]")
//    private WebElement phone_number;

    @FindBy(id = "phoneNumberId")
    private WebElement phone_number;



    public SignupForm(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(String first_name){
        this.first_name.sendKeys(first_name);
    }

    public void enterLastName(String last_name){
        this.last_name.sendKeys(last_name);
    }

    public void enterUserName(String email){
        this.email.clear();
        this.email.sendKeys(email);
    }

    public void enterPassword(String password){
        this.password.sendKeys(password);
    }

    public void enterConfirmPassword(String confirm_password){
        this.confirm_password.sendKeys(confirm_password);
    }

    public void enterPhoneNumber(String phone_number){
        this.phone_number.sendKeys(phone_number);
    }

    public void pressSecNextButton(){
        this.sec_next_button.click();
    }

    public void pressVerifyButton(){
        this.verify.click();
    }
    public void clearPhoneNumber(){
        this.phone_number.clear();
    }

    public void pressNextButton(){
        this.next_button.click();
    }

    public void enterRecoveryEmail(String email){
        this.re_email.sendKeys(email);
    }

    public void enterDay(String day){
        this.day.sendKeys(day);
    }
    public void enterYear(String year){
        this.year.sendKeys(year);
    }
    public void enterMonth(){
        Select selObj=new Select(month);
        selObj.selectByIndex(2);
    }
    public void enterGender(){
        Select selObj=new Select(gender);
        selObj.selectByIndex(2);
    }

    public void pressthrNextButton(){
        this.thr_next_button.click();
    }

    public void pressagreeButton(){
        this.agree.click();
    }



}
