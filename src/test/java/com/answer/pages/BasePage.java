package com.answer.pages;

import com.answer.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {







    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

}
