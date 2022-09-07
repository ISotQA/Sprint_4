package ru.yandex.practikum;

import org.junit.Test;
import org.junit.Assert;

public class DropDownTests extends BaseUITest {

    @Test
    public void shouldBeReceivedCorrectTextHowMuch() {
        MainPage mainPage = new MainPage(webDriver);
        String expectedAnswer = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        mainPage.clickOnQuestion("Сколько это стоит? И как оплатить?");
        Assert.assertEquals(expectedAnswer, mainPage.getAnswer(0));
    }
    @Test
    public void shouldBeReceivedCorrectTextSeveralScooters() {
        MainPage mainPage = new MainPage(webDriver);
        String expectedAnswer = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        mainPage.clickOnQuestion("Хочу сразу несколько самокатов! Так можно?");
        Assert.assertEquals(expectedAnswer, mainPage.getAnswer(1));
    }
    @Test
    public void shouldBeReceivedCorrectTextRentalTime() {
        MainPage mainPage = new MainPage(webDriver);
        String expectedAnswer = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        mainPage.clickOnQuestion("Как рассчитывается время аренды?");
        Assert.assertEquals(expectedAnswer, mainPage.getAnswer(2));
    }
    @Test
    public void shouldBeReceivedCorrectTextDeliveryRightToday() {
        MainPage mainPage = new MainPage(webDriver);
        String expectedAnswer = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        mainPage.clickOnQuestion("Можно ли заказать самокат прямо на сегодня?");
        Assert.assertEquals(expectedAnswer, mainPage.getAnswer(3));
    }
    @Test
    public void shouldBeReceivedCorrectTextExtendOrderOrReturnScooter() {
        MainPage mainPage = new MainPage(webDriver);
        String expectedAnswer = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        mainPage.clickOnQuestion("Можно ли продлить заказ или вернуть самокат раньше?");
        Assert.assertEquals(expectedAnswer, mainPage.getAnswer(4));
    }
    @Test
    public void shouldBeReceivedCorrectTextChargerSupplied() {
        MainPage mainPage = new MainPage(webDriver);
        String expectedAnswer = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        mainPage.clickOnQuestion("Вы привозите зарядку вместе с самокатом?");
        Assert.assertEquals(expectedAnswer, mainPage.getAnswer(5));
    }
    @Test
    public void shouldBeReceivedCorrectTextPossibleCancelOrder() {
        MainPage mainPage = new MainPage(webDriver);
        String expectedAnswer = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        mainPage.clickOnQuestion("Можно ли отменить заказ?");
        Assert.assertEquals(expectedAnswer, mainPage.getAnswer(6));
    }
    @Test
    public void shouldBeReceivedCorrectTextDeliveryOutsideMoscow() {
        MainPage mainPage = new MainPage(webDriver);
        String expectedAnswer = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        mainPage.clickOnQuestion("Я жизу за МКАДом, привезёте?");
        Assert.assertEquals(expectedAnswer, mainPage.getAnswer(7));
    }
}