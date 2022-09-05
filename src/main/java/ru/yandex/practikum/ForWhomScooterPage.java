package ru.yandex.practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForWhomScooterPage extends BasePage{
    private By nameField = By.xpath("//input[@placeholder='* Имя']");
    private By surnameField = By.xpath("//input[@placeholder='* Фамилия']");
    private By addressField = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    private By metroStationField = By.xpath("//input[@placeholder='* Станция метро']");
    private String stationItem = ".//div[text()='%s']/..";
    private By phoneNumberField = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By furtherButton = By.xpath(".//button[text()='Далее']");

    public ForWhomScooterPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterName(String text) {
        webDriver.findElement(nameField).sendKeys(text);
    }

    public void enterSurname(String text) {
        webDriver.findElement(surnameField).sendKeys(text);
    }

    public void enterAddress(String text) {
        webDriver.findElement(addressField).sendKeys(text);
    }

    public void chooseMetroStation(String text) {
        webDriver.findElement(metroStationField).sendKeys(text);
        webDriver.findElement(By.xpath(String.format(stationItem, text))).click();
    }

    public void enterPhoneNumber(String text) {
        webDriver.findElement(phoneNumberField).sendKeys(text);
    }

    public void clickFurther() {
        webDriver.findElement(furtherButton).click();
    }
}
