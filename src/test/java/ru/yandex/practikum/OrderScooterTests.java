package ru.yandex.practikum;

import org.junit.Test;
import org.junit.Assert;

public class OrderScooterTests extends BaseUITest{

    @Test
    public void scooterShouldBeBookedTestSet1() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.clickOrderButton();

        ForWhomScooterPage forWhomScooterPage = new ForWhomScooterPage(webDriver);
        forWhomScooterPage.fillCustomerInformation("Ирина", "Сотникова", "Кременчугская, 87", "Лубянка", "89116243567");
        forWhomScooterPage.clickFurther();

        AboutRentPage aboutRentPage = new AboutRentPage(webDriver);
        aboutRentPage.fillRentInformation();

        ConfirmationOrderPage confirmationOrderPage = new ConfirmationOrderPage(webDriver);
        Assert.assertTrue(confirmationOrderPage.isDisplayedOrderConfirmationPage());
        confirmationOrderPage.clickConfirmationButton();
        Assert.assertTrue("Уведомление об успешном заказе не отобразилось", confirmationOrderPage.isDisplayedOrderStatus());
    }

    @Test
    public void scooterShouldBeBookedTestSet2() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOrderButton();

        ForWhomScooterPage forWhomScooterPage = new ForWhomScooterPage(webDriver);
        forWhomScooterPage.fillCustomerInformation("Сергей", "Смирнов", "Седова, 1", "Сокольники", "89123456789");
        forWhomScooterPage.clickFurther();

        AboutRentPage aboutRentPage = new AboutRentPage(webDriver);
        aboutRentPage.fillRentInformation();

        ConfirmationOrderPage confirmationOrderPage = new ConfirmationOrderPage(webDriver);
        Assert.assertTrue(confirmationOrderPage.isDisplayedOrderConfirmationPage());
        confirmationOrderPage.clickConfirmationButton();
        Assert.assertTrue("Уведомление об успешном заказе не отобразилось", confirmationOrderPage.isDisplayedOrderStatus());
    }
}