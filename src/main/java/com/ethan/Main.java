package com.ethan;

import java.util.List;

/**
 * @author: linxiaojie
 * @create: 2019-04-23
 **/
public class Main {

    private static final int NUM_OF_PUPIL = 100;

    private static IDemo demoV1 = new DemoV1Impl();

    private static IDemo demoV2 = new DemoV2Impl();

    public static void main(String[] args) {

        System.out.println("Cheat List Version 1:");

        List<String> cheatListV1 = demoV1.getCheatList(NUM_OF_PUPIL);

        Utils.printStringList(cheatListV1);

        System.out.println("\n\n");
        System.out.println("Cheat List Version 2:");

        List<String> cheatListV2 = demoV2.getCheatList(NUM_OF_PUPIL);

        Utils.printStringList(cheatListV2);
    }

}