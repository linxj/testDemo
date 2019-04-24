package com.ethan;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: linxiaojie
 * @create: 2019-04-23
 **/
public class DemoV1Impl extends BaseDemo implements IDemo {

    public List<String> getCheatList(int num) {

        List<String> result = new ArrayList<>(num);

        for (int index = 1; index < num + 1; index++){

            boolean FizzFlag = false;
            boolean buzzFlag = false;

            if (index % FACTOR_THREE == 0) {
                FizzFlag = true;
            }

            if (index % FACTOR_FIVE == 0) {
                buzzFlag = true;
            }

            addToResult(result, index, FizzFlag, buzzFlag);
        }

        return result;
    }
}