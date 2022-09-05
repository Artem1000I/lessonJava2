package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class WhileTest_cikl {
    public static void main(String[] args){
        int countApples = 20;
        while (countApples > 0){
            countApples = getCounterApplesAfterEat(countApples);
            System.out.println("Яблок стало меньше" + countApples + "Штук");
        }
    }
    private static int getCounterApplesAfterEat(int countApples){
        return countApples - (ThreadLocalRandom.current().nextInt(5) + 1);
    }
}
