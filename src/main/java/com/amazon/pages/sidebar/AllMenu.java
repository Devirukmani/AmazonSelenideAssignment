package com.amazon.pages.sidebar;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class AllMenu {

    private static final SelenideElement TV_APPLIANCES_ELECTRONICS = $(byXpath
            ("//div[normalize-space()='TV, Appliances, Electronics']"));

    public AppliancesElectronics clickTvAppliancesElectronics(){
        TV_APPLIANCES_ELECTRONICS.shouldBe(visible).click();
        return new AppliancesElectronics();
    }
}
