package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage  {
    public WebElement getCapitalBox() {
        return capitalBox;
    }

    @FindBy(id ="box1")
   private WebElement capitalBox;

    public WebElement getCountry() {
        return country;
    }

    @FindBy(id ="box106")
   private WebElement country;

  public DragAndDropPage (WebDriver webDriver)
  {
      super(webDriver);
  }
}
