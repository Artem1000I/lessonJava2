package org.example;

public class HomeWork_2 {
    public static void main(String[] args) {

        System.out.println(numbers(1,5));

        whole(-2);

        System.out.println (returnTrueAndFalse(-7));

        console("Указанную строка", 9);

         System.out.println(year(2022));




    }
    //Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false
    public static boolean numbers (int a, int b){
        int sum = a +b;
        if (sum >=10 && sum <20){
            return true;
        }
        return false;

       /* Написать метод, которому в качестве параметра передается целое число,
          метод должен напечатать в консоль,положительное ли число передали
          или отрицательное.Замечание: ноль считаем положительным числом.
       */
    }
    public static void whole(int pol){
        if(pol >= 0){
            System.out.println("Положительное");
        }else {
            System.out.println("Отрицательное");
        }
    }

    /*Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть
    true, если число отрицательное, и вернуть false если положительное.*/

    public static boolean returnTrueAndFalse(int seven) {
        if (seven >= 0) {
            return true;
        }
        return false;

    }
    /*Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в
    консоль указанную строку, указанное количество раз;
    */
    private static boolean console (String r , int t ){
        for (int i =0; i <t; i++){

            System.out.println(r);
        }
        return false;
    }
      /*Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
      не високосный - false). Каждый 4-й год является високосным,
      кроме каждого 100-го, при этом каждый 400-й – високосный.
      */
    public static boolean year (int year){

        if ((year % 4 ==0 && year %100 !=0)|| year % 400 ==0) {

            return true;

        }else  {
            return false;
        }


    }
}
