package com.ethan;

import java.util.List;

/**
 * @author: linxiaojie
 * @create: 2019-04-24
 **/
public class Utils {

    /**
     * Print list of Strings to console
     * @param list
     */
    public static void printStringList(List<String> list) {
        for (String str: list) {
            System.out.println(str);
        }
    }

    /**
     * Check if src contains target digit
     * @param srcDigit
     * @param targetDigit
     * @return
     */
    public static boolean containsDigit(int srcDigit, int targetDigit) {

        String srcStr = srcDigit + "";
        String targetStr = targetDigit + "";

        return srcStr.contains(targetStr);
    }
}