package andorid.sample.practice_2019mar.unittest.demo.mockito.api.test;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    CopyOnWriteArrayList<String> movieList = new CopyOnWriteArrayList<>();

    private static final int MILLIS = 1000;

    Utils() {
        movieList.add("AK47");
        movieList.add("KGF-1");
        movieList.add("KGF-2");
    }

    public static boolean checkEmailForValidity(String email) {

        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email.trim());
        return matcher.find();

    }

    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);


    public static Date calendarDate(long epocSeconds) {
        Calendar c = Calendar.
                getInstance(TimeZone.getTimeZone("UTC"));
        c.setTimeInMillis(epocSeconds * MILLIS);
        return c.getTime();
    }

    public String myString() {
        return "girish";
    }

    public boolean myBool() {
        return true;
    }

}