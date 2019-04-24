package com.ethan;

import java.util.List;

/**
 * @author: linxiaojie
 * @create: 2019-04-24
 **/
public class BaseDemo {

    protected static final int FACTOR_THREE = 3;

    protected static final int FACTOR_FIVE = 5;

    protected void addToResult(List<String> result, int index, boolean fizzFlag, boolean buzzFlag) {
        if (fizzFlag && buzzFlag) {
            result.add("FizzBuzz");
        } else if (fizzFlag) {
            result.add("Fizz");
        } else if (buzzFlag) {
            result.add("Buzz");
        } else {
            result.add(index + "");
        }
    }
}