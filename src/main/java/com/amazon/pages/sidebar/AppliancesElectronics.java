package com.amazon.pages.sidebar;

import com.amazon.pages.TelevisionPage;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class AppliancesElectronics {

    private static final SelenideElement TELEVISIONS = $(withTagAndText
            ("a","Televisions"));

    public TelevisionPage clickTelevisions(){
        TELEVISIONS.shouldBe(visible).click();
        return new TelevisionPage();
    }
}
