package andorid.sample.practice_2019mar.unittest.demo.mockito.api.test;

import android.content.Context;

import org.junit.Test;

import androidx.test.core.app.ApplicationProvider;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
//https://developer.android.com/training/testing/unit-testing/local-unit-tests#java
//https://www.journaldev.com/22674/android-unit-testing-junit4
//https://junit.org/junit4/javadoc/latest/org/junit/Assert.html

public class MockitoDemoForAPITestTest {

//    private Context context = ApplicationProvider.getApplicationContext();

    @Test
    public void isValidEmailTest() {
        assertThat("Email Validation",Utils.checkEmailForValidity("girisha.k@hp.com"), is(true));
    }

    Utils utils = new Utils();
    @Test
    public void myStringTest() {
        assertEquals("girisha", utils.myString());
    }

    @Test
    public void checkMovieList() {
        //assertEquals("KGF-1", utils.movieList.get(0));
        //Assuming that utils.myBool must return true, do below assert. if below test pass than you can consider that myBool() method working as expected
        assertTrue(utils.myBool());
    }


}