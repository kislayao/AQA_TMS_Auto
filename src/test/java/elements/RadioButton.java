package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class RadioButton {
    private UIElement uiElement;
    private WebDriver driver;
 //   private List<String> radioButtons;

    public RadioButton(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
        this.driver = driver;
 //       this.radioButtons = new ArrayList<>();

        //(By.xpath("//input[@type='radio' and @class='radio' and@id]"))

//        for (UIElement element : uiElement.findUIElements(By.cssSelector("label input"))) {
//            radioButtons.add(element.getAttribute("value"));
//        }
    }

    public RadioButton(WebDriver driver, WebElement webElement) {
        this.uiElement = new UIElement(driver, webElement);
    }

//    public RadioButton getRadioButton(String radioButtonTitle){
//        radioButtons.indexOf(radioButtonTitle);
//        return getRadioButton(radioButtonTitle);
//    }

//    public UIElement getRadioButton(String radioButtonTitle){
//        radioButtons.indexOf(radioButtonTitle);
//        return getRadioButton(radioButtonTitle);
//    }

//    public RadioButton getRadioButtons(int index) {
//        ArrayList<UIElement> radioButtons = (ArrayList<UIElement>) uiElement.findUIElements(By.cssSelector("label"));
//        //ArrayList<UIElement> list = (ArrayList<UIElement>) uiElement.findUIElements(By.tagName("//tr/td/.."));
//        return new RadioButton(driver, radioButtons.get(index));
//
//    }
//
//
//    public UIElement getRB() {
//        return uiElement.findElement(By.tagName("input"));
//    }

//    public RadioButton getRadioButton (int number){
//        radioButtons.get(number);
//        return getRadioButton(number);
//    }
//
//    public void click(){
//        uiElement.click();
//    }


    public void test (int number){
//        driver.findElements(By.cssSelector(".add-project-row label input")).size();
//        System.out.println(driver.findElements(By.cssSelector(".add-project-row label input")).size());
//        driver.findElements(By.cssSelector(".add-project-row label input")).get(number).click();
        uiElement.findUIElements(By.cssSelector("label input")).size();
        System.out.println(uiElement.findUIElements(By.cssSelector("label input")).size());
        uiElement.findUIElements(By.cssSelector("label input")).get(number).click();

    }







    }


