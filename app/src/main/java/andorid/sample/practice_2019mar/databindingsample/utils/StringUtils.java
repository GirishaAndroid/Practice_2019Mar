package andorid.sample.practice_2019mar.databindingsample.utils;

public class StringUtils {

    public static String convertIntToString(int value) {
        return ("(" + String.valueOf(value) + ")");
    }

    public static String getQuantityString(int quantity) {
        return ("Qty" + String.valueOf(quantity));
    }
}
