package cucumber.steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import screens.setAlarm;

public class BaseSteps {
    protected setAlarm setAlarm;


    public void setupScreens(AndroidDriver<MobileElement> driver) {
        setAlarm = new setAlarm(driver);

    }
}