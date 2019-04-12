package andorid.sample.practice_2019mar.unittest.demo.espresso.ui.test;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import andorid.sample.practice_2019mar.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

//https://www.journaldev.com/23067/android-espresso
//https://developer.android.com/training/testing/espresso/basics
//https://developer.android.com/training/testing/espresso/cheat-sheet

@RunWith(AndroidJUnit4.class)
public class TestActicityTest {

    @Rule
    public ActivityTestRule<TestActicity> activityRuleTest = new ActivityTestRule<>(TestActicity.class);

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("andorid.sample.practice_2019mar", appContext.getPackageName());
    }

    @Test
    public void onCreate() {
    }

    private String userName = "girish";
    private String number = "9066068606";

    @Test
    public void logInSucessTest() {
        onView(withId(R.id.inUsername)).perform(typeText(userName));
        onView(withId(R.id.inNumber)).perform(typeText(number));
        onView(withId(R.id.inConfirmNumber)).perform(typeText("9066068606"));
        onView(withId(R.id.btnLogin)).perform(click());
    }

    @Test
    public void logInFailTest() {
        onView(withId(R.id.inUsername)).perform(typeText(userName));
        onView(withId(R.id.inNumber)).perform(typeText(number));
        onView(withId(R.id.inConfirmNumber)).perform(typeText("9066068607"));
        onView(withId(R.id.btnLogin)).perform(click());
    }
}