package org.example;

public class Increment {
    public static void main(String[] args){
          test1();
          test2();
          test3();
    }
    //инкремент увелечение на 1
    //декремент уменьшение на 1
    private static void test1(){
        int c =0;
        System.out.println(c);     //sout(0)
        System.out.println(c + 1); //sout(0+1) //c = 0//просто возвращаем значение с.
        System.out.println(c++);   //sout(0),++, c = 1
        System.out.println(++c);   //++,sout(2), c = 2
        System.out.println(c--);   //sout(2),--, c = 1
        System.out.println(--c);   //--, sout(0),c = 0
        System.out.println(c + 1); //sout(0+1),  c = 0
        System.out.println(c);     //sout(0)
    }

    private static void test2(){
        int a = 5;
        int b = 5;

        int resultOne = 2 * ++a; //2 * 6
        int resultTwo = 2 * b++; //2 * 5

        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(a +" "+ b);

    }

    private static void test3 (){
        int c = 1;
        System.out.println(c++ + c);  //1 + 2 = 3, c = 2
        System.out.println(++c + c);  //3 + 3 = 6, c = 3
        System.out.println(c + c++);  //3 + 3 = 6, c = 4
        c += ++c + c;                 //4 += 5 + 5
        System.out.println(c);        //14
    }

}
