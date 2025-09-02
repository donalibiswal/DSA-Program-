package com.donali;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        //for loop
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int num = 0; num <= n; num++){
            System.out.print(num + " ");
            System.out.println("HELLO DONALI");
        }
         //while loop

        int m = 1;
        while(m <= 10){
            System.out.println(m);
            m+= 1;

        }

        //do-while loop

        int k = 1;
        do{
            System.out.println("donali");

        }while(k != 1);

    }
}
