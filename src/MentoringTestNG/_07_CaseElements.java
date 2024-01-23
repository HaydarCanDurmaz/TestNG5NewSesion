package MentoringTestNG;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class _07_CaseElements {

    public _07_CaseElements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//a[@class='login']")
    private WebElement login;

    @FindBy(xpath = "//input[@id='email_create']")
    private WebElement emailcreate;

    @FindBy(xpath = "//button[@id='SubmitCreate']")
    private WebElement submit;

    @FindBy(xpath = "//input[@id='id_gender1']")
    private WebElement Mr;

    @FindBy(xpath = "//input[@id='customer_firstname']")
    private WebElement firstname;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    private WebElement lastname;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email1;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement password;

    @FindBy(xpath = "//select[@id='days']")
    private WebElement days;

    @FindBy(xpath = "//select[@id='months']")
    private WebElement months;

    @FindBy(xpath = "//select[@id='years']")
    private WebElement years;

    @FindBy(xpath = "")
    private WebElement lo1g22in;

    public WebElement getLogin() {
        return login;
    }

    public WebElement getEmailcreate() {
        return emailcreate;
    }

    public WebElement getSubmit() {
        return submit;
    }

    public WebElement getMr() {
        return Mr;
    }

    public WebElement getFirstname() {
        return firstname;
    }

    public WebElement getLastname() {
        return lastname;
    }

    public WebElement getEmail1() {
        return email1;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getDays() {
        return days;
    }

    public WebElement getMonths() {
        return months;
    }

    public WebElement getYears() {
        return years;
    }

    public WebElement getLo1g22in() {
        return lo1g22in;
    }

    public WebElement getLog22i2n() {
        return log22i2n;
    }

    @FindBy(xpath = "")
    private WebElement log22i2n;
}


