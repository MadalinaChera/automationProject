package pages;

import helpMethods.ElementsMethod;
import helpMethods.FrameMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPage {

    public WebDriver driver;
    public ElementsMethod elementsMethod;
    public FrameMethods frameMethods;

    public FramesPage(WebDriver driver) {
        this.driver = driver;
        elementsMethod = new ElementsMethod(this.driver);
        frameMethods = new FrameMethods(this.driver);
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//span[text()='Frames']")
    public WebElement framesButton;

    public void clickFramesButton(){
        elementsMethod.javaScriptElement(framesButton);
    }

    public void switchFrames(String frame1, String frame2){
        frameMethods.switchToSpecificFrame(frame1);
        frameMethods.switchToParent();
        frameMethods.switchToSpecificFrame(frame2);
    }
}
