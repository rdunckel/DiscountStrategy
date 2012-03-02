package wctc.advancedjava.lab.util;


/**
 * Utility class for formatting strings with pads.
 */
public class StringFormat {

    public static String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s);
    }

    public static String padLeft(String s, int n) {
        return String.format("%1$#" + n + "s", s);
    }

    public static void main(String args[]) throws Exception {
        System.out.println(padRight("Howto", 20) + "*");
        System.out.println(padLeft("Howto", 25) + "*");
    }

}
