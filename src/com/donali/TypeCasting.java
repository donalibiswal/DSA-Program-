package com.donali;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        //typecasting
        int numm = (int)(67.56f);
        System.out.println(numm);

        //automatic type promotion in expression
        int a = 257;
        byte bb = (byte)(a);
        System.out.println(bb);  //257 % 256 = 1

        int number = 'A';
        System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 8000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (f / c) - (d * s);
        //float + int - double = double

        System.out.println(result);




    }
}
