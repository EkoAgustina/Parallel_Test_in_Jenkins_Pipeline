package cucumber.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import screens.setAlarm;
import utilities.ThreadLocalDriver;

public class JobsDetailsSteps extends BaseSteps {

    @Before
    public void setupLoginSteps() {
        setupScreens(ThreadLocalDriver.getTLDriver());
    }

    @Given("User click the alarm icon on the navbar")
    public void User_click_the_alarm_icon_on_the_navbar() {
        setAlarm.clickIconAlarm();
    }
    @And("Click button add alarm")
    public void Click_button_add_alarm(){
        setAlarm.SelectTime();

//        try {
//            setAlarm.FindButtonOK();
//            System.out.println("Nice");
//        }catch (NoSuchElementException e){
//            System.out.println("Duh");
//            throw e;
//        }

    }

    @And("User choose 5 when select time")
    public void User_choose_5_when_select_time(){
        setAlarm.SelectFive();
    }

    @And("User choose 30 when select time")
    public void User_choose_30_when_select_time(){
        setAlarm.SelectThirty();
        setAlarm.SelectAM();
    }

    @And("User click OK")
    public void User_click_OK(){
        setAlarm.FindButtonOK();
    }

    @And("User click monday to friday")
    public void User_click_monday_to_friday(){
        setAlarm.Monday();
        setAlarm.Tuesday();
        setAlarm.Wednesday();
        setAlarm.Thursday();
        setAlarm.Friday();
        setAlarm.ClickCollapse();
    }


    @Then("The system displays an active button switch")
    public void theSystemDisplaysAnActiveButtonSwitch() {
        setAlarm.Verify();
    }
}
