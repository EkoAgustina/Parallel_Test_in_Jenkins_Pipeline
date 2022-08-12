package cucumber.steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import fAlarm.deleteAlarm;
import fAlarm.setAlarm;

public class BaseSteps {
    protected setAlarm      setAlarm;
    protected deleteAlarm   deleteAlarm;


    public void setupScreens(AndroidDriver<MobileElement> driver) {
        setAlarm    = new setAlarm(driver);
        deleteAlarm = new deleteAlarm(driver);

    }
}