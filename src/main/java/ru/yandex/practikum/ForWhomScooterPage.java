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

    public void enterName(String name) {
        webDriver.findElement(nameField).sendKeys(name);
    }

    public void enterSurname(String surname) {
        webDriver.findElement(surnameField).sendKeys(surname);
    }

    public void enterAddress(String address) {
        webDriver.findElement(addressField).sendKeys(address);
    }

    public void chooseMetroStation(String stationMetro) {
        webDriver.findElement(metroStationField).sendKeys(stationMetro);
        webDriver.findElement(By.xpath(String.format(stationItem, stationMetro))).click();
    }

    public void enterPhoneNumber(String phoneNumber) {
        webDriver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }

    public void clickFurther() {
        webDriver.findElement(furtherButton).click();
    }
    public void fillCustomerInformation(String name, String surname, String address, String stationMetro, String phoneNumber) {
        enterName(name);
        enterSurname(surname);
        enterAddress(address);
        chooseMetroStation(stationMetro);
        enterPhoneNumber(phoneNumber);
    }
}
