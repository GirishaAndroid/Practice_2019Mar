package andorid.sample.practice_2019mar.DataBindingSample.utils;

public class StringUtils {

    public static String convertIntToString(int value) {
        return ("(" + String.valueOf(value) + ")");
    }

    public static String getQuantityString(int quantity) {
        return ("Qty" + String.valueOf(quantity));
    }
}
