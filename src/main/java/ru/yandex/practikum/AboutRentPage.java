package ru.yandex.practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutRentPage extends BasePage{
    private By deliveryDateField = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    private By datePicker = By.xpath("//div[@class='react-datepicker__day react-datepicker__day--023']");
    private By dropDownRentalPeriod = By.xpath("//div[@class='Dropdown-control']");
    private By dropDownOptionRentalPeriod = By.xpath("//div[@class='Dropdown-option' and text()='четверо суток']");
    private By scooterColorCheckbox = By.xpath("//input[@id='black' and @class='Checkbox_Input__14A2w']");
    private By secondOrderButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public AboutRentPage(WebDriver webDriver){
        super(webDriver);
    }

    public void chooseDeliveryDate() {
        webDriver.findElement(deliveryDateField).click();
    }

    public void pickerDate() {
        webDriver.findElement(datePicker).click();
    }

    public void clickRentalPeriod() {
        webDriver.findElement(dropDownRentalPeriod).click();
    }

    public void chooseOptionRentalPeriod() {
        webDriver.findElement(dropDownOptionRentalPeriod).click();
    }

    public void chooseScooterColorCheckbox() {
        webDriver.findElement(scooterColorCheckbox).click();
    }

    public void clickSecondOrderButton() {
        webDriver.findElement(secondOrderButton).click();
    }
}