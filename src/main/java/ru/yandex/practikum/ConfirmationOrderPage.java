package ru.yandex.practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ConfirmationOrderPage extends BasePage {
    private By confirmationPage = By.xpath(".//div[text()='Хотите оформить заказ?']");
    private By confirmationButton = By.xpath(".//button[text()='Да']");
    private By messageOrderCompleted = By.xpath("//div[text()='Заказ оформлен']");

    public ConfirmationOrderPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isDisplayedOrderConfirmationPage() {
        return webDriver.findElement(confirmationPage).isDisplayed();
    }

    public void clickConfirmationButton() {
        webDriver.findElement(confirmationButton).click();
    }

    public boolean isDisplayedOrderStatus() {
        try {
            return webDriver.findElement(messageOrderCompleted).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}