package com.amazon.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class TelevisionPage {

    private static final SelenideElement SMART_TELEVISIONS = $(byXpath
            ("//span[text()='Smart Televisions']"));
    private static final SelenideElement TV = $(byXpath("//div[@data-index='1']"));

    public TelevisionPage clickSmartTelevisions(){
        SMART_TELEVISIONS.shouldBe(visible).click();
        return this;
    }

    public TelevisionPage clickFirstTvInThePage() {
        TV.shouldBe(visible).click();
        return this;
    }

    public ProductDetailsPage switchToProductDetailsPage(){
        Selenide.switchTo().window(1);
        return new ProductDetailsPage();
    }

}
