package ru.yandex.practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class MainPage extends BasePage{
    private By cookieButton = By.xpath("//button[@id='rcc-confirm-button']");
    private By orderButton = By.xpath("//button[@class='Button_Button__ra12g']");
    private String dropDownQuestion = ".//div[text()='%s']";
    private String dropDownAnswer = ".//p[text()='%s']";

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickCookieButton() {
        webDriver.findElement(cookieButton).click();
    }

    public void clickOrderButton() {
        webDriver.findElement(orderButton).click();
    }

    public void scrollPage(WebElement element) {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickOnQuestion(String question) {
        WebElement element = webDriver.findElement(By.xpath(String.format(dropDownQuestion, question)));
        scrollPage(element);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].click();", element);
    }

    public String getAnswer(String answer) {
        return webDriver.findElement(By.xpath(String.format(dropDownAnswer, answer))).getText();

    }
}
