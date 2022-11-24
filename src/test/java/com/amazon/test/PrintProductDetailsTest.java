package com.amazon.test;

import com.amazon.pages.pagecomponent.GlobalMenus;
import org.testng.annotations.Test;

public class PrintProductDetailsTest extends BaseTest{

    @Test
    public void addingProductToTheCart() {

        GlobalMenus menus = new GlobalMenus();

        menus.clickHamburgerMenu()
                .clickTvAppliancesElectronics()
                .clickTelevisions()
                .clickSmartTelevisions()
                .clickFirstTvInThePage()
                .switchToProductDetailsPage()
                .printProductDescription();

    }
}
