package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import java.util.ArrayList;

public class setAlarm extends BaseScreen {
    public setAlarm(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    /**
     * Mobile Elements
     */
    By IconAlarm    = By.xpath("//android.widget.FrameLayout[@content-desc=\"Alarm\"]/android.widget.FrameLayout/android.widget.ImageView");
    By selectTime   = By.id("com.google.android.deskclock:id/fab");
    By selectFive   = By.xpath("//android.widget.TextView[@content-desc=\"5 o'clock\"]");
    By selectThirty = By.xpath("//android.widget.TextView[@content-desc=\"30 minutes\"]");
    By am           = By.id("com.google.android.deskclock:id/material_clock_period_am_button");
    By okButton     = By.id("com.google.android.deskclock:id/material_timepicker_ok_button");
    By Mndy         = By.id("com.google.android.deskclock:id/day_button_1");
    By Tsdy         = By.id("com.google.android.deskclock:id/day_button_2");
    By Wndy         = By.id("com.google.android.deskclock:id/day_button_3");
    By Thsdy        = By.id("com.google.android.deskclock:id/day_button_4");
    By Frdy         = By.id("com.google.android.deskclock:id/day_button_5");
    By collapse     = By.xpath("//android.widget.ImageButton[@content-desc=\"Collapse alarm\"]");
    By actv         = By.xpath("(//androidx.cardview.widget.CardView[@content-desc=\" Alarm\"])[1]/android.view.ViewGroup/android.widget.Switch");


    /**
     * Actions
     */
    public void clickIconAlarm() {
        click(IconAlarm);
    }

    public void SelectTime() {
        waitAndClick(selectTime);
    }

    public void SelectFive() {
        waitAndClick(selectFive);
    }

    public void SelectThirty() {
        waitAndClick((selectThirty));
    }

    public void SelectAM() {
        waitAndClick(am);
    }

    public void FindButtonOK() {
        waitAndClick(okButton);
    }

    public void Monday() {
        waitAndClick(Mndy);
    }

    public void Tuesday() {
        waitAndClick(Tsdy);
    }

    public void Wednesday() {
        waitAndClick(Wndy);
    }

    public void Thursday() {
        waitAndClick(Thsdy);
    }

    public void Friday() {
        waitAndClick(Frdy);
    }

    public void ClickCollapse() {
        waitAndClick(collapse);
    }

    public void Verify() {

        try {
            findElement(actv);
        }
        catch(NoSuchElementException e) {
            System.out.println("No active button switch");
            throw e;
        }
        System.out.println("System displays active button switch");

    }
    }









//        if (actual==Expect){
//            Assert.assertEquals(actual,Expect);
//            System.out.println("Equals");
//            }
//        else if (Expect != actual && actual=="5:30 AM"){
//            if(actual!="5:30 AM"){
//
//
//            }
//        }










