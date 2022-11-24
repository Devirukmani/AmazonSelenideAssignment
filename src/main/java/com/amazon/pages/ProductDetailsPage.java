package com.amazon.pages;

import com.codeborne.selenide.SelenideElement;
import java.util.List;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ProductDetailsPage {

    private static final List<SelenideElement> PRODUCT_DESCRIPTION = $$(byXpath
            ("//div[@id='feature-bullets']/ul/li"));

    public void printProductDescription() {
        PRODUCT_DESCRIPTION.stream().map(SelenideElement::getText).forEach(System.out::println);
    }
}
