package com.amazon.pages.pagecomponent;

import com.amazon.pages.sidebar.AllMenu;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GlobalMenus {

    private static final SelenideElement HAMBURGER_MENU = $(byId("nav-hamburger-menu"));

    public AllMenu clickHamburgerMenu(){
        HAMBURGER_MENU.shouldBe(visible).click();
        return new AllMenu();
    }
}
