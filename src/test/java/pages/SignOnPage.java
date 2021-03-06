package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOnPage {

    WebDriver driver;
    @FindBy(name = "userName")
    WebElement userName;
    @FindBy(tagName = "h3")
    WebElement loginMessage;
    @FindBy(linkText = "sign-in")
    WebElement signOn;

    public SignOnPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSignOn() {
        this.signOn.click();
    }

    public void inputUserrame(String usrName) {
        this.userName.sendKeys(usrName);
    }

    public String checkMessage() {
        return this.loginMessage.getText();
    }



}
