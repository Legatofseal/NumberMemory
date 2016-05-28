package com.company;

/**
 * Created by Legat on 5/27/2016.
 */


public class NumberClass {
    public static boolean isNumberByDouble(String strNumber) {
        double d;
        boolean check = false;
        try {
            d = Double.parseDouble(strNumber);
            check = true;
        } catch (NumberFormatException ex) {

        }
        return check;
    }

    public static boolean isNumberByParse(String strNumber) {
        char[] chars = strNumber.toCharArray();
        boolean check = true;

        if (strNumber.equals("")||strNumber.equals("-")) {
            check = false;
        }
        for (int i = 0; i < chars.length; i++) {

            if (!((i==0&&chars[i]=='-')||chars[i] == '0' || chars[i] == '1' || chars[i] == '2' || chars[i] == '3' || chars[i] == '4' || chars[i] == '5' || chars[i] == '6' || chars[i] == '7' || chars[i] == '8' ||
                    chars[i] == '9')) {
                check = false;

            }
        }
        return check;
    }
}
