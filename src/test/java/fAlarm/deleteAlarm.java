package fAlarm;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

public class deleteAlarm extends BaseScreen {
    public deleteAlarm(AndroidDriver<MobileElement> driver) {
        super(driver);
    }
    /**
     * Mobile Elements
     */

    By expandalarm1     = By.xpath("(//android.widget.ImageButton[@content-desc=\"Expand alarm\"])[1]");
    By buttondelete     = By.id("com.google.android.deskclock:id/delete");
    By alarm2           = By.xpath("(//androidx.cardview.widget.CardView[@content-desc=\" Alarm\"])[2]/android.view.ViewGroup");
    By alarm3           = By.xpath("//androidx.cardview.widget.CardView[@content-desc=\" Alarm\"]/android.view.ViewGroup");
    By alarm1           = By.xpath("(//androidx.cardview.widget.CardView[@content-desc=\" Alarm\"])[3]/android.view.ViewGroup");
    By noAlarm          = By.id("com.google.android.deskclock:id/alarm_empty_view");


    /**
     * Actions
     */
    public void ExpandAlarm(){waitAndClick(expandalarm1);}
    public void ButtonDelete(){waitAndClick(buttondelete);}
    public String getAE(){waitAndFindElements(noAlarm);
        return null;
    }

    public void AlarmEmpty() throws InterruptedException {
        Thread.sleep(10);

        try {
            if (waitAndFindElement(alarm1).isDisplayed()==true){
                ExpandAlarm();
                ButtonDelete();
                if(waitAndFindElement(alarm2).isDisplayed()==true){
                    ExpandAlarm();
                    ButtonDelete();
                    if (waitAndFindElement(alarm3).isDisplayed()==true){
                        ExpandAlarm();
                        ButtonDelete();
                    }
                }
            }
        }
        catch (NoSuchElementException e){
            System.out.println("Element doesn't exist");
            throw e;
        }


    }
    public void VerifyNoAlarm() throws InterruptedException {
        Thread.sleep(10);
        String MyExpect = "No Alarms";
        String MyActual = getText(noAlarm);

        try {
            Assert.assertEquals(MyActual,MyExpect);
        }
        catch (AssertionError e){
            System.out.println("Not Equal");
            throw e;
        }
        System.out.println("Equal => "+" My Expect: "+MyExpect+" and "+"My Actual: "+MyActual+"");
    }

}
