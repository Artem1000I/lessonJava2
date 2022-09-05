package org.example;

public class ForTest_cikl {
    public static void main(String[] args) {
        //Зацикливать операции.
        //У цикла есть тело
    /*    for (int i =0; i<10; i++){

        }*/

    /*    for (int i = 0;i<10;i++){
            System.out.println(i);
        }*/

        final int LIMIT_OF_CYCLE = 10;
/*                for(int i =0; i < LIMIT_OF_CYCLE; i++){
                    System.out.println("ВНЕШНИЙ ЦИКЛ i:" + i);
                    for (int j = 0; j < LIMIT_OF_CYCLE; j++) {
                        System.out.println("---ВНУТРЕННИЙ ЦИКЛ j:" + j);
                    }
                }

    }
        void test(){*/

        String smileStr = "";
        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
            if (i % 2 == 0){
                smileStr +="☼";
            }else {
                smileStr +="○";
            }
            System.out.print(smileStr);

            for (int j = 0; j < LIMIT_OF_CYCLE -1 -i; j++) {
                System.out.print("♦");
                
            }
            System.out.println();
        }
        for (int i = 0; i < 20; i++) {
            if (i == 16){
                break;
            }
            if (i%2 ==0){
                continue;
            }
            System.out.print(" i" + i);
        }
        System.out.println("\nEND");

    }
}
