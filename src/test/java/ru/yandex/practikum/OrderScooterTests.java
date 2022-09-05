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
        forWhomScooterPage.enterName("Ирина");
        forWhomScooterPage.enterSurname("Сотникова");
        forWhomScooterPage.enterAddress("Кременчугская, 87");
        forWhomScooterPage.chooseMetroStation("Лубянка");
        forWhomScooterPage.enterPhoneNumber("89116243567");
        forWhomScooterPage.clickFurther();

        AboutRentPage aboutRentPage = new AboutRentPage(webDriver);
        aboutRentPage.chooseDeliveryDate();
        aboutRentPage.pickerDate();
        aboutRentPage.clickRentalPeriod();
        aboutRentPage.chooseOptionRentalPeriod();
        aboutRentPage.chooseScooterColorCheckbox();
        aboutRentPage.clickSecondOrderButton();

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
        forWhomScooterPage.enterName("Смирнов");
        forWhomScooterPage.enterSurname("Сергей");
        forWhomScooterPage.enterAddress("Седова, 1");
        forWhomScooterPage.chooseMetroStation("Сокольники");
        forWhomScooterPage.enterPhoneNumber("89123456789");
        forWhomScooterPage.clickFurther();

        AboutRentPage aboutRentPage = new AboutRentPage(webDriver);
        aboutRentPage.chooseDeliveryDate();
        aboutRentPage.pickerDate();
        aboutRentPage.clickRentalPeriod();
        aboutRentPage.chooseOptionRentalPeriod();
        aboutRentPage.chooseScooterColorCheckbox();
        aboutRentPage.clickSecondOrderButton();

        ConfirmationOrderPage confirmationOrderPage = new ConfirmationOrderPage(webDriver);
        Assert.assertTrue(confirmationOrderPage.isDisplayedOrderConfirmationPage());
        confirmationOrderPage.clickConfirmationButton();
        Assert.assertTrue("Уведомление об успешном заказе не отобразилось", confirmationOrderPage.isDisplayedOrderStatus());
    }
}