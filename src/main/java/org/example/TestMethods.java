package org.example;

public class TestMethods {
    public static void main(String[] args){
        boolean isPremium = rewardEmployee( "Artem",  200);
        System.out.println(isPremium);
        System.out.println(rewardEmployee( "Vlad",  500));
        System.out.println(rewardEmployee( "Kris",  1500));
        System.out.println(rewardEmployee( "Timof",  -1500));

    }


        private static boolean rewardEmployee(String name, int premium) {

        /*String name = "Артем";
        int premium = 200;*/

            if (premium < 0) {
                System.out.println("не верное значение премии");
                return false;
            }

        System.out.println("Готовим бумаги для премирования" + name);
        System.out.println("Выделяем бюджет для" + name + "на сумму" + premium);
        System.out.println("Зачисляем на карточку средства для " + name + "на сумму" + premium);
        System.out.println("Процесс завершен");
        System.out.println();


        return true;
    }

}
